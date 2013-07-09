package us.schuder.horadriccube.block;

import us.schuder.horadriccube.HoradricCube;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockHC extends Block{

    private String icon;

    public BlockHC(int par1, Material par2Material) {
        super(par1, par2Material);
        this.setCreativeTab(HoradricCube.tabsHC);
    }
    
    public Block icon(String par1str) {
        
        this.icon = par1str;
        return this;
        
    }
    
    @Override
    public void registerIcons(IconRegister iconRegister) 
    {
            this.blockIcon = iconRegister.registerIcon("HoradricCube:" + this.icon);
    }
    

}
