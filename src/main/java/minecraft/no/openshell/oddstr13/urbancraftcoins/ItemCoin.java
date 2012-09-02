package no.openshell.oddstr13.urbancraftcoins;

import net.minecraft.src.Item;
import net.minecraft.src.CreativeTabs;

public class ItemCoin extends Item {
    public ItemCoin(int i) {
        super(i);
        //setCreativeTab(CreativeTabs.tabMisc);
        setTabToDisplayOn(CreativeTabs.tabMisc);
    }

    @Override
    public String getTextureFile() {
        return "/UrbanCraft/UrbanCraftCoins/gui/items.png";
    }
}