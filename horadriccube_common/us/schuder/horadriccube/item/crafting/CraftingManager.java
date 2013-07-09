package us.schuder.horadriccube.item.crafting;

import us.schuder.horadriccube.block.ModBlocks;
import us.schuder.horadriccube.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Horadric-Cube
 * 
 * CraftingManager
 * 
 * @author Schuder
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class CraftingManager {
    
    public static void init() {
        
        RecipesHoradricCube();
        RecipesHoradricMalus();
        
    }
    
    public static void RecipesHoradricCube() {
        for (int i=0; i < 13; i++) {
            
            swords(i);
            picks(i);
            shovels(i);
            axes(i);
            hoes(i);
            helmets(i);
            plates(i);
            legs(i);
            boots(i);
            
            gemstoneTiers(i);
            
        }
    }
    public static void RecipesHoradricMalus() {
        GameRegistry.addShapelessRecipe(new ItemStack(Item.swordIron),
                new ItemStack(ModItems.horadricMalus),
                new ItemStack(Item.ingotIron),
                new ItemStack(Item.swordIron)
                );
    }
    
    
    
    public static void gemstoneTiers(int i) {
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.gemstoneTier2,1,i),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstone,1,i),
                new ItemStack(ModItems.gemstone,1,i),
                new ItemStack(ModItems.gemstone,1,i),
                new ItemStack(ModItems.gemstone,1,i)
                );
        
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.gemstoneTier3,1,i),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstoneTier2,1,i),
                new ItemStack(ModItems.gemstoneTier2,1,i),
                new ItemStack(ModItems.gemstoneTier2,1,i),
                new ItemStack(ModItems.gemstoneTier2,1,i)
                );
        
    }
    public static void swords(int i) {
        GameRegistry.addShapelessRecipe(new ItemStack(Item.swordWood),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstone,1,i),
                new ItemStack(Item.swordWood)
                );
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.swordStone),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstone,1,i),
                new ItemStack(Item.swordStone)
                );
        GameRegistry.addShapelessRecipe(new ItemStack(Item.swordIron),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstone,1,i),
                new ItemStack(Item.swordIron)
                );
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.swordGold),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstone,1,i),
                new ItemStack(Item.swordGold)
                );
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.swordDiamond),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstone,1,i),
                new ItemStack(Item.swordDiamond)
                );
        GameRegistry.addShapelessRecipe(new ItemStack(Item.swordWood),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstoneTier2,1,i),
                new ItemStack(Item.swordWood)
                );
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.swordStone),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstoneTier2,1,i),
                new ItemStack(Item.swordStone)
                );
        GameRegistry.addShapelessRecipe(new ItemStack(Item.swordIron),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstoneTier2,1,i),
                new ItemStack(Item.swordIron)
                );
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.swordGold),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstoneTier2,1,i),
                new ItemStack(Item.swordGold)
                );
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.swordDiamond),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstoneTier2,1,i),
                new ItemStack(Item.swordDiamond)
                );  
        GameRegistry.addShapelessRecipe(new ItemStack(Item.swordWood),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstoneTier3,1,i),
                new ItemStack(ModItems.gemstoneTier3,1,i),
                new ItemStack(Item.swordWood)
                );
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.swordStone),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstoneTier3,1,i),
                new ItemStack(Item.swordStone)
                );
        GameRegistry.addShapelessRecipe(new ItemStack(Item.swordIron),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstoneTier3,1,i),
                new ItemStack(Item.swordIron)
                );
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.swordGold),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstoneTier3,1,i),
                new ItemStack(Item.swordGold)
                );
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.swordDiamond),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstoneTier3,1,i),
                new ItemStack(Item.swordDiamond)
                );
        
    }
    public static void picks(int i) {
        GameRegistry.addShapelessRecipe(new ItemStack(Item.pickaxeWood),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstone,1,i),
                new ItemStack(Item.pickaxeWood)
                );
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.pickaxeStone),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstone,1,i),
                new ItemStack(Item.pickaxeStone)
                );
        GameRegistry.addShapelessRecipe(new ItemStack(Item.pickaxeIron),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstone,1,i),
                new ItemStack(Item.pickaxeIron)
                );
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.pickaxeGold),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstone,1,i),
                new ItemStack(Item.pickaxeGold)
                );
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.pickaxeDiamond),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstone,1,i),
                new ItemStack(Item.pickaxeDiamond)
                ); 
        GameRegistry.addShapelessRecipe(new ItemStack(Item.pickaxeWood),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstoneTier2,1,i),
                new ItemStack(Item.pickaxeWood)
                );
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.pickaxeStone),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstoneTier2,1,i),
                new ItemStack(Item.pickaxeStone)
                );
        GameRegistry.addShapelessRecipe(new ItemStack(Item.pickaxeIron),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstoneTier2,1,i),
                new ItemStack(Item.pickaxeIron)
                );
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.pickaxeGold),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstoneTier2,1,i),
                new ItemStack(Item.pickaxeGold)
                );
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.pickaxeDiamond),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstoneTier2,1,i),
                new ItemStack(Item.pickaxeDiamond)
                ); 
        GameRegistry.addShapelessRecipe(new ItemStack(Item.pickaxeWood),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstoneTier3,1,i),
                new ItemStack(Item.pickaxeWood)
                );
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.pickaxeStone),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstoneTier3,1,i),
                new ItemStack(Item.pickaxeStone)
                );
        GameRegistry.addShapelessRecipe(new ItemStack(Item.pickaxeIron),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstoneTier3,1,i),
                new ItemStack(Item.pickaxeIron)
                );
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.pickaxeGold),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstoneTier3,1,i),
                new ItemStack(Item.pickaxeGold)
                );
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.pickaxeDiamond),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstoneTier3,1,i),
                new ItemStack(Item.pickaxeDiamond)
                );
    }
    public static void shovels(int i) {
        GameRegistry.addShapelessRecipe(new ItemStack(Item.shovelWood),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstone,1,i),
                new ItemStack(Item.shovelWood)
                );
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.shovelStone),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstone,1,i),
                new ItemStack(Item.shovelStone)
                );
        GameRegistry.addShapelessRecipe(new ItemStack(Item.shovelIron),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstone,1,i),
                new ItemStack(Item.shovelIron)
                );
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.shovelGold),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstone,1,i),
                new ItemStack(Item.shovelGold)
                );
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.shovelDiamond),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstone,1,i),
                new ItemStack(Item.shovelDiamond)
                );  
        GameRegistry.addShapelessRecipe(new ItemStack(Item.shovelWood),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstoneTier2,1,i),
                new ItemStack(Item.shovelWood)
                );
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.shovelStone),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstoneTier2,1,i),
                new ItemStack(Item.shovelStone)
                );
        GameRegistry.addShapelessRecipe(new ItemStack(Item.shovelIron),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstoneTier2,1,i),
                new ItemStack(Item.shovelIron)
                );
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.shovelGold),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstoneTier2,1,i),
                new ItemStack(Item.shovelGold)
                );
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.shovelDiamond),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstoneTier2,1,i),
                new ItemStack(Item.shovelDiamond)
                ); 
        GameRegistry.addShapelessRecipe(new ItemStack(Item.shovelWood),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstoneTier3,1,i),
                new ItemStack(Item.shovelWood)
                );
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.shovelStone),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstoneTier3,1,i),
                new ItemStack(Item.shovelStone)
                );
        GameRegistry.addShapelessRecipe(new ItemStack(Item.shovelIron),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstoneTier3,1,i),
                new ItemStack(Item.shovelIron)
                );
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.shovelGold),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstoneTier3,1,i),
                new ItemStack(Item.shovelGold)
                );
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.shovelDiamond),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstoneTier3,1,i),
                new ItemStack(Item.shovelDiamond)
                );         
    }
    public static void axes(int i) {
        GameRegistry.addShapelessRecipe(new ItemStack(Item.axeWood),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstone,1,i),
                new ItemStack(Item.axeWood)
                );
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.axeStone),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstone,1,i),
                new ItemStack(Item.axeStone)
                );
        GameRegistry.addShapelessRecipe(new ItemStack(Item.axeIron),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstone,1,i),
                new ItemStack(Item.axeIron)
                );
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.axeGold),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstone,1,i),
                new ItemStack(Item.axeGold)
                );
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.axeDiamond),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstone,1,i),
                new ItemStack(Item.axeDiamond)
                );  
        GameRegistry.addShapelessRecipe(new ItemStack(Item.axeWood),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstoneTier2,1,i),
                new ItemStack(Item.axeWood)
                );
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.axeStone),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstoneTier2,1,i),
                new ItemStack(Item.axeStone)
                );
        GameRegistry.addShapelessRecipe(new ItemStack(Item.axeIron),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstoneTier2,1,i),
                new ItemStack(Item.axeIron)
                );
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.axeGold),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstoneTier2,1,i),
                new ItemStack(Item.axeGold)
                );
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.axeDiamond),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstoneTier2,1,i),
                new ItemStack(Item.axeDiamond)
                );    
        GameRegistry.addShapelessRecipe(new ItemStack(Item.axeWood),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstoneTier3,1,i),
                new ItemStack(Item.axeWood)
                );
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.axeStone),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstoneTier3,1,i),
                new ItemStack(Item.axeStone)
                );
        GameRegistry.addShapelessRecipe(new ItemStack(Item.axeIron),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstoneTier3,1,i),
                new ItemStack(Item.axeIron)
                );
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.axeGold),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstoneTier3,1,i),
                new ItemStack(Item.axeGold)
                );
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.axeDiamond),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstoneTier3,1,i),
                new ItemStack(Item.axeDiamond)
                );  
    }
    public static void hoes(int i) {
        GameRegistry.addShapelessRecipe(new ItemStack(Item.hoeWood),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstone,1,i),
                new ItemStack(Item.hoeWood)
                );
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.hoeStone),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstone,1,i),
                new ItemStack(Item.hoeStone)
                );
        GameRegistry.addShapelessRecipe(new ItemStack(Item.hoeIron),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstone,1,i),
                new ItemStack(Item.hoeIron)
                );
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.hoeGold),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstone,1,i),
                new ItemStack(Item.hoeGold)
                );
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.hoeDiamond),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstone,1,i),
                new ItemStack(Item.hoeDiamond)
                );  
        GameRegistry.addShapelessRecipe(new ItemStack(Item.hoeWood),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstoneTier2,1,i),
                new ItemStack(Item.hoeWood)
                );
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.hoeStone),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstoneTier2,1,i),
                new ItemStack(Item.hoeStone)
                );
        GameRegistry.addShapelessRecipe(new ItemStack(Item.hoeIron),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstoneTier2,1,i),
                new ItemStack(Item.hoeIron)
                );
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.hoeGold),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstoneTier2,1,i),
                new ItemStack(Item.hoeGold)
                );
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.hoeDiamond),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstoneTier2,1,i),
                new ItemStack(Item.hoeDiamond)
                );    
        GameRegistry.addShapelessRecipe(new ItemStack(Item.hoeWood),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstoneTier3,1,i),
                new ItemStack(Item.hoeWood)
                );
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.hoeStone),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstoneTier3,1,i),
                new ItemStack(Item.hoeStone)
                );
        GameRegistry.addShapelessRecipe(new ItemStack(Item.hoeIron),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstoneTier3,1,i),
                new ItemStack(Item.hoeIron)
                );
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.hoeGold),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstoneTier3,1,i),
                new ItemStack(Item.hoeGold)
                );
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.hoeDiamond),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstoneTier3,1,i),
                new ItemStack(Item.hoeDiamond)
                );         
    }
    public static void helmets(int i) {
        GameRegistry.addShapelessRecipe(new ItemStack(Item.helmetLeather),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstone,1,i),
                new ItemStack(Item.helmetLeather)
                );
        GameRegistry.addShapelessRecipe(new ItemStack(Item.helmetIron),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstone,1,i),
                new ItemStack(Item.helmetIron)
                );
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.helmetGold),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstone,1,i),
                new ItemStack(Item.helmetGold)
                );
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.helmetDiamond),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstone,1,i),
                new ItemStack(Item.swordIron)
                );  
        GameRegistry.addShapelessRecipe(new ItemStack(Item.helmetLeather),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstoneTier2,1,i),
                new ItemStack(Item.helmetLeather)
                );
        GameRegistry.addShapelessRecipe(new ItemStack(Item.helmetIron),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstoneTier2,1,i),
                new ItemStack(Item.helmetIron)
                );
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.helmetGold),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstoneTier2,1,i),
                new ItemStack(Item.helmetGold)
                );
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.helmetDiamond),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstoneTier2,1,i),
                new ItemStack(Item.swordIron)
                ); 
        GameRegistry.addShapelessRecipe(new ItemStack(Item.helmetLeather),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstoneTier3,1,i),
                new ItemStack(Item.helmetLeather)
                );
        GameRegistry.addShapelessRecipe(new ItemStack(Item.helmetIron),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstoneTier3,1,i),
                new ItemStack(Item.helmetIron)
                );
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.helmetGold),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstoneTier3,1,i),
                new ItemStack(Item.helmetGold)
                );
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.helmetDiamond),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstoneTier3,1,i),
                new ItemStack(Item.swordIron)
                );         
    }
    public static void plates(int i) {
        GameRegistry.addShapelessRecipe(new ItemStack(Item.plateLeather),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstone,1,i),
                new ItemStack(Item.plateLeather)
                );
        GameRegistry.addShapelessRecipe(new ItemStack(Item.plateIron),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstone,1,i),
                new ItemStack(Item.plateIron)
                );
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.plateGold),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstone,1,i),
                new ItemStack(Item.plateGold)
                );
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.plateDiamond),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstone,1,i),
                new ItemStack(Item.plateDiamond)
                );  
        GameRegistry.addShapelessRecipe(new ItemStack(Item.plateLeather),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstoneTier2,1,i),
                new ItemStack(Item.plateLeather)
                );
        GameRegistry.addShapelessRecipe(new ItemStack(Item.plateIron),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstoneTier2,1,i),
                new ItemStack(Item.plateIron)
                );
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.plateGold),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstoneTier2,1,i),
                new ItemStack(Item.plateGold)
                );
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.plateDiamond),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstoneTier2,1,i),
                new ItemStack(Item.plateDiamond)
                ); 
        GameRegistry.addShapelessRecipe(new ItemStack(Item.plateLeather),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstoneTier3,1,i),
                new ItemStack(Item.plateLeather)
                );
        GameRegistry.addShapelessRecipe(new ItemStack(Item.plateIron),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstoneTier3,1,i),
                new ItemStack(Item.plateIron)
                );
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.plateGold),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstoneTier3,1,i),
                new ItemStack(Item.plateGold)
                );
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.plateDiamond),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstoneTier3,1,i),
                new ItemStack(Item.plateDiamond)
                );         
    }
    public static void legs(int i) {
        GameRegistry.addShapelessRecipe(new ItemStack(Item.legsLeather),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstone,1,i),
                new ItemStack(Item.legsLeather)
                );
        GameRegistry.addShapelessRecipe(new ItemStack(Item.legsIron),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstone,1,i),
                new ItemStack(Item.legsIron)
                );
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.legsGold),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstone,1,i),
                new ItemStack(Item.legsGold)
                );
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.legsDiamond),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstone,1,i),
                new ItemStack(Item.legsDiamond)
                );  
        GameRegistry.addShapelessRecipe(new ItemStack(Item.legsLeather),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstoneTier2,1,i),
                new ItemStack(Item.legsLeather)
                );
        GameRegistry.addShapelessRecipe(new ItemStack(Item.legsIron),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstoneTier2,1,i),
                new ItemStack(Item.legsIron)
                );
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.legsGold),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstoneTier2,1,i),
                new ItemStack(Item.legsGold)
                );
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.legsDiamond),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstoneTier2,1,i),
                new ItemStack(Item.legsDiamond)
                );
        GameRegistry.addShapelessRecipe(new ItemStack(Item.legsLeather),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstoneTier3,1,i),
                new ItemStack(Item.legsLeather)
                );
        GameRegistry.addShapelessRecipe(new ItemStack(Item.legsIron),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstoneTier3,1,i),
                new ItemStack(Item.legsIron)
                );
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.legsGold),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstoneTier3,1,i),
                new ItemStack(Item.legsGold)
                );
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.legsDiamond),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstoneTier3,1,i),
                new ItemStack(Item.legsDiamond)
                ); 
    }
    public static void boots(int i) {
        GameRegistry.addShapelessRecipe(new ItemStack(Item.bootsLeather),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstone,1,i),
                new ItemStack(Item.bootsLeather)
                );
        GameRegistry.addShapelessRecipe(new ItemStack(Item.bootsIron),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstone,1,i),
                new ItemStack(Item.bootsIron)
                );
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.bootsGold),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstone,1,i),
                new ItemStack(Item.bootsGold)
                );
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.bootsDiamond),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstone,1,i),
                new ItemStack(Item.bootsDiamond)
                );  
        GameRegistry.addShapelessRecipe(new ItemStack(Item.bootsLeather),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstoneTier2,1,i),
                new ItemStack(Item.bootsLeather)
                );
        GameRegistry.addShapelessRecipe(new ItemStack(Item.bootsIron),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstoneTier2,1,i),
                new ItemStack(Item.bootsIron)
                );
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.bootsGold),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstoneTier2,1,i),
                new ItemStack(Item.bootsGold)
                );
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.bootsDiamond),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstoneTier2,1,i),
                new ItemStack(Item.bootsDiamond)
                );         
        GameRegistry.addShapelessRecipe(new ItemStack(Item.bootsLeather),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstoneTier3,1,i),
                new ItemStack(Item.bootsLeather)
                );
        GameRegistry.addShapelessRecipe(new ItemStack(Item.bootsIron),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstoneTier3,1,i),
                new ItemStack(Item.bootsIron)
                );
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.bootsGold),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstoneTier3,1,i),
                new ItemStack(Item.bootsGold)
                );
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.bootsDiamond),
                new ItemStack(ModBlocks.horadricCube), 
                new ItemStack(ModItems.gemstoneTier3,1,i),
                new ItemStack(Item.bootsDiamond)
                ); 
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
