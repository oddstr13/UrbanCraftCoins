package no.openshell.oddstr13.urbancraftcoins;

import java.util.*;
import java.io.File;
import net.minecraft.src.BaseMod;
import net.minecraft.src.ModLoader;
import net.minecraft.src.Item;
import net.minecraft.src.forge.*;
//import net.minecraft.client.Minecraft;

public class mod_UrbanCraftCoins extends BaseMod {
    // Copper, Iron, Gold, Jade
    Configuration configuration = new Configuration(new File("config/UrbanCraftCoins.cfg"));
    int coinStartID;
    int coinStartIDa;

    String nameCopperCoin;
    String nameIronCoin;
    String nameSilverCoin;
    String nameGoldCoin;
    String nameJadeCoin;
    String nameX1Coin;
    String nameX2Coin;
    String nameX3Coin;
    String nameSmallCopperCoin;
    String nameSmallIronCoin;
    String nameSmallSilverCoin;
    String nameSmallGoldCoin;
    String nameSmallJadeCoin;
    String nameSmallX1Coin;
    String nameSmallX2Coin;
    String nameSmallX3Coin;

    public Item coinCopper;
    public Item coinIron;
    public Item coinSilver;
    public Item coinGold;
    public Item coinJade;
    public Item coinX1;
    public Item coinX2;
    public Item coinX3;
    public Item smallCoinCopper;
    public Item smallCoinIron;
    public Item smallCoinSilver;
    public Item smallCoinGold;
    public Item smallCoinJade;
    public Item smallCoinX1;
    public Item smallCoinX2;
    public Item smallCoinX3;

    public mod_UrbanCraftCoins() {
    }

    @Override
    public void load(){

        loadConfig();

        //MinecraftForgeClient.preloadTexture("/UrbanCraft/UrbanCraftCoins/gui/items.png");

        coinCopper      = (new UrbanCraftCoinsItem(coinStartIDa)).setItemName("coinCopper");
        coinIron        = (new UrbanCraftCoinsItem(coinStartIDa+1)).setItemName("coinIron");
        coinGold        = (new UrbanCraftCoinsItem(coinStartIDa+2)).setItemName("coinGold");
        coinJade        = (new UrbanCraftCoinsItem(coinStartIDa+3)).setItemName("coinJade");
        coinSilver      = (new UrbanCraftCoinsItem(coinStartIDa+4)).setItemName("coinSilver");
        coinX1          = (new UrbanCraftCoinsItem(coinStartIDa+5)).setItemName("coinX1");
        coinX2          = (new UrbanCraftCoinsItem(coinStartIDa+6)).setItemName("coinX2");
        coinX3          = (new UrbanCraftCoinsItem(coinStartIDa+7)).setItemName("coinX3");


        smallCoinCopper = (new UrbanCraftCoinsItem(coinStartIDa+8)).setItemName("smallCoinCopper");
        smallCoinIron   = (new UrbanCraftCoinsItem(coinStartIDa+9)).setItemName("smallCoinIron");
        smallCoinGold   = (new UrbanCraftCoinsItem(coinStartIDa+10)).setItemName("smallCoinGold");
        smallCoinJade   = (new UrbanCraftCoinsItem(coinStartIDa+11)).setItemName("smallCoinJade");
        smallCoinSilver = (new UrbanCraftCoinsItem(coinStartIDa+12)).setItemName("smallCoinSilver");
        smallCoinX1     = (new UrbanCraftCoinsItem(coinStartIDa+13)).setItemName("smallCoinX1");
        smallCoinX2     = (new UrbanCraftCoinsItem(coinStartIDa+14)).setItemName("smallCoinX2");
        smallCoinX3     = (new UrbanCraftCoinsItem(coinStartIDa+15)).setItemName("smallCoinX3");

        ModLoader.addName(coinCopper, nameCopperCoin);
        ModLoader.addName(coinIron, nameIronCoin);
        ModLoader.addName(coinSilver, nameSilverCoin);
        ModLoader.addName(coinGold, nameGoldCoin);
        ModLoader.addName(coinJade, nameJadeCoin);
        ModLoader.addName(coinX1, nameX1Coin);
        ModLoader.addName(coinX2, nameX2Coin);
        ModLoader.addName(coinX3, nameX3Coin);

        ModLoader.addName(smallCoinCopper, nameSmallCopperCoin);
        ModLoader.addName(smallCoinIron, nameSmallIronCoin);
        ModLoader.addName(smallCoinSilver, nameSmallSilverCoin);
        ModLoader.addName(smallCoinGold, nameSmallGoldCoin);
        ModLoader.addName(smallCoinJade, nameSmallJadeCoin);
        ModLoader.addName(smallCoinX1, nameSmallX1Coin);
        ModLoader.addName(smallCoinX2, nameSmallX2Coin);
        ModLoader.addName(smallCoinX3, nameSmallX3Coin);
    }

