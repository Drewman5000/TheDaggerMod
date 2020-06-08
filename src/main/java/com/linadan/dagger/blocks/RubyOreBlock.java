package com.linadan.dagger.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class RubyOreBlock extends Block {

	public RubyOreBlock() {
		super(Block.Properties.create(Material.ROCK)
			.hardnessAndResistance(3.5f, 3.5f)
			.sound(SoundType.STONE)
			.harvestLevel(2)
			.harvestTool(ToolType.PICKAXE)
			);
	}

}
