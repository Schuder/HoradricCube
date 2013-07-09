package us.schuder.horadriccube.block;

import net.minecraft.block.material.Material;
import net.minecraft.world.World;

public class BlockHoradricCube extends BlockHC{

    public BlockHoradricCube(int id) {
        super(id, Material.iron);
    }
    
    public boolean canPlaceBlockAt(World par1World, int par2, int par3, int par4)
    {
        return false;
    }

}
