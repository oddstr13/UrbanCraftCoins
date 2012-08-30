package no.openshell.oddstr13.urbancraftcoins;

import net.minecraft.src.Item;
import net.minecraft.src.forge.*;

public class UrbanCraftCoinsItem extends Item implements ITextureProvider {
    public UrbanCraftCoinsItem(int i) {
        super(i);
    }
    
    @Override
    public String getTextureFile() {
        return "/UrbanCraft/UrbanCraftCoins/gui/items.png";
    }
}