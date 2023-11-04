package com.gc2.gctcore.items;

import com.gc2.gctcore.Main;
import com.gc2.gctcore.init.ModItems;
import com.gc2.gctcore.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

    public ItemBase(String name){

        setTranslationKey(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MATERIALS);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels(){
        Main.proxy.registerItemRenderer(this,0,"inventory");
    }
}
