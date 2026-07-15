package net.breadguy.createmilitarized.item;

import net.breadguy.createmilitarized.CreateMilitarized;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CreateMilitarized.MODID);

    public static final DeferredItem<Item> STEEL_INGOT = ITEMS.register("steel_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STEEL_SHEET = ITEMS.register("steel_sheet",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STEEL_MIXTURE = ITEMS.register("steel_mixture",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> UNFINISHED_CIRCUIT = ITEMS.register("unfinished_circuit",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CIRCUIT = ITEMS.register("circuit",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SULFUR = ITEMS.register("sulfur",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
