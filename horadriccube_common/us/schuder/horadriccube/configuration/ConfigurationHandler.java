package us.schuder.horadriccube.configuration;

import java.io.File;
import java.util.logging.Level;

import us.schuder.horadriccube.lib.BlockIds;
import us.schuder.horadriccube.lib.ItemIds;
import us.schuder.horadriccube.lib.Reference;
import us.schuder.horadriccube.lib.Strings;

import net.minecraftforge.common.Configuration;

import cpw.mods.fml.common.FMLLog;

/**
 * Horadric-Cube
 * 
 * ConfigurationGandler
 * 
 * @author Schuder
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
public class ConfigurationHandler {

    public static Configuration configuration;

    public static void init(File configFile) {

        configuration = new Configuration(configFile);

        try {
            configuration.load();

            /* Block configs */
            BlockIds.HORADRIC_CUBE = configuration.getBlock(Strings.HORADRIC_CUBE_NAME,BlockIds.HORADRIC_CUBE_DEFAULT).getInt(BlockIds.HORADRIC_CUBE_DEFAULT);

            /* Item configs */
            ItemIds.GEMSTONE = configuration.getItem(Strings.GEMSTONE_NAME,ItemIds.GEMSTONE_DEFAULT).getInt(ItemIds.GEMSTONE_DEFAULT);
            ItemIds.GEMSTONE_TIER2 = configuration.getItem(Strings.GEMSTONE_TIER2_NAME,ItemIds.GEMSTONE_TIER2_DEFAULT).getInt(ItemIds.GEMSTONE_TIER2_DEFAULT);
            ItemIds.GEMSTONE_TIER3 = configuration.getItem(Strings.GEMSTONE_TIER3_NAME,ItemIds.GEMSTONE_TIER3_DEFAULT).getInt(ItemIds.GEMSTONE_TIER3_DEFAULT);
            ItemIds.HORADRIC_MALUS = configuration.getItem(Strings.HORADRIC_MALUS_NAME,ItemIds.HORADRIC_MALUS_DEFAULT).getInt(ItemIds.HORADRIC_MALUS_DEFAULT);
            
        }
        catch (Exception e) {
            FMLLog.log(Level.SEVERE, e, Reference.MOD_NAME + " has had a problem loading its configuration");
        }
        finally {
            configuration.save();
        }
    }

    public static void set(String categoryName, String propertyName, String newValue) {

        configuration.load();
        if (configuration.getCategoryNames().contains(categoryName)) {
            if (configuration.getCategory(categoryName).containsKey(propertyName)) {
                configuration.getCategory(categoryName).get(propertyName).set(newValue);
            }
        }
        configuration.save();
    }
}
