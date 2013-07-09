package us.schuder.horadriccube.creativetab;

import us.schuder.horadriccube.lib.BlockIds;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.creativetab.CreativeTabs;

/**
 * Horadric-Cube
 * 
 * CreativeTabHC
 * 
 * @author Schuder
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class CreativeTabHC extends CreativeTabs {

    public CreativeTabHC(int par1, String par2Str) {
        
        super(par1, par2Str);
        
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    /**
     * the itemID for the item to be displayed on the tab
     */
    public int getTabIconItemIndex() {

        return BlockIds.HORADRIC_CUBE;
    }

    
    
}