    void loadConfig() {
        configuration.load();

        coinStartID = Integer.parseInt(configuration.getOrCreateIntProperty("coinStartID", Configuration.CATEGORY_GENERAL, 17216).value);

        coinStartIDa = coinStartID - 256;

        nameCopperCoin = configuration.getOrCreateProperty("nameCopperCoin", Configuration.CATEGORY_GENERAL, "Copper Coin").value;
        nameIronCoin   = configuration.getOrCreateProperty("nameIronCoin", Configuration.CATEGORY_GENERAL, "Iron Coin").value;
        nameSilverCoin = configuration.getOrCreateProperty("nameSilverCoin", Configuration.CATEGORY_GENERAL, "Silver Coin").value;
        nameGoldCoin   = configuration.getOrCreateProperty("nameGoldCoin", Configuration.CATEGORY_GENERAL, "Gold Coin").value;
        nameJadeCoin   = configuration.getOrCreateProperty("nameJadeCoin", Configuration.CATEGORY_GENERAL, "Jade Coin").value;
        nameX1Coin     = configuration.getOrCreateProperty("nameX1Coin", Configuration.CATEGORY_GENERAL, "X1 Coin").value;
        nameX2Coin     = configuration.getOrCreateProperty("nameX2Coin", Configuration.CATEGORY_GENERAL, "X2 Coin").value;
        nameX3Coin     = configuration.getOrCreateProperty("nameX3Coin", Configuration.CATEGORY_GENERAL, "X3 Coin").value;

        nameSmallCopperCoin = configuration.getOrCreateProperty("nameSmallCopperCoin", Configuration.CATEGORY_GENERAL, "Small Copper Coin").value;
        nameSmallIronCoin   = configuration.getOrCreateProperty("nameSmallIronCoin", Configuration.CATEGORY_GENERAL, "Small Iron Coin").value;
        nameSmallSilverCoin = configuration.getOrCreateProperty("nameSmallSilverCoin", Configuration.CATEGORY_GENERAL, "Small Silver Coin").value;
        nameSmallGoldCoin   = configuration.getOrCreateProperty("nameSmallGoldCoin", Configuration.CATEGORY_GENERAL, "Small Gold Coin").value;
        nameSmallJadeCoin   = configuration.getOrCreateProperty("nameSmallJadeCoin", Configuration.CATEGORY_GENERAL, "Small Jade Coin").value;
        nameSmallX1Coin     = configuration.getOrCreateProperty("nameSmallX1Coin", Configuration.CATEGORY_GENERAL, "Small X1 Coin").value;
        nameSmallX2Coin     = configuration.getOrCreateProperty("nameSmallX2Coin", Configuration.CATEGORY_GENERAL, "Small X2 Coin").value;
        nameSmallX3Coin     = configuration.getOrCreateProperty("nameSmallX3Coin", Configuration.CATEGORY_GENERAL, "Small X3 Coin").value;

        configuration.save();
    }

    @Override
    public String getVersion() {
        return "0.01";
    }

    @Override
    public String getName() {
        return "UrbanCraftCoins";
    }

    @Override
    public String toString() {
        return getName() + " v" + getVersion();
    }
}