package com.gc2.gctcore.init;

import com.gc2.gctcore.blocks.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {

    public static final List<Block> BLOCKS = new ArrayList<>();

    public static final Block ICE_ALLOY_BLOCK = new BlockBase("ice_alloy_block",Material.IRON);
}
