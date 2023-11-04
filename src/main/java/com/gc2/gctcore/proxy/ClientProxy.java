package com.gc2.gctcore.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class ClientProxy extends CommonProxy{

    public void registerItemRenderer(Item item, int mate, String id){

        ModelLoader.setCustomModelResourceLocation(item,mate,new ModelResourceLocation(item.getRegistryName(),id));
    }
}
