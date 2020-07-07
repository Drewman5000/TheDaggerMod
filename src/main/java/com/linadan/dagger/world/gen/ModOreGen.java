package com.linadan.dagger.world.gen;

import com.linadan.dagger.util.RegistryHandler;

import net.minecraft.world.biome.Biome;
//import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class ModOreGen {
	public static void generateOre() {
		for (Biome biome : ForgeRegistries.BIOMES) {
//			if (biome == Biomes.BIRCH_FOREST || biome == Biomes.FLOWER_FOREST) {
//				ConfiguredPlacement rubyOreConfig = Placement.COUNT_RANGE.configure(new CountRangeConfig(10, 7, 5, 58));
//				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
//					Feature.ORE
//						.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.RUBY_ORE_BLOCK.get().getDefaultState(), 2))
//						.withPlacement(rubyOreConfig));
//			}
			ConfiguredPlacement crystalConfig = Placement.COUNT_RANGE.configure(new CountRangeConfig(12, 8, 5, 50));
			biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
				Feature.ORE
					.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.CRYSTAL_BLOCK.get().getDefaultState(), 12))
					.withPlacement(crystalConfig));
			ConfiguredPlacement rubyOreConfig = Placement.COUNT_RANGE.configure(new CountRangeConfig(20, 7, 5, 58));
			biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
				Feature.ORE
					.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.RUBY_ORE_BLOCK.get().getDefaultState(), 18))
					.withPlacement(rubyOreConfig));
		}
	}

}
