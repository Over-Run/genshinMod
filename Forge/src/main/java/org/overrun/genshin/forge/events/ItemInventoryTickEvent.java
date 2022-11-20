package org.overrun.genshin.forge.events;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.player.PlayerEvent;

public class ItemInventoryTickEvent extends PlayerEvent {
    private final ItemStack stack;
    private final Level level;
    private final Entity entity;
    private final int i;
    private final boolean b;

    public ItemInventoryTickEvent(ItemStack stack, Level level, Player player, int i, boolean b) {
        super(player);
        this.stack = stack;
        this.level = level;
        this.entity = player;
        this.i = i;
        this.b = b;
    }

    public ItemStack getStack() {
        return stack;
    }

    public Level getLevel() {
        return level;
    }

    public Player getEntity() {
        if (this.entity instanceof Player) {
            return (Player) this.entity;
        }
        return null;
    }

    public int getI() {
        return i;
    }

    public boolean isB() {
        return b;
    }
}
