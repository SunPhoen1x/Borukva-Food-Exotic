package com.phoen1x.borukvafoodexotic.block.grill;

import com.mojang.serialization.MapCodec;
import com.phoen1x.borukvafoodexotic.BorukvaFoodExotic;
import com.phoen1x.borukvafoodexotic.block.ModBlocks;
import com.phoen1x.borukvafoodexotic.entity.GrillEntity;
import eu.pb4.factorytools.api.block.FactoryBlock;
import eu.pb4.factorytools.api.resourcepack.BaseItemProvider;
import eu.pb4.factorytools.api.virtualentity.BlockModel;
import eu.pb4.factorytools.api.virtualentity.ItemDisplayElementUtil;
import eu.pb4.polymer.virtualentity.api.ElementHolder;
import eu.pb4.polymer.virtualentity.api.attachment.BlockBoundAttachment;
import eu.pb4.polymer.virtualentity.api.attachment.HolderAttachment;
import eu.pb4.polymer.virtualentity.api.elements.ItemDisplayElement;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.SidedInventory;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import org.jetbrains.annotations.Nullable;
import org.joml.Vector3f;

public class Grill extends BlockWithEntity implements FactoryBlock, BlockEntityProvider, InventoryProvider {
    public static final MapCodec<Grill> CODEC;
    public static final BooleanProperty LIT;
    public static final DirectionProperty FACING;
    private Model model;

    static{
        FACING = Properties.HORIZONTAL_FACING;
        LIT = Properties.LIT;
        CODEC = createCodec(Grill::new);
    }
    public Grill(Settings settings) {
        super(settings.nonOpaque());
        this.setDefaultState(getDefaultState().with(LIT, false));
    }

    @Override
    public BlockState getPolymerBreakEventBlockState(BlockState state, ServerPlayerEntity player) {
        return Blocks.CYAN_TERRACOTTA.getDefaultState();
    }

    @Override
    protected MapCodec<? extends BlockWithEntity> getCodec() {
        return CODEC;
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
        return GrillEntity::tick;
    }

    @Override
    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        if (!player.isSneaking() && world.getBlockEntity(pos) instanceof GrillEntity entity) {
            entity.openGui((ServerPlayerEntity) player);
            return ActionResult.SUCCESS;
        }
        return super.onUse(state, world, pos, player, hit);
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new GrillEntity(pos, state);
    }

    @Override
    public SidedInventory getInventory(BlockState state, WorldAccess world, BlockPos pos) {
        var inv = world.getBlockEntity(pos);
        return inv instanceof SidedInventory ? (SidedInventory) inv : null;
    }

    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        World world = ctx.getWorld();
        BlockState stoveState = world.getBlockState(ctx.getBlockPos().down());
        if (stoveState.isOf(com.opryshok.block.ModBlocks.STOVE)) {
            return this.getDefaultState().with(LIT, stoveState.get(LIT)).with(FACING, ctx.getHorizontalPlayerFacing());
        }
        return this.getDefaultState().with(LIT, false).with(FACING, ctx.getHorizontalPlayerFacing());
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(LIT, FACING);
        super.appendProperties(builder);
    }

    @Override
    public @Nullable ElementHolder createElementHolder(ServerWorld world, BlockPos pos, BlockState initialBlockState) {
        model = new Model(initialBlockState, world, pos);
        return model;
    }

    @Override
    public boolean tickElementHolder(ServerWorld world, BlockPos pos, BlockState initialBlockState) {
        this.model.tick();
        return true;
    }

    @Override
    public BlockState onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        return super.onBreak(world, pos, state, player);
    }

    @Override
    public BlockState getPolymerBlockState(BlockState state) {
        return Blocks.BARRIER.getDefaultState();
    }

    public static final class Model extends BlockModel{
        public static final ItemStack LIT_FALSE = BaseItemProvider.requestModel(Identifier.of(BorukvaFoodExotic.MOD_ID, "block/grill"));
        public static final ItemStack LIT_TRUE = BaseItemProvider.requestModel(Identifier.of(BorukvaFoodExotic.MOD_ID, "block/grill_on"));

        public ItemDisplayElement[] items = new ItemDisplayElement[4];
        public ItemDisplayElement grill;
        public ServerWorld world;
        public BlockPos pos;
        public int tickCounter = 0;

        public Model(BlockState state, ServerWorld world, BlockPos pos) {
            this.world = world;
            this.pos = pos;
            init(state);
        }
        public void init(BlockState state){
            this.grill = state.get(LIT) ? ItemDisplayElementUtil.createSimple(LIT_TRUE) : ItemDisplayElementUtil.createSimple(LIT_FALSE);
            this.grill.setScale(new Vector3f(0.42f));
            this.grill.setTranslation(new Vector3f(-0.05f, -0.05f, -0.4f));
            this.updateStatePos(state);
            this.addElement(grill);
            for (int i = 0; i < 4; i++) {
                var item = ItemDisplayElementUtil.createSimple();
                item.setDisplaySize(1, 1);
                item.setScale(new Vector3f(0.3f));
                item.setPitch(90f);
                items[i] = item;
            }
            items[0].setTranslation(new Vector3f(0, 0, 0.2f));
            items[1].setTranslation(new Vector3f(-0.15f, 0.15f, 0.45f));
            items[2].setTranslation(new Vector3f(0.15f, 0.15f, 0.45f));
            items[3].setTranslation(new Vector3f(0f, -0.15f, 0.45f));
            for (var item : items) {
                this.addElement(item);
                this.updateStatePos(state);
            }
        }

        private void updateStatePos(BlockState state) {
            var direction = state.get(FACING);
            var yaw = direction.asRotation();
            this.grill.setYaw(yaw);
            this.grill.setPitch(270f);

            for (var item : this.items) {
                if (item != null) {
                    item.setYaw(yaw+180);
                    item.setPitch(-90f);
                }
            }
        }

        public void setItem(int i, ItemStack stack) {
            this.items[i].setItem(stack.copy());
            this.items[i].tick();
        }

        public void updateItems(DefaultedList<ItemStack> stacks) {
            for (int i = 0; i < 4; i++) {
                setItem(i, stacks.get(i));
            }
        }

        @Override
        protected void onTick() {
            if (tickCounter >= 100) {
                spawnParticles(pos);
                tickCounter = 0;
            } else {
                tickCounter++;
            }
        }

        private void spawnParticles(BlockPos pos) {
            if (world.getBlockState(pos).isOf(ModBlocks.GRILL)) {
                if (world.getBlockState(pos).get(LIT)) {
                    for (int i = 0; i < 4; i++) {
                        world.spawnParticles(ParticleTypes.CAMPFIRE_COSY_SMOKE,
                                pos.getX() + 0.5,
                                pos.getY() + 1.75,
                                pos.getZ() + 0.5,
                                1, 0.15, 0.4, 0.15, 0);
                    }
                }
            }
        }

        private void updateItem(BlockState state) {
            this.removeElement(this.grill);
            init(state);
        }
        @Override
        public void notifyUpdate(HolderAttachment.UpdateType updateType) {
            if (updateType == BlockBoundAttachment.BLOCK_STATE_UPDATE){
                updateItem(this.blockState());
            }
            super.notifyUpdate(updateType);
        }
    }
}