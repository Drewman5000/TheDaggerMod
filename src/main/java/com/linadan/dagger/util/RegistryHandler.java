package com.linadan.dagger.util;

import com.linadan.dagger.DaggerMod;
import com.linadan.dagger.blocks.BlockItemBase;
import com.linadan.dagger.blocks.CrystalBlock;
import com.linadan.dagger.blocks.RubyBlock;
import com.linadan.dagger.blocks.RubyOreBlock;
import com.linadan.dagger.blocks.SteelBlock;
import com.linadan.dagger.items.DaggerItem;
import com.linadan.dagger.items.ItemBase;
import com.linadan.dagger.items.ModItemTier;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;
import net.minecraft.item.WrittenBookItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {
	
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, DaggerMod.MOD_ID);
	public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, DaggerMod.MOD_ID);
	public static void init() {
		ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
		BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
	}
	
	// Items
	public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", ItemBase::new);
	public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot", ItemBase::new);
	public static final RegistryObject<Item> STEEL_NUGGET = ITEMS.register("steel_nugget", ItemBase::new);
	public static final RegistryObject<Item> CRYSTAL_SHARD = ITEMS.register("crystal_shard", ItemBase::new);
	public static final RegistryObject<Item> GUIDE_BOOK = ITEMS.register("guide_book", ItemBase::new);
	public static final RegistryObject<Item> MEAT_PARTS = ITEMS.register("meat_parts", ItemBase::new);
	//public static final Item WRITTEN_BOOK = register("written_book", new WrittenBookItem((new Item.Properties()).maxStackSize(16)));
	
	// Tools - Weapons first because that's the order I made them.
	// public SwordItem(IItemTier tier, int attackDamageIn, float attackSpeedIn, Item.Properties builder)
	public static final RegistryObject<Item> RUBY_DAGGER = ITEMS.register("ruby_dagger", () -> new DaggerItem(ModItemTier.RUBY_TIER, 1, 3.5f, new Item.Properties().group(DaggerMod.TAB)));
	public static final RegistryObject<Item> STONE_DAGGER = ITEMS.register("stone_dagger", () -> new DaggerItem(ItemTier.STONE, 1, 3.0f, new Item.Properties().group(DaggerMod.TAB)));
	public static final RegistryObject<Item> FLINT_DAGGER = ITEMS.register("flint_dagger", () -> new DaggerItem(ModItemTier.FLINT_TIER, 1, 3.5f, new Item.Properties().group(DaggerMod.TAB)));
	public static final RegistryObject<Item> GLASS_DAGGER = ITEMS.register("glass_dagger", () -> new DaggerItem(ModItemTier.GLASS_TIER, 1, 3.5f, new Item.Properties().group(DaggerMod.TAB)));
	public static final RegistryObject<Item> EMERALD_DAGGER = ITEMS.register("emerald_dagger", () -> new DaggerItem(ModItemTier.EMERALD_TIER, 1, 3.5f, new Item.Properties().group(DaggerMod.TAB)));
	public static final RegistryObject<Item> DIAMOND_DAGGER = ITEMS.register("diamond_dagger", () -> new DaggerItem(ItemTier.DIAMOND, 1, 3.5f, new Item.Properties().group(DaggerMod.TAB)));
	public static final RegistryObject<Item> GOLD_DAGGER = ITEMS.register("gold_dagger", () -> new DaggerItem(ItemTier.GOLD, 1, 3.5f, new Item.Properties().group(DaggerMod.TAB)));
	public static final RegistryObject<Item> IRON_DAGGER = ITEMS.register("iron_dagger", () -> new DaggerItem(ItemTier.IRON, 1, 3.1f, new Item.Properties().group(DaggerMod.TAB)));
	public static final RegistryObject<Item> OBSIDIAN_DAGGER = ITEMS.register("obsidian_dagger", () -> new DaggerItem(ModItemTier.OBSIDIAN_TIER, 1, 3.8f, new Item.Properties().group(DaggerMod.TAB)));
	public static final RegistryObject<Item> ANDESITE_DAGGER = ITEMS.register("andesite_dagger", () -> new DaggerItem(ModItemTier.ANDESITE_TIER, -1, 3.0f, new Item.Properties().group(DaggerMod.TAB)));
	public static final RegistryObject<Item> DIORITE_DAGGER = ITEMS.register("diorite_dagger", () -> new DaggerItem(ModItemTier.DIORITE_TIER, 0, 3.0f, new Item.Properties().group(DaggerMod.TAB)));
	public static final RegistryObject<Item> GRANITE_DAGGER = ITEMS.register("granite_dagger", () -> new DaggerItem(ModItemTier.GRANITE_TIER, 0, 1.8f, new Item.Properties().group(DaggerMod.TAB)));
	public static final RegistryObject<Item> WOOD_DAGGER = ITEMS.register("wood_dagger", () -> new DaggerItem(ItemTier.WOOD, 1, 3.5f, new Item.Properties().group(DaggerMod.TAB)));
	public static final RegistryObject<Item> HARDENED_WOOD_DAGGER = ITEMS.register("hardened_wood_dagger", () -> new DaggerItem(ModItemTier.HARDENED_WOOD_TIER, 1, -3.5f, new Item.Properties().group(DaggerMod.TAB)));
	public static final RegistryObject<Item> REDSTONE_DAGGER = ITEMS.register("redstone_dagger", () -> new DaggerItem(ModItemTier.REDSTONE_TIER, 1, 3.5f, new Item.Properties().group(DaggerMod.TAB)));
	public static final RegistryObject<Item> CRYSTAL_DAGGER = ITEMS.register("crystal_dagger", () -> new DaggerItem(ModItemTier.CRYSTAL_TIER, 1, 3.5f, new Item.Properties().group(DaggerMod.TAB)));
	public static final RegistryObject<Item> STEEL_DAGGER = ITEMS.register("steel_dagger", () -> new DaggerItem(ModItemTier.STEEL_TIER, 1, 3.5f, new Item.Properties().group(DaggerMod.TAB)));
	public static final RegistryObject<Item> LAPIS_DAGGER = ITEMS.register("lapis_dagger", () -> new DaggerItem(ModItemTier.LAPIS_TIER, 1, 3.5f, new Item.Properties().group(DaggerMod.TAB)));
	public static final RegistryObject<Item> QUARTZ_DAGGER = ITEMS.register("quartz_dagger", () -> new DaggerItem(ModItemTier.QUARTZ_TIER, 1, 3.5f, new Item.Properties().group(DaggerMod.TAB)));
	public static final RegistryObject<Item> CLAY_DAGGER = ITEMS.register("clay_dagger", () -> new DaggerItem(ModItemTier.CLAY_TIER, 1, 1.8f, new Item.Properties().group(DaggerMod.TAB)));
	public static final RegistryObject<Item> ICE_DAGGER = ITEMS.register("ice_dagger", () -> new DaggerItem(ModItemTier.ICE_TIER, 1, 3.5f, new Item.Properties().group(DaggerMod.TAB)));
	public static final RegistryObject<Item> FEATHER_DAGGER = ITEMS.register("feather_dagger", () -> new DaggerItem(ModItemTier.FEATHER_TIER, 1, 3.5f, new Item.Properties().group(DaggerMod.TAB)));
	public static final RegistryObject<Item> BREAD_KNIFE = ITEMS.register("bread_knife", () -> new DaggerItem(ModItemTier.BREAD_KNIFE_TIER, 1, 3.1f, new Item.Properties().group(DaggerMod.TAB)));
	public static final RegistryObject<Item> BONE_DAGGER = ITEMS.register("bone_dagger", () -> new DaggerItem(ModItemTier.BONE_TIER, 1, 1.4f, new Item.Properties().group(DaggerMod.TAB)));
	public static final RegistryObject<Item> CACTUS_DAGGER = ITEMS.register("cactus_dagger", () -> new DaggerItem(ModItemTier.CACTUS_TIER, 1, 1.6f, new Item.Properties().group(DaggerMod.TAB)));
	public static final RegistryObject<Item> BONE_MEAL_DAGGER = ITEMS.register("bone_meal_dagger", () -> new DaggerItem(ModItemTier.BONE_MEAL_TIER, 0, 1.6f, new Item.Properties().group(DaggerMod.TAB)));
	public static final RegistryObject<Item> PHANTOM_MEMBRANE_DAGGER = ITEMS.register("phantom_membrane_dagger", () -> new DaggerItem(ModItemTier.PHANTOM_MEMBRANE_TIER, 0, 1.7f, new Item.Properties().group(DaggerMod.TAB)));
	public static final RegistryObject<Item> STEAK_KNIFE = ITEMS.register("steak_knife", () -> new DaggerItem(ModItemTier.STEAK_KNIFE_TIER, 1, 3.5f, new Item.Properties().group(DaggerMod.TAB)));
	
	// Blocks
	public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", RubyBlock::new);
	public static final RegistryObject<Block> STEEL_BLOCK = BLOCKS.register("steel_block", SteelBlock::new);
	public static final RegistryObject<Block> CRYSTAL_BLOCK = BLOCKS.register("crystal_block", CrystalBlock::new);
	public static final RegistryObject<Block> RUBY_ORE_BLOCK = BLOCKS.register("ruby_ore_block", RubyOreBlock::new);
	
	// Block Items
	public static final RegistryObject<Item> RUBY_BLOCK_ITEM = ITEMS.register("ruby_block", () -> new BlockItemBase(RUBY_BLOCK.get()));
	public static final RegistryObject<Item> STEEL_BLOCK_ITEM = ITEMS.register("steel_block", () -> new BlockItemBase(STEEL_BLOCK.get()));
	public static final RegistryObject<Item> CRYSTAL_BLOCK_ITEM = ITEMS.register("crystal_block", () -> new BlockItemBase(CRYSTAL_BLOCK.get()));
	public static final RegistryObject<Item> RUBY_ORE_BLOCK_ITEM = ITEMS.register("ruby_ore_block", () -> new BlockItemBase(RUBY_ORE_BLOCK.get()));
}
