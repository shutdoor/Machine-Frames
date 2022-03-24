package com.shutdoor.machineframes.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

import java.util.function.Supplier;

public class ItemBase extends Item{
    private final Supplier<Boolean> isDisabled;

    public ItemBase() {
        this(new Item.Properties(), () -> false);
    }

    public ItemBase(Supplier<Boolean> isDisabled) {
        this(new Item.Properties(), isDisabled);
    }
    public ItemBase(Item.Properties properties) {
        this(properties, () -> false);
    }
    public ItemBase(Item.Properties properties, Supplier<Boolean> isDisabled) {
        super(properties.group(ItemGroup.MISC));
        this.isDisabled = isDisabled;
    }

    @Override
    public void fillItemGroup(ItemGroup group, NonNullList<ItemStack> items) {
        if (Boolean.TRUE.equals(isDisabled.get())) {
            return;
        }
        super.fillItemGroup(group, items);
    }
}
