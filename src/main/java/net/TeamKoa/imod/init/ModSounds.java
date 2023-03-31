package net.TeamKoa.imod.init;

import net.TeamKoa.imod.IMod;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.RecordItem;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, IMod.MOD_ID);
    public static final RegistryObject<SoundEvent> BAD_APPLE_DISC = REGISTRY.register("bad_apple", () -> new SoundEvent(new ResourceLocation("imod", "bad_apple")));
    public static final RegistryObject<SoundEvent> BAD_APPLE_04 = REGISTRY.register("bad_apple_th04", () -> new SoundEvent(new ResourceLocation("imod", "bad_apple_th04")));
}

