package net.michel.testmod.item;

import net.michel.testmod.TestMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TestMod.MOD_ID);

    public static final RegistryObject<Item> ZIRCON = ITEMS.register("zircon",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MODDEDTAB)));

    public static final RegistryObject<Item> ZIRAM = ITEMS.register("ziram",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MODDEDTAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
