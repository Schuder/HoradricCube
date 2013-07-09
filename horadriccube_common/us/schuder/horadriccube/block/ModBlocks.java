package us.schuder.horadriccube.block;

import cpw.mods.fml.common.registry.GameRegistry;
import us.schuder.horadriccube.lib.BlockIds;
import us.schuder.horadriccube.lib.Strings;
import net.minecraft.block.Block;

/**
 * Horadric-Cube
 * 
 * ModBlocks
 * 
 * @author Schuder
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class ModBlocks {

    public static Block horadricCube;
    
    public static void init() {
        
        horadricCube = new BlockHoradricCube(BlockIds.HORADRIC_CUBE).icon(Strings.HORADRIC_CUBE_NAME).setUnlocalizedName(Strings.HORADRIC_CUBE_NAME);
        
        GameRegistry.registerBlock(horadricCube, Strings.HORADRIC_CUBE_NAME);
        
        initBlockRecipes();
    }
    
    private static void initBlockRecipes() {

    }
    
}
