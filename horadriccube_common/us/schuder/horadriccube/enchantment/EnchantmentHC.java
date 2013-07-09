package us.schuder.horadriccube.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentProtection;
import net.minecraft.enchantment.EnumEnchantmentType;

public class EnchantmentHC extends Enchantment{

    public static final Enchantment socket = new EnchantmentSocket(60,1);
    
    protected EnchantmentHC(int par1, int par2, EnumEnchantmentType par3EnumEnchantmentType) {
        super(par1, par2, par3EnumEnchantmentType);
    }
    

}
