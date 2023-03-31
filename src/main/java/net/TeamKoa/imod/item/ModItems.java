package net.TeamKoa.imod.item;

import net.TeamKoa.imod.IMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.resources.ResourceLocation;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, IMod.MOD_ID);


    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.I_TAB)));
    public static final RegistryObject<Item> AMETHYSTLIZED_DIAMOND = ITEMS.register("amethystlized_diamond",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.I_TAB)));
    public static final RegistryObject<Item> HIHIIROKANE_INGOT = ITEMS.register("hihiirokane_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.I_TAB)));
    public static final RegistryObject<Item> BAD_APPLE_DISC = ITEMS.register("bad_apple",
            () -> new RecordItem(0, ()-> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("imod:bad_apple")), new Item.Properties().tab(ModCreativeModeTab.I_TAB).stacksTo(1).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> BAD_APPLE_04 = ITEMS.register("bad_apple_th04",
            () -> new RecordItem(0, ()-> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("imod:bad_apple_th04")), new Item.Properties().tab(ModCreativeModeTab.I_TAB).stacksTo(1).rarity(Rarity.RARE)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
