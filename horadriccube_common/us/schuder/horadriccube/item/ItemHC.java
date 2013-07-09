package us.schuder.horadriccube.item;

import us.schuder.horadriccube.HoradricCube;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

/**
 * Horadric-Cube
 * 
 * ItemHC
 * 
 * @author Schuder
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class ItemHC extends Item{

    protected String icon;

    public ItemHC(int par1) {
        super(par1);
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
