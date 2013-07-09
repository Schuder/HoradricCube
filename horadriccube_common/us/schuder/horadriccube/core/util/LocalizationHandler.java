package us.schuder.horadriccube.core.util;

import net.minecraft.item.ItemStack;
import us.schuder.horadriccube.block.ModBlocks;
import us.schuder.horadriccube.item.ModItems;
import us.schuder.horadriccube.lib.Localizations;

import cpw.mods.fml.common.registry.LanguageRegistry;

/**
 * Horadric-Cube
 * 
 * LocalizationHandler
 * 
 * @author Schuder
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class LocalizationHandler {
    
    public static void loadLanguagesManual() {

    }
    
    public static void loadLanguages() {

        // For every file specified in the Localization library class, load them into the Language Registry
        for (String localizationFile : Localizations.localeFiles) {
            LanguageRegistry.instance().loadLocalization(localizationFile, LocalizationUtil.getLocaleFromFileName(localizationFile), LocalizationUtil.isXMLLanguageFile(localizationFile));
        }
        
        
    }
    
}
