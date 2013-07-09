package us.schuder.horadriccube.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;

import us.schuder.horadriccube.HoradricCube;
import us.schuder.horadriccube.lib.Strings;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;

/**
 * Horadric-Cube
 * 
 * ItemGemstone
 * 
 * @author Schuder
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class ItemGemstone extends ItemHC {
    @SideOnly(Side.CLIENT)
    private Icon[] icons;
    public int tier = 1;

    public ItemGemstone(int par1, int par2)
    {
        super(par1);
        this.setHasSubtypes(true);
        this.setMaxDamage(0);
        this.setCreativeTab(HoradricCube.tabsHC);
        this.tier = par2;
    }

    @SideOnly(Side.CLIENT)

    /**
     * Gets an icon index based on an item's damage value
     */
    public Icon getIconFromDamage(int par1)
    {
        int j = MathHelper.clamp_int(par1, 0, 12);
        return this.icons[j];
    }

    /**
     * Returns the unlocalized name of this item. This version accepts an ItemStack so different stacks can have
     * different names based on their damage or NBT.
     */
    public String getUnlocalizedName(ItemStack par1ItemStack)
    {
        int i = MathHelper.clamp_int(par1ItemStack.getItemDamage(), 0, 12);
        return super.getUnlocalizedName() + "." + Strings.GEMSTONE_NAMES[i];
    }

    @SideOnly(Side.CLIENT)

    /**
     * returns a list of items with the same ID, but different meta (eg: dye returns 16 items)
     */
    public void getSubItems(int par1, CreativeTabs par2CreativeTabs, List par3List)
    {
        for (int j = 0; j < 13; ++j)
        {
            par3List.add(new ItemStack(par1, 1, j));
        }
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.icons = new Icon[Strings.GEMSTONE_NAMES.length];

        for (int i = 0; i < Strings.GEMSTONE_NAMES.length; ++i)
        {
            this.icons[i] = par1IconRegister.registerIcon("HoradricCube:" + Strings.GEMSTONE_NAMES[i]+"_tier"+tier);
        }
    }
    
    public int getTier() {
        return this.tier;
    }
}
