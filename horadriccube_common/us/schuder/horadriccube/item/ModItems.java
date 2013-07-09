package us.schuder.horadriccube.item;

import us.schuder.horadriccube.lib.ItemIds;
import us.schuder.horadriccube.lib.Strings;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;

/**
 * Horadric-Cube
 * 
 * ModItems
 * 
 * @author Schuder
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class ModItems {
        
    public static Item gemstone;
    public static Item gemstoneTier2;
    public static Item gemstoneTier3;
    public static Item horadricMalus;
    
    public static void init() {
        
        gemstone = new ItemGemstone(ItemIds.GEMSTONE,1).setUnlocalizedName(Strings.GEMSTONE_NAME);
        gemstoneTier2 = new ItemGemstone(ItemIds.GEMSTONE_TIER2,2).setUnlocalizedName(Strings.GEMSTONE_TIER2_NAME);
        gemstoneTier3 = new ItemGemstone(ItemIds.GEMSTONE_TIER3,3).setUnlocalizedName(Strings.GEMSTONE_TIER3_NAME);
        
        horadricMalus = new ItemHoradricMalus(ItemIds.HORADRIC_MALUS).setIcon(Strings.HORADRIC_MALUS_NAME).setUnlocalizedName(Strings.HORADRIC_MALUS_NAME);
        
    }
    
    

}
