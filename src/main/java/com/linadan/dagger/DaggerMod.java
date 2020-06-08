package com.linadan.dagger;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.linadan.dagger.util.RegistryHandler;
import com.linadan.dagger.world.gen.ModOreGen;

import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("daggermod")
@Mod.EventBusSubscriber(modid = DaggerMod.MOD_ID, bus = Bus.MOD)
public class DaggerMod
{
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();
    
    public static final String MOD_ID = "daggermod";

    public DaggerMod() {
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        // Register the doClientStuff method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
        
        RegistryHandler.init();

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
    }

    private void doClientStuff(final FMLClientSetupEvent event) { 
    }
    
    @SubscribeEvent
    public static void loadCompleteEvent(FMLLoadCompleteEvent event) {
    	ModOreGen.generateOre();
    }
    
    public static final ItemGroup TAB = new ItemGroup("daggerModTab") {
    	@Override 
    	public ItemStack createIcon() {
    		// change this to a wooden dagger icon
    		return new ItemStack(RegistryHandler.RUBY.get());
    	}
    };
}