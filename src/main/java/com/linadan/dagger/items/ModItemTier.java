package com.linadan.dagger.items;

import java.util.function.Supplier;

import com.linadan.dagger.util.RegistryHandler;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.LazyValue;

public enum ModItemTier implements IItemTier {
	RUBY_TIER(2, 400, 6.5f, 2.2f, 6, () -> {
		return Ingredient.fromItems(RegistryHandler.RUBY.get());
		}), 
	FLINT_TIER(1, 155, 5.5f, 1.5f, 5, () -> {
		return Ingredient.fromItems(Items.FLINT);
		}),
	GLASS_TIER(0, 100, 2.0f, 2.5f, 4, () -> {
		return Ingredient.fromItems(Items.GLASS);
		}),
	EMERALD_TIER(2, 400, 7.0f, 2.5f, 7, () -> {
		return Ingredient.fromItems(Items.EMERALD);
		}),
	OBSIDIAN_TIER(3, 2000, 9.0f, 3.5f, 9, () -> {
		return Ingredient.fromItems(Items.OBSIDIAN);
		}),
	ANDESITE_TIER(1, 170, 4.5f, 1.2f, 4, () -> {
		return Ingredient.fromItems(Items.ANDESITE);
		}),
	DIORITE_TIER(1, 165, 4.0f, 1.0f, 4, () -> {
		return Ingredient.fromItems(Items.DIORITE);
		}),
	GRANITE_TIER(1, 200, 5.0f, 1.5f, 5, () -> {
		return Ingredient.fromItems(Items.GRANITE);
		}),
	HARDENED_WOOD_TIER(0, 75, 2.0f, 1.2f, 16, () -> {
		return Ingredient.fromTag(ItemTags.LOGS);
		}),
	REDSTONE_TIER(0, 80, 2.2f, 0.5f, 18, () -> {
		return Ingredient.fromItems(Items.REDSTONE);
		}),
	CRYSTAL_TIER(0, 220, 2.5f, 2.5f, 20, () -> {
		return Ingredient.fromItems(RegistryHandler.CRYSTAL_SHARD.get());
		}),
	STEEL_TIER(2, 450, 7.5f, 2.5f, 13, () -> {
		return Ingredient.fromItems(RegistryHandler.STEEL_INGOT.get());
		}),
	LAPIS_TIER(0, 85, 2.8f, 0.6f, 22, () -> {
		return Ingredient.fromItems(Items.LAPIS_LAZULI);
		}),
	QUARTZ_TIER(2, 400, 7.0f, 2.2f, 8, () -> {
		return Ingredient.fromItems(Items.QUARTZ);
		}),
	CLAY_TIER(0, 50, 2.0f, 0.0f, 15, () -> {
		return Ingredient.fromItems(Items.CLAY);
		}),
	ICE_TIER(0, 45, 3.0f, 1.2f, 16, () -> {
		return Ingredient.fromItems(Items.ICE);
		}), // Any Ice block?
	FEATHER_TIER(0, 410, 1.0f, 0.0f, 8, () -> {
		return Ingredient.fromItems(Items.FEATHER);
		}),
	BREAD_KNIFE_TIER(2, 225, 4.0f, 1.6f, 13, () -> {
		return Ingredient.fromItems(Items.IRON_NUGGET);
		}),
	BONE_TIER(1, 110, 2.4f, 0.8f, 20, () -> {
		return Ingredient.fromItems(Items.BONE);
		}),
	CACTUS_TIER(0, 50, 2.0f, 0.0f, 4, () -> {
		return Ingredient.fromItems(Items.CACTUS);
		}),
	PHANTOM_MEMBRANE_TIER(0, 50, 2.0f, 0.0f, 4, () -> { //adjust numbers here
		return Ingredient.fromItems(Items.PHANTOM_MEMBRANE);
		}),
	BONE_MEAL_TIER(0, 50, 2.0f, 0.0f, 4, () -> { //adjust numbers here
		return Ingredient.fromItems(Items.BONE_MEAL);
		}),
	STEAK_KNIFE_TIER(2, 235, 4.2f, 1.8f, 10, () -> {
		return Ingredient.fromItems(RegistryHandler.STEEL_INGOT.get());
		});

   private final int harvestLevel;
   private final int maxUses;
   private final float efficiency;
   private final float attackDamage;
   private final int enchantability;
   private final LazyValue<Ingredient> repairMaterial;

   private ModItemTier(int harvestLevelIn, int maxUsesIn, float efficiencyIn, float attackDamageIn, int enchantabilityIn, Supplier<Ingredient> repairMaterialIn) {
      this.harvestLevel = harvestLevelIn;
      this.maxUses = maxUsesIn;
      this.efficiency = efficiencyIn;
      this.attackDamage = attackDamageIn;
      this.enchantability = enchantabilityIn;
      this.repairMaterial = new LazyValue<>(repairMaterialIn);
   }

   @Override
   public int getMaxUses() {
      return this.maxUses;
   }

   @Override
   public float getEfficiency() {
      return this.efficiency;
   }

   @Override
   public float getAttackDamage() {
      return this.attackDamage;
   }

   @Override
   public int getHarvestLevel() {
      return this.harvestLevel;
   }

   @Override
   public int getEnchantability() {
      return this.enchantability;
   }

   @Override
   public Ingredient getRepairMaterial() {
      return this.repairMaterial.getValue();
   }
}
