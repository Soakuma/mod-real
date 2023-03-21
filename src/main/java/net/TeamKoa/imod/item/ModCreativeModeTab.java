package net.TeamKoa.imod.item;

import net.TeamKoa.imod.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab I_TAB = new CreativeModeTab("Imod") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.RUBY.get());
        }

    public static final CreativeModeTab I_TAB2 = new CreativeModeTab("Imod Block") {
        @Override
        public ItemStack makeIcon() { return new ItemStack(ModBlocks.HIHIIROKANE_ORE.get()); }
        };
    };
}
