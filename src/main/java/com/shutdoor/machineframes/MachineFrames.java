package com.shutdoor.machineframes;

import com.shutdoor.machineframes.block.BlockRegister;
import com.shutdoor.machineframes.item.ItemRegister;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod(MachineFrames.MODID)
public class MachineFrames
{
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID = "machineframes";

    public MachineFrames() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemRegister.register(modEventBus);
        BlockRegister.register(modEventBus);

        modEventBus.addListener(this::setup);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        LOGGER.info("Machine Frames Setup Start.");
    }
}
