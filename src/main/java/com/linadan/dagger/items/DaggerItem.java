package com.linadan.dagger.items;

import java.util.List;

import com.linadan.dagger.util.helpers.KeyboardHelper;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

public class DaggerItem extends SwordItem {
	private float attackSpeed;
	private float attackDamage;

	public DaggerItem(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties properties) {
		super(tier, attackDamageIn, attackSpeedIn, properties);
	      this.attackSpeed = attackSpeedIn;
	      this.attackDamage = (float)attackDamageIn + tier.getAttackDamage();
	      //this.isIn(DAGGERS); // Need to add a dagger tag here? 
	}
	

	//The below block makes the item glow like a written in book.
//	@Override
//	public boolean hasEffect(ItemStack stack) {
//		return true;
//	}
	
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		if(KeyboardHelper.isHoldingShift()){
			tooltip.add(new StringTextComponent("This Dagger looks sharp!"));
			tooltip.add(new StringTextComponent("Best to be careful . . .") );
			
		} else {
			tooltip.add(new StringTextComponent("Hold SHIFT for more information!"));
		}
		super.addInformation(stack, worldIn, tooltip, flagIn);
	}
	
//	@Override
//	public boolean canApplyAtEnchantingTable(ItemStack stack, Enchantment enchantment) {
//		// TODO Auto-generated method stub
//		return super.canApplyAtEnchantingTable(stack, enchantment);
//	}
//	
//	@Override
//	public Set<ToolType> getToolTypes(ItemStack stack) {
//		// TODO Auto-generated method stub
//		return super.getToolTypes(stack);
//	}
	
	
	
	
	
	
	
	
	
	
	

}
