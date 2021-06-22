package com.forgetemplatemod.templatemod.init;

import com.forgetemplatemod.templatemod.interfaces.IRegisterable;
import com.forgetemplatemod.templatemod.item.AluminumSword;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

import java.util.ArrayList;

public class ItemsRegistry {

    public static final ArrayList<IRegisterable> ITEMS = new ArrayList<IRegisterable>();

//    public static final AluminumIngot aluminumIngot = new AluminumIngot("aluminum_ingot");
    public static final AluminumSword aluminumSword = new AluminumSword("aluminum_sword");
//    public static final AluminumPickaxe aluminumPickaxe = new AluminumPickaxe("aluminum_pickaxe");
//    public static final AluminumAxe aluminumAxe = new AluminumAxe("aluminum_axe");
//    public static final AluminumShovel aluminumShovel = new AluminumShovel("aluminum_shovel");
//    public static final AluminumHoe aluminumHoe = new AluminumHoe("
//    aluminum_hoe");



//	public static final Material TOOL_MATERIAL = EnumHelper.add

    public static void register(IForgeRegistry<Item> registry) {
        registry.registerAll(aluminumSword);
//        registry.registerAll(aluminumIngot, aluminumSword, aluminumPickaxe, aluminumAxe, aluminumShovel, aluminumHoe);
    }

//	public static void registerSwords(IForgeRegistry<ItemSword> registry) {
//
//	}

    public static void registerModels() {
        for(IRegisterable item : ITEMS) {
            item.registerItemModel();
        }

//		aluminumSword.registerItemModel();
//		aluminumPickaxe.registerItemModel();
//		aluminumAxe.registerItemModel();
//		aluminumShovel.registerItemModel();
    }

}