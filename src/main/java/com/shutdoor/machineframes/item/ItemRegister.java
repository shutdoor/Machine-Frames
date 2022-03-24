package com.shutdoor.machineframes.item;

import com.shutdoor.machineframes.MachineFrames;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegister {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MachineFrames.MODID);


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
