package net.TeamKoa.imod.item;

import net.TeamKoa.imod.IMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, IMod.MOD_ID);

    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.I_TAB)));
    public static final RegistryObject<Item> AMETHYSTLIZED_DIAMOND = ITEMS.register("amethystlized_diamond",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.I_TAB)));
    public static final RegistryObject<Item> HIHIIROKANE = ITEMS.register("hihiirokane",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.I_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
