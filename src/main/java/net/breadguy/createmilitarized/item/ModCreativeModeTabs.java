package net.breadguy.createmilitarized.item;

import net.breadguy.createmilitarized.CreateMilitarized;
import net.breadguy.createmilitarized.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreateMilitarized.MODID);

    public static final Supplier<CreativeModeTab> CREATE_MILITARIZED_TAB = CREATIVE_MODE_TAB.register("create_militarized_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.STEEL_INGOT.get()))
                    .title(Component.translatable("creativetab.createmilitarized.create_militarized_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.STEEL_BLOCK);
                        output.accept(ModItems.STEEL_INGOT);
                        output.accept(ModItems.STEEL_SHEET);
                        output.accept(ModItems.STEEL_MIXTURE);
                        output.accept(ModItems.COPPER_WIRE);
                        output.accept(ModItems.CAPACITOR);
                        output.accept(ModItems.SULFUR);
                        output.accept(ModBlocks.BRIMSTONE);
                        output.accept(ModBlocks.POLISHED_BRIMSTONE);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
