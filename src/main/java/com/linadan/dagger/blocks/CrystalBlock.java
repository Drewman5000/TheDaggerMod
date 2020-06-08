package com.linadan.dagger.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class CrystalBlock extends Block {

	public CrystalBlock() {
		super(Block.Properties.create(Material.GLASS)
			.hardnessAndResistance(4.5f, 1.5f)
			.sound(SoundType.GLASS)
			.harvestLevel(2)
			.harvestTool(ToolType.PICKAXE)
			);
	}

}
