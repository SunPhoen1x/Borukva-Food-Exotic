package com.phoen1x.borukvafoodexotic.block.rack;

import com.mojang.serialization.MapCodec;
import com.opryshok.block.ModBlocks;
import com.phoen1x.borukvafoodexotic.BorukvaFoodExotic;
import com.phoen1x.borukvafoodexotic.entity.PineRackBlockEntity;
import com.phoen1x.borukvafoodexotic.entity.RackBlockEntity;
import com.phoen1x.borukvafoodexotic.utils.TransparentBlocks.TransparentTripWire;
import eu.pb4.factorytools.api.block.FactoryBlock;
import eu.pb4.factorytools.api.resourcepack.BaseItemProvider;
import eu.pb4.factorytools.api.virtualentity.BlockModel;
import eu.pb4.factorytools.api.virtualentity.ItemDisplayElementUtil;
import eu.pb4.polymer.virtualentity.api.ElementHolder;
import eu.pb4.polymer.virtualentity.api.elements.ItemDisplayElement;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.SidedInventory;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Identifier;
import net.minecraft.util.ItemScatterer;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import org.jetbrains.annotations.Nullable;
import org.joml.Vector3f;

public class PineRack extends BlockWithEntity implements TransparentTripWire, FactoryBlock, BlockEntityProvider, InventoryProvider {
    public static final BooleanProperty LIT;
    public static final DirectionProperty FACING;
    public static final MapCodec<PineRack> CODEC;
    private Model model;

    static {
        FACING = Properties.HORIZONTAL_FACING;
        LIT = Properties.LIT;
        CODEC = createCodec(PineRack::new);
    }

    public PineRack(Settings settings) {
        super(settings.nonOpaque());
        this.setDefaultState(getDefaultState().with(LIT, false));
    }

    @Override
    public BlockState getPolymerBreakEventBlockState(BlockState state, ServerPlayerEntity player) {
        return Blocks.IRON_TRAPDOOR.getDefaultState();
    }

    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        World world = ctx.getWorld();
        BlockState stoveState = world.getBlockState(ctx.getBlockPos().down());
        if (stoveState.isOf(ModBlocks.STOVE)) {
            return this.getDefaultState().with(LIT, stoveState.get(LIT)).with(FACING, ctx.getHorizontalPlayerFacing());
        }
        return this.getDefaultState().with(LIT, false).with(FACING, ctx.getHorizontalPlayerFacing());
    }

    @Override
    protected MapCodec<? extends BlockWithEntity> getCodec() {
        return CODEC;
    }

    @Override
    public BlockState getPolymerBlockState(BlockState state) {
        return Blocks.BARRIER.getDefaultState();
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new PineRackBlockEntity(pos, state);
    }

    @Override
    public SidedInventory getInventory(BlockState state, WorldAccess world, BlockPos pos) {
        var inv = world.getBlockEntity(pos);
        return inv instanceof SidedInventory ? (SidedInventory) inv : null;
    }

    @Override
    protected void onStateReplaced(BlockState state, World world, BlockPos pos, BlockState newState, boolean moved) {
        ItemScatterer.onStateReplaced(state, newState, world, pos);
        super.onStateReplaced(state, world, pos, newState, moved);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING, LIT);
        super.appendProperties(builder);
    }

    @Override
    public @Nullable ElementHolder createElementHolder(ServerWorld world, BlockPos pos, BlockState initialBlockState) {
        model = new Model(initialBlockState, world, pos);
        return model;
    }

    @Override
    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        if (!player.isSneaking() && world.getBlockEntity(pos) instanceof PineRackBlockEntity entity) {
            entity.openGui((ServerPlayerEntity) player);
            return ActionResult.SUCCESS;
        }
        return super.onUse(state, world, pos, player, hit);
    }


    @Override
    public boolean tickElementHolder(ServerWorld world, BlockPos pos, BlockState initialBlockState) {
        this.model.tick();
        return true;
    }

    public static final class Model extends BlockModel {
        public static final ItemStack MODEL = BaseItemProvider.requestModel(Identifier.of(BorukvaFoodExotic.MOD_ID, "block/pine_rack"));
        public ItemDisplayElement[] items = new ItemDisplayElement[9];
        public ItemDisplayElement pine_rack;
        public ServerWorld world;
        public BlockPos pos;


        public Model(BlockState state, ServerWorld world, BlockPos pos) {
            this.world = world;
            this.pos = pos;
            init(state);
        }

        public void init(BlockState state) {
            this.pine_rack = ItemDisplayElementUtil.createSimple(MODEL);
            this.pine_rack.setTranslation(new Vector3f(0, 0, 0));
            this.pine_rack.setScale(new Vector3f(2f));
            this.pine_rack.setDisplaySize(1f, 1f);
            this.addElement(pine_rack);

            for (int i = 0; i < 9; i++) {
                var item = ItemDisplayElementUtil.createSimple();
                item.setDisplaySize(1, 1);
                item.setScale(new Vector3f(0.5f));
                item.setPitch(90f);
                items[i] = item;
            }
            items[8].setTranslation(new Vector3f(-0.31f, -0.3f, 0.3f));
            items[7].setTranslation(new Vector3f(0f, -0.3f, 0.3f));
            items[6].setTranslation(new Vector3f(0.31f, -0.3f, 0.3f));

            items[5].setTranslation(new Vector3f(-0.31f, -0.3f, 0f));
            items[4].setTranslation(new Vector3f(0f, -0.3f, 0f));
            items[3].setTranslation(new Vector3f(0.31f, -0.3f, 0f));

            items[2].setTranslation(new Vector3f(-0.31f, -0.3f, -0.3f));
            items[1].setTranslation(new Vector3f(0f, -0.3f, -0.3f));
            items[0].setTranslation(new Vector3f(0.31f, -0.3f, -0.3f));

            for (var item : items) {
                this.addElement(item);
                this.updateStatePos(state);
            }
        }

        private void updateStatePos(BlockState state) {
            var direction = state.get(FACING);
            var yaw = direction.asRotation();

            this.pine_rack.setYaw(yaw);
            this.pine_rack.setPitch(180f);

            for (var item : this.items) {
                item.setYaw(yaw);
                item.setPitch(90f);
            }
        }


        public void setItem(int i, ItemStack stack) {
            this.items[i].setItem(stack.copy());
            this.items[i].tick();
        }

        public void updateItems(DefaultedList<ItemStack> stacks) {
            for (int i = 0; i < 9; i++) {
                setItem(i, stacks.get(i));
            }
        }
    }
}
