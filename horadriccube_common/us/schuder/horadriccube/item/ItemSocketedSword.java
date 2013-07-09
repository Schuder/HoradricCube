package us.schuder.horadriccube.item;

import java.util.List;

import us.schuder.horadriccube.HoradricCube;

import com.google.common.collect.Multimap;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;

public class ItemSocketedSword extends ItemSword
{
    
    protected String icon;

    public ItemSocketedSword(int par1, EnumToolMaterial par2EnumToolMaterial)
    {
        super(par1, par2EnumToolMaterial);
        this.maxStackSize = 1;
        this.setMaxDamage(par2EnumToolMaterial.getMaxUses());
        this.setCreativeTab(CreativeTabs.tabCombat);
        this.setCreativeTab(HoradricCube.tabsHC);
    }
    
    public Item setIcon(String par1Str)
    {
        this.icon = par1Str;
        return this;
    }
    
    @Override
    public void registerIcons(IconRegister iconRegister) 
    {
            this.itemIcon = iconRegister.registerIcon("HoradricCube:" + this.icon);
    }
    
}
