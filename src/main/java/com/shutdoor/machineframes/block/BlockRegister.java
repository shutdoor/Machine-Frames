package com.shutdoor.machineframes.block;

import com.shutdoor.machineframes.MachineFrames;
import com.shutdoor.machineframes.item.ItemRegister;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class BlockRegister {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MachineFrames.MODID);

    public static void blockCreator(){
                final RegistryObject<Block> TIER_1 = registerBlock("tier_1",
                        () -> new Block(AbstractBlock.Properties.create(Material.IRON)
                                .harvestTool(ToolType.PICKAXE).setRequiresTool().hardnessAndResistance(1f).harvestLevel(1)));
                final RegistryObject<Block> TIER_2 = registerBlock("tier_2",
                        () -> new Block(AbstractBlock.Properties.create(Material.IRON)
                                .harvestTool(ToolType.PICKAXE).setRequiresTool().hardnessAndResistance(1f).harvestLevel(1)));
                final RegistryObject<Block> TIER_3 = registerBlock("tier_3",
                        () -> new Block(AbstractBlock.Properties.create(Material.IRON)
                                .harvestTool(ToolType.PICKAXE).setRequiresTool().hardnessAndResistance(1f).harvestLevel(1)));
                final RegistryObject<Block> TIER_4 = registerBlock("tier_4",
                        () -> new Block(AbstractBlock.Properties.create(Material.IRON)
                                .harvestTool(ToolType.PICKAXE).setRequiresTool().hardnessAndResistance(1f).harvestLevel(1)));
                final RegistryObject<Block> TIER_5 = registerBlock("tier_5",
                        () -> new Block(AbstractBlock.Properties.create(Material.IRON)
                                .harvestTool(ToolType.PICKAXE).setRequiresTool().hardnessAndResistance(1f).harvestLevel(1)));
                final RegistryObject<Block> TIER_6 = registerBlock("tier_6",
                        () -> new Block(AbstractBlock.Properties.create(Material.IRON)
                                .harvestTool(ToolType.PICKAXE).setRequiresTool().hardnessAndResistance(1f).harvestLevel(1)));
    }

    public static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block){
        ItemRegister.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().group(ItemGroup.MISC)));
    }

    public static void register(IEventBus eventBus){
        blockCreator();
        BLOCKS.register(eventBus);
    }

}
