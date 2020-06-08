package com.linadan.dagger.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class SteelBlock extends Block {

	public SteelBlock() {
		super(Block.Properties.create(Material.IRON)
			.hardnessAndResistance(5.2f, 6.5f)
			.sound(SoundType.METAL)
			.harvestLevel(2)
			.harvestTool(ToolType.PICKAXE)
			);
	}

}
