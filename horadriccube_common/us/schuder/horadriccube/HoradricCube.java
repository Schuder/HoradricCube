package us.schuder.horadriccube;

import java.io.File;

import net.minecraft.creativetab.CreativeTabs;

import us.schuder.horadriccube.block.ModBlocks;
import us.schuder.horadriccube.configuration.ConfigurationHandler;
import us.schuder.horadriccube.core.handlers.CraftingHandler;
import us.schuder.horadriccube.core.proxy.CommonProxy;
import us.schuder.horadriccube.core.util.LocalizationHandler;
import us.schuder.horadriccube.creativetab.CreativeTabHC;
import us.schuder.horadriccube.item.ModItems;
import us.schuder.horadriccube.item.crafting.CraftingManager;
import us.schuder.horadriccube.lib.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Horadric-Cube
 * 
 * HoradricCube
 * 
 * @author Schuder
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

@Mod(modid=Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION)
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class HoradricCube {
    
    @Instance(Reference.MOD_ID)
    public static HoradricCube instance;
    
    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;
    
    public static CreativeTabs tabsHC = new CreativeTabHC(CreativeTabs.getNextID(), Reference.MOD_ID);
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        
        LocalizationHandler.loadLanguages();
        
        ConfigurationHandler.init(new File(event.getModConfigurationDirectory().getAbsolutePath() + File.separator + Reference.CHANNEL_NAME + File.separator + Reference.MOD_ID + ".cfg"));
        
        ModBlocks.init();
        
        ModItems.init();
        
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event) {
        
        GameRegistry.registerCraftingHandler(new CraftingHandler());
        
        CraftingManager.init();
        
        
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        
    }

}
