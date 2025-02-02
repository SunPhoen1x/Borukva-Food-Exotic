package com.phoen1x.borukvafoodexotic.entity;

import com.opryshok.BorukvaFood;
import com.opryshok.ui.FuelSlot;
import com.opryshok.ui.GuiTextures;
import com.phoen1x.borukvafoodexotic.BorukvaFoodExotic;
import com.phoen1x.borukvafoodexotic.block.grill.Grill;
import com.phoen1x.borukvafoodexotic.polydex.PolydexCompat;
import com.phoen1x.borukvafoodexotic.recipe.ModRecipeTypes;
import com.phoen1x.borukvafoodexotic.recipe.grill.GrillInput;
import com.phoen1x.borukvafoodexotic.recipe.grill.GrillRecipe;
import com.phoen1x.borukvafoodexotic.sounds.SoundRegistry;
import com.phoen1x.borukvafoodexotic.ui.LedgerSimpleGui;
import com.phoen1x.borukvafoodexotic.ui.LedgerSlot;
import com.phoen1x.borukvafoodexotic.utils.BorukvaFoodExoticUtil;
import com.phoen1x.borukvafoodexotic.utils.MinimalSidedInventory;
import eu.pb4.factorytools.api.advancement.TriggerCriterion;
import eu.pb4.factorytools.api.block.BlockEntityExtraListener;
import eu.pb4.factorytools.api.block.entity.LockableBlockEntity;
import eu.pb4.polymer.virtualentity.api.attachment.BlockAwareAttachment;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.FurnaceBlockEntity;
import net.minecraft.inventory.Inventories;
import net.minecraft.inventory.SidedInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.recipe.RecipeEntry;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.state.property.Properties;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.ItemScatterer;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraft.world.chunk.WorldChunk;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.Objects;

public class GrillEntity extends LockableBlockEntity implements MinimalSidedInventory, SidedInventory, BlockEntityExtraListener {
    private static final int[] SLOTS = new int[]{0, 1, 2, 3, 4};
    public float state = 0;
    public boolean active;
    public int fuelTicks = 0;
    public int fuelInitial = 1;
    private int soundTicks = 20;
    private final DefaultedList<ItemStack> items = DefaultedList.ofSize(5, ItemStack.EMPTY);
    private final HashMap<Integer, Integer> slotTick = new HashMap<>();
    {
        slotTick.put(1, 0);
        slotTick.put(2, 0);
        slotTick.put(3, 0);
        slotTick.put(4, 0);
    }
    @SuppressWarnings("unchecked")
    protected RecipeEntry<GrillRecipe>[] currentRecipes = (RecipeEntry<GrillRecipe>[]) new RecipeEntry[5];
    private Grill.Model model;
    public GrillEntity(BlockPos blockPos, BlockState blockState) {
        super(ModEntities.GRILL, blockPos, blockState);
    }

    @Override
    public DefaultedList<ItemStack> getStacks() {
        return items;
    }

    public static <T extends BlockEntity> void tick(World world, BlockPos pos, BlockState state, T t) {
        var self = (GrillEntity) t;
        if (t instanceof GrillEntity) {
            self.active = state.get(Properties.LIT);
            boolean hasItems = self.items.stream().anyMatch(stack -> !stack.isEmpty() && !stack.isOf(Items.AIR));
            boolean isCooking = false;

            if (self.active && hasItems) {
                for (int i = 0; i < self.items.size(); i++) {
                    if (i == 4) continue;
                    ItemStack stack = self.items.get(i);
                    RecipeEntry<GrillRecipe> currentRecipe = self.currentRecipes[i];

                    if (currentRecipe == null || !currentRecipe.value().matches(new GrillInput(stack, world), world)) {
                        self.currentRecipes[i] = world.getRecipeManager()
                                .getFirstMatch(ModRecipeTypes.GRILL, new GrillInput(stack, world), world)
                                .orElse(null);
                        self.slotTick.put(i, 0);
                    }

                    if (self.currentRecipes[i] != null) {
                        int tickCount = self.slotTick.getOrDefault(i, 0);
                        double recipeTime = self.currentRecipes[i].value().time();

                        if (tickCount >= recipeTime * stack.getCount()) {
                            ItemStack result = self.currentRecipes[i].value()
                                    .craft(new GrillInput(stack, world), world.getRegistryManager())
                                    .copyWithCount(stack.getCount());
                            self.items.set(i, result);
                            self.slotTick.put(i, 0);
                            self.currentRecipes[i] = null;
                            self.model.updateItems(self.items);
                        } else {
                            self.slotTick.put(i, tickCount + 1);
                            isCooking = true;
                        }
                    } else {
                        self.slotTick.put(i, 0);
                    }
                }

                if (isCooking && self.soundTicks >= 20) {
                    world.playSound(null, pos, SoundRegistry.GRILL_FRYING, SoundCategory.BLOCKS, 1f, 1f);
                    self.soundTicks = 0;
                } else {
                    self.soundTicks++;
                }
            }
        }
        if (self.fuelTicks > 0) {
            self.fuelTicks -= MathHelper.lerp(self.state, 40, 16);
            self.state = (float) Math.min(self.state + 0.005, 1);

            if (!state.get(Grill.LIT)) {
                world.setBlockState(pos, state.with(Grill.LIT, true));
            }
            self.markDirty();

        } else {
            for (int i = 0; i < 1; i++) {
                var stack = self.getStack(i);
                if (!stack.isEmpty()) {
                    var value = FuelRegistry.INSTANCE.get(stack.getItem());
                    if (value != null) {
                        var remainder = stack.getRecipeRemainder();
                        stack.decrement(1);
                        self.fuelTicks = value * 10;
                        self.fuelInitial = self.fuelTicks;
                        if (stack.isEmpty()) {
                            self.setStack(i, ItemStack.EMPTY);
                        }

                        if (!remainder.isEmpty()) {
                            BorukvaFoodExoticUtil.tryInsertingRegular(self, remainder);
                            if (!remainder.isEmpty()) {
                                ItemScatterer.spawn(world, pos.getX() + 0.5, pos.getY(), pos.getZ() + 0.5, remainder);
                            }
                        }

                        self.markDirty();
                        return;
                    }
                }
            }
            if (self.state != 0) {
                self.state = (float) Math.max(self.state - 0.02, 0);
                self.markDirty();
            }
            if (state.get(Grill.LIT)) {
                world.setBlockState(pos, state.with(Grill.LIT, false));
            }

        }
    }

