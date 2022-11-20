package org.overrun.genshin.forge.events;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.ForgeEventFactory;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.item.ItemEvent;

public class Event {
    public static ItemInventoryTickEvent inventoryTickEvent(ItemStack stack, Level level, Player entity, int i, boolean b) {
        ItemInventoryTickEvent event = new ItemInventoryTickEvent(stack, level, entity, i, b);
        MinecraftForge.EVENT_BUS.post(event);
        return event;
    }
}
