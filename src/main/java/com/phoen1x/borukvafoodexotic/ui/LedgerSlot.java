package com.phoen1x.borukvafoodexotic.ui;

import com.phoen1x.borukvafoodexotic.utils.BorukvaFoodExoticUtil;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.slot.Slot;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.math.BlockPos;

public class LedgerSlot extends Slot{
    public final ServerPlayerEntity player;
    public final BlockPos pos;

    public LedgerSlot(BlockPos pos, ServerPlayerEntity player, Inventory inventory, int index, int x, int y) {
        super(inventory, index, x, y);
        this.pos = pos;
        this.player = player;
    }

    @Override
    public void setStackNoCallbacks(ItemStack stack) {
        if (!stack.isEmpty()) {
            BorukvaFoodExoticUtil.ledgerMixinInvoke();
        }
        super.setStackNoCallbacks(stack);
    }

    @Override
    public void markDirty() {
        super.markDirty();
    }

    @Override
    public void onTakeItem(PlayerEntity player, ItemStack stack) {
        BorukvaFoodExoticUtil.ledgerMixinInvoke();
        super.onTakeItem(player, stack);
    }
}