    @Override
    public void markDirty() {
        super.markDirty();
        if (this.model != null) {
            this.model.updateItems(this.getStacks());
        }
    }

    @Override
    public int[] getAvailableSlots(Direction side) {
        return SLOTS;
    }

    @Override
    public boolean canInsert(int slot, ItemStack stack, @Nullable Direction dir) {
        return FurnaceBlockEntity.canUseAsFuel(stack);
    }

    @Override
    public ItemStack removeStack(int slot) {
        return MinimalSidedInventory.super.removeStack(slot);
    }

    @Override
    public ItemStack removeStack(int slot, int amount) {
        return MinimalSidedInventory.super.removeStack(slot, amount);
    }

    @Override
    public boolean canExtract(int slot, ItemStack stack, Direction dir) {
        return true;
    }

    @Override
    public void onListenerUpdate(WorldChunk chunk) {
        try {
            this.model = (Grill.Model) Objects.requireNonNull(BlockAwareAttachment.get(chunk, this.getPos())).holder();
            this.model.updateItems(this.items);
        } catch (Throwable e) {
            BorukvaFoodExotic.LOGGER.debug("error: ", e);
        }
    }

    @Override
    protected void writeNbt(NbtCompound nbt, RegistryWrapper.WrapperLookup lookup) {
        Inventories.writeNbt(nbt, this.items, lookup);
        nbt.putInt("FuelTicks", this.fuelTicks);
        nbt.putInt("FuelInitial", this.fuelInitial);
        nbt.putFloat("State", this.state);
        super.writeNbt(nbt, lookup);
    }

    @Override
    public void readNbt(NbtCompound nbt, RegistryWrapper.WrapperLookup lookup) {
        Inventories.readNbt(nbt, items, lookup);
        this.fuelInitial = nbt.getInt("FuelInitial");
        this.fuelTicks = nbt.getInt("FuelTicks");
        this.state = nbt.getFloat("State");
        super.readNbt(nbt, lookup);
        if (this.model != null) {
            this.model.updateItems(this.getStacks());
        }
    }

    @Override
    protected void createGui(ServerPlayerEntity playerEntity) {
        new GrillEntity.Gui(playerEntity);
    }

    private class Gui extends LedgerSimpleGui {
        private boolean active;

        public Gui(ServerPlayerEntity player) {
            super(ScreenHandlerType.GENERIC_9X3, player, false);
            this.setSlot(0, PolydexCompat.getButton(ModRecipeTypes.GRILL));
            this.setTitle(com.phoen1x.borukvafoodexotic.ui.GuiTextures.GRILL.apply(Text.translatable("block.borukva-food-exotic.grill")));
            this.setSlotRedirect(22, new FuelSlot(pos, player, GrillEntity.this, 0, 0, 0));
            this.setSlotRedirect(3, new LedgerSlot(pos, player, GrillEntity.this, 1, 1, 0));
            this.setSlotRedirect(4, new LedgerSlot(pos, player, GrillEntity.this,  2, 2, 0));
            this.setSlotRedirect(5, new LedgerSlot(pos, player, GrillEntity.this, 3, 3, 0));
            this.setSlotRedirect(26, new LedgerSlot(pos, player, GrillEntity.this, 4, 4, 0));
            this.setSlot(13, com.opryshok.ui.GuiTextures.FLAME.get(progress()));
            this.active = GrillEntity.this.fuelTicks > 0;
            this.open();
        }

        private float progress() {
            return GrillEntity.this.fuelInitial > 0
                    ? MathHelper.clamp(GrillEntity.this.fuelTicks / (float) GrillEntity.this.fuelInitial, 0, 1)
                    : 0;
        }

        @Override
        public void onTick() {
            if (player.getPos().squaredDistanceTo(Vec3d.ofCenter(GrillEntity.this.pos)) > (18 * 18)) {
                this.close();
            }



            var active = GrillEntity.this.fuelTicks > 0;
            if (!this.active && active) {
                this.active = true;
                TriggerCriterion.trigger(player, Identifier.of(BorukvaFood.MOD_ID, "fuel_stove"));
            }
            this.setSlot(13, GuiTextures.FLAME.get(progress()));
            super.onTick();
        }
    }
}