package no.openshell.oddstr13.urbancraftcoins;

import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy {
    @Override
    public void registerRenderInformation() {
        MinecraftForgeClient.preloadTexture("/UrbanCraft/UrbanCraftCoins/gui/items.png");
    }
}