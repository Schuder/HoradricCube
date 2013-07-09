package us.schuder.horadriccube.core.handlers;

import us.schuder.horadriccube.block.ModBlocks;
import us.schuder.horadriccube.enchantment.EnchantmentHC;
import us.schuder.horadriccube.item.ItemGemstone;
import us.schuder.horadriccube.lib.BlockIds;
import us.schuder.horadriccube.lib.GemstoneEffects;
import us.schuder.horadriccube.lib.ItemIds;
import us.schuder.horadriccube.lib.Reference;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import cpw.mods.fml.common.ICraftingHandler;

/**
 * Horadric-Cube
 * 
 * CraftingHandler
 * 
 * @author Schuder
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class CraftingHandler implements ICraftingHandler {

    @Override
    public void onCrafting(EntityPlayer player, ItemStack itemStack,IInventory inv) {
            
            int invSize = inv.getSizeInventory();
            int gemCount = 0;
            
            ItemStack cube=null;
            ItemStack tool=null;
            ItemStack gem = null;
            ItemStack hammer = null;
            ItemStack material = null;
            
            for(int i=0; i < invSize; i++) {
                
                ItemStack invItemStack = inv.getStackInSlot(i);
                
                if(invItemStack != null) {
                    
                    if(invItemStack.itemID == BlockIds.HORADRIC_CUBE) {
                        cube = invItemStack;
                    }
                    else if (invItemStack.itemID == ItemIds.HORADRIC_MALUS+ Reference.SHIFTED_OFFSET) {
                        hammer = invItemStack;
                    }
                    else if(invItemStack.itemID == ItemIds.GEMSTONE + Reference.SHIFTED_OFFSET || invItemStack.itemID == ItemIds.GEMSTONE_TIER2 + Reference.SHIFTED_OFFSET || invItemStack.itemID == ItemIds.GEMSTONE_TIER3 + Reference.SHIFTED_OFFSET ) {
                        
                        gem = invItemStack;
                        gemCount++;
                        
                    }
                    else if(invItemStack.itemID == Item.ingotIron.itemID + Reference.SHIFTED_OFFSET || invItemStack.itemID == Item.ingotGold.itemID + Reference.SHIFTED_OFFSET || invItemStack.itemID == Item.diamond.itemID + Reference.SHIFTED_OFFSET ||invItemStack.itemID == Item.leather.itemID + Reference.SHIFTED_OFFSET ) {
                        material = invItemStack;
                    }
                    else {
                        tool = invItemStack;
                    }
                             
                }
                  
            }
            
            
            if(cube != null && tool != null && gem!=null) {
            
                horadricCubeHandler(itemStack,tool,gem,inv,gemCount);

            }
            else if(hammer != null && tool!=null && material !=null) {
                
                
                
            }
            else {
                returnItems(inv,false);
            }
        
        
    }

    @Override
    public void onSmelting(EntityPlayer player, ItemStack item) {
        // TODO Auto-generated method stub
        
    }
    
    public void horadricCubeHandler(ItemStack itemStack, ItemStack tool,ItemStack gem,IInventory inv, int gemCount) {
        NBTTagList enchList = tool.getEnchantmentTagList();
        
        
        int enchCount = 0;
        short socketLvl = 0;
        Class<? extends Item> itemClass = itemStack.getItem().getClass();
        NBTTagCompound ench1 = null;
        NBTTagCompound ench2 = null;
        NBTTagCompound ench3 = null;
        NBTTagCompound ench4 = null;
        if (enchList != null) {
            
            enchCount = enchList.tagCount();
            ench1 = (NBTTagCompound) enchList.tagAt(0);

            
            if(ench1.getShort("id")==60) {
                socketLvl = ench1.getShort("lvl");
            }
            else if (ench2 != null) {
                ench2 = (NBTTagCompound) enchList.tagAt(1);
                socketLvl = (short) ench2.getShort("lvl");
            }
            
        }
        
        if(gemCount == 1) {
            
            int gemTier = ((ItemGemstone) gem.getItem()).tier;

            if(gem.getItemDamage() == 12) {
                
                if(enchCount == 0 && getMaxSocket(itemStack.getItem()) > 0) {
                                  
                            itemStack.addEnchantment(EnchantmentHC.socket, 1);
                            returnItems(inv,false);

                    
                }
                else if(enchCount == 1 && ench1.getShort("id") == 60 && ench1.getShort("lvl") < getMaxSocket(itemStack.getItem())) {
                        
                            itemStack.addEnchantment(EnchantmentHC.socket, socketLvl+1);
                            returnItems(inv,false);
                    
                }
                else {
                    
                    itemStack = applyEnchantments(itemStack,enchList,null,null);
                    returnItems(inv,true);
                    
                }
                
            }
            else {
                if (socketLvl == 0) {
                    
                    if (enchList != null) {
                        itemStack = applyEnchantments(itemStack,enchList,null,null);
                    }
                    System.out.println("Full");
                    returnItems(inv,true);
                }
                else{

                    Enchantment gemstoneEffect = null;
                    int gemMeta = gem.getItemDamage();
                    
                    if(itemClass == ItemSword.class) {
                        gemstoneEffect = GemstoneEffects.SWORD_ENCHANTMENTS[gemMeta];
                    }
                    else if (itemClass == ItemPickaxe.class || itemClass == ItemSpade.class) {
                        gemstoneEffect = GemstoneEffects.PICK_SPADE_ENCHANTMENTS[gemMeta];
                    }
                    else if (itemClass == ItemAxe.class) {
                        gemstoneEffect = GemstoneEffects.AXE_ENCHANTMENTS[gemMeta];
                    }
                    else if (itemClass == ItemHoe.class) {
                        gemstoneEffect = Enchantment.unbreaking;
                    }
                    else if (itemClass == ItemArmor.class) {
                        
                        int armorType =((ItemArmor) itemStack.getItem()).armorType;
                        
                        if (armorType == 0) {
                            gemstoneEffect = GemstoneEffects.HELMET_ENCHANTMENTS[gemMeta];
                        }
                        else if (armorType == 1 || armorType == 2) {
                            gemstoneEffect = GemstoneEffects.PLATE_LEGS_ENCHANTMENTS[gemMeta];
                        }
                        else if (armorType == 3){
                            gemstoneEffect = GemstoneEffects.BOOTS_ENCHANTMENTS[gemMeta];
                        }
                    }
                    
                    itemStack = applyEnchantments(itemStack,enchList,gemstoneEffect,gem);
                    
                    System.out.println(socketLvl);
                    returnItems(inv,false);

                }
                
                
            }
            
        }
        else if(gemCount > 1){
            
            //Rune Words
        }
    }
    
    public ItemStack applyEnchantments(ItemStack item, NBTTagList enchantmentSource, Enchantment newEnchantment, ItemStack gemStack) {

        if (enchantmentSource==null) {
            return item;
        }
        
        int enchCount = enchantmentSource.tagCount();
        int newEnchantmentId = -1;
        int newEnchantmentLvl = -1;
        ItemGemstone gem = null;
        
        boolean enchantmentAdded = false;
        
        if(newEnchantment != null) {
            newEnchantmentId = newEnchantment.effectId;
        }
        
        if(gemStack !=null) {
            gem = (ItemGemstone) gemStack.getItem();
            newEnchantmentLvl = gem.tier;
        }
        
        for(int j = 0; j < enchCount; j++) {
            
            NBTBase ench = enchantmentSource.tagAt(j);    
            
            if(ench.getClass() == NBTTagCompound.class) {
            
                Short id = ((NBTTagCompound) ench).getShort("id");
                Short lvl = ((NBTTagCompound) ench).getShort("lvl");
                
                if(id == 60) {
                    
                    if(newEnchantment != null) {
                        lvl--;
                    }
                    
                    item.addEnchantment(EnchantmentHC.socket, lvl);
                    
                }
                else if(id == newEnchantmentId) {
                    item.addEnchantment(newEnchantment, lvl+newEnchantmentLvl);
                    enchantmentAdded = true;
                }
                else {
                    item.addEnchantment(Enchantment.enchantmentsList[id], lvl);
                }
                
            }
            
        }
        
        if(newEnchantment!=null && !(enchantmentAdded)){
            item.addEnchantment(newEnchantment, newEnchantmentLvl);
        }
        
        return item;
    }
    
    public void returnItems(IInventory inv, boolean refundGems) {
        
        int invSize = inv.getSizeInventory();
        
        for(int i=0; i < invSize; i++) {
            
            ItemStack invItemStack = inv.getStackInSlot(i);
            
            
            if(invItemStack != null) {
                int invItemStackSize = invItemStack.stackSize;    
                if(invItemStack.itemID == BlockIds.HORADRIC_CUBE) {

                    ItemStack horadricCube = new ItemStack(ModBlocks.horadricCube,invItemStackSize+1);
                    inv.setInventorySlotContents(i, horadricCube);
                    
                }
                else if((invItemStack.itemID == ItemIds.GEMSTONE + Reference.SHIFTED_OFFSET ||invItemStack.itemID == ItemIds.GEMSTONE_TIER2 + Reference.SHIFTED_OFFSET ||invItemStack.itemID == ItemIds.GEMSTONE_TIER3 + Reference.SHIFTED_OFFSET)  && refundGems) {
                    
                    ItemStack gem = new ItemStack(invItemStack.getItem(),invItemStackSize+1,invItemStack.getItemDamage());
                    inv.setInventorySlotContents(i, gem);
                    
                }
                         
            }
              
        }
        
    }
    
    public int getMaxSocket(Item item) {
        
        Class<? extends Item> itemClass = item.getClass();
        int baseItemSocket = 0;
        int maxSocket = 0;
        
        if(itemClass == ItemSword.class) {
            baseItemSocket = 3;
            maxSocket = baseItemSocket - socketModifier(item); 
            System.out.println(maxSocket);
        }
        else if (itemClass == ItemPickaxe.class) {
            baseItemSocket = 3;
            maxSocket = baseItemSocket - socketModifier(item); 
        }
        else if (itemClass == ItemSpade.class) {
            baseItemSocket = 2;
            maxSocket = baseItemSocket - socketModifier(item); 
        }
        else if (itemClass == ItemAxe.class) {
            baseItemSocket = 4;
            maxSocket = baseItemSocket - socketModifier(item); 
        }
        else if (itemClass == ItemHoe.class) {
            baseItemSocket = 2;
            maxSocket = baseItemSocket - socketModifier(item); 
        }
        else if (itemClass == ItemArmor.class) {
            
            int armorType =((ItemArmor) item).armorType;
            
            if (armorType == 0) {
                baseItemSocket = 3;
                maxSocket = baseItemSocket - socketModifier(item); 
            }
            else if (armorType == 1) {
                baseItemSocket = 4;
                maxSocket = baseItemSocket - socketModifier(item); 
            }
            else if (armorType == 2) {
                baseItemSocket = 2;
                maxSocket = baseItemSocket - socketModifier(item); 
            }
            else if (armorType == 3){
                baseItemSocket = 2;  
                maxSocket = baseItemSocket - socketModifier(item); 
            }
        }
        
        maxSocket = Math.max(0,maxSocket);
        System.out.println(maxSocket);
        
        return maxSocket;
        
        
        
    }
    
    public int socketModifier(Item item) {
        
        int itemEnchantability = item.getItemEnchantability();
        int socketModifier = 0;
        
        int WOOD = 15;
        int STONE = 5;
        int IRON = 14;
        int GOLD = 22;
        int EMERALD = 10;
        
        int LEATHER_ARMOR = 15;
        int IRON_ARMOR = 9;
        int GOLD_ARMOR = 25;
        int EMERALD_ARMOR = 10;
        
        if (itemEnchantability == WOOD) {
            
            socketModifier = 4;
        }
        else if (itemEnchantability == LEATHER_ARMOR) {
            socketModifier = 3;
        }
        else if (itemEnchantability == STONE) {
            socketModifier = 3;
        }
        else if (itemEnchantability == IRON || itemEnchantability == IRON_ARMOR) {
            socketModifier = 2;
        }
        else if (itemEnchantability == GOLD || itemEnchantability == GOLD_ARMOR) {
            socketModifier = 0;
        }
        else if (itemEnchantability == EMERALD || itemEnchantability == EMERALD_ARMOR) {
            socketModifier = 1;
        }

        return socketModifier;
        
    }
                   
    }


