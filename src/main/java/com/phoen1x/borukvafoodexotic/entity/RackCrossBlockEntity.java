package com.phoen1x.borukvafoodexotic.entity;

import com.opryshok.ui.LedgerSimpleGui;
import com.opryshok.ui.LedgerSlot;
import com.opryshok.utils.MinimalSidedInventory;
import com.phoen1x.borukvafoodexotic.BorukvaFoodExotic;
import com.phoen1x.borukvafoodexotic.block.rack.RackCross;
import com.phoen1x.borukvafoodexotic.ui.GuiTextures;
import eu.pb4.factorytools.api.block.BlockEntityExtraListener;
import eu.pb4.factorytools.api.block.entity.LockableBlockEntity;
import eu.pb4.polymer.virtualentity.api.attachment.BlockAwareAttachment;
import net.minecraft.block.BlockState;
import net.minecraft.inventory.Inventories;
import net.minecraft.inventory.SidedInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.chunk.WorldChunk;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.Objects;


public class RackCrossBlockEntity extends LockableBlockEntity implements MinimalSidedInventory, BlockEntityExtraListener, SidedInventory{
    private static final int[] SLOTS =  new int[]{0, 1, 2, 3};
    private final DefaultedList<ItemStack> items = DefaultedList.ofSize(4, ItemStack.EMPTY);
    private final HashMap<Integer, Integer> slotTick = new HashMap<>();
    {
        slotTick.put(0, 0);
        slotTick.put(1, 0);
        slotTick.put(2, 0);
        slotTick.put(3, 0);
    }

    @SuppressWarnings("unchecked")
    private RackCross.Model model;
    public RackCrossBlockEntity(BlockPos blockPos, BlockState blockState) {
        super(ModEntities.RACK_CROSS, blockPos, blockState);
    }
    @Override
    protected void writeNbt(NbtCompound nbt, RegistryWrapper.WrapperLookup lookup) {
        super.writeNbt(nbt, lookup);
        Inventories.writeNbt(nbt, this.items, lookup);
    }

    @Override
    public void readNbt(NbtCompound nbt, RegistryWrapper.WrapperLookup lookup) {
        super.readNbt(nbt, lookup);
        Inventories.readNbt(nbt, this.items, lookup);
        if (this.model != null) {
            this.model.updateItems(this.getStacks());
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
    public DefaultedList<ItemStack> getStacks() {
        return items;
    }
    @Override
    public int[] getAvailableSlots(Direction side) {
        return SLOTS;
    }

    @Override
    public boolean canInsert(int slot, ItemStack stack, @Nullable Direction dir) {
        return true;
    }

    @Override
    public boolean canExtract(int slot, ItemStack stack, Direction dir) {
        return true;
    }

    @Override
    protected void createGui(ServerPlayerEntity playerEntity) {
        new RackCrossBlockEntity.Gui(playerEntity);
    }

    @Override
    public void onListenerUpdate(WorldChunk chunk) {
        try {
            this.model = (RackCross.Model) Objects.requireNonNull(BlockAwareAttachment.get(chunk, this.getPos())).holder();
            this.model.updateItems(this.items);
        } catch (Throwable e) {
            BorukvaFoodExotic.LOGGER.debug("error: ", e);
        }
    }

    public class Gui extends LedgerSimpleGui {
        public Gui(ServerPlayerEntity player) {
            super(ScreenHandlerType.GENERIC_9X3, player, false);
            this.setTitle(GuiTextures.RACK_CROSS.apply(Text.translatable("block.borukva-food-exotic.rack_cross")));
            this.setSlotRedirect(4, new LedgerSlot(pos, player, RackCrossBlockEntity.this, 0, 0, 0));
            this.setSlotRedirect(12, new LedgerSlot(pos, player, RackCrossBlockEntity.this,  1, 1, 0));
            this.setSlotRedirect(14, new LedgerSlot(pos, player, RackCrossBlockEntity.this, 2, 2, 0));
            this.setSlotRedirect(22, new LedgerSlot(pos, player, RackCrossBlockEntity.this, 3, 3, 0));
            this.open();
        }
        @Override
        public void onTick() {
            if (player.getPos().squaredDistanceTo(Vec3d.ofCenter(RackCrossBlockEntity.this.pos)) > (18 * 18)) {
                this.close();
            }
            super.onTick();
        }
    }
}
