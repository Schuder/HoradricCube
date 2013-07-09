package us.schuder.horadriccube.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;

public class EnchantmentSocket  extends EnchantmentHC {

    protected EnchantmentSocket(int par1, int par2) {
        super(par1, par2, EnumEnchantmentType.weapon);
        this.setName("socket");
        this.type= EnumEnchantmentType.all;
    }

}
