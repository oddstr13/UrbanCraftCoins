package no.openshell.oddstr13.urbancraftcoins;

import java.util.*;
import java.io.File;

import net.minecraft.src.Item;

import net.minecraftforge.common.Configuration;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod( modid = "mod_UrbanCraftCoins", name="UrbanCraft Coins", version="0.03")
@NetworkMod (
    clientSideRequired = true,
    serverSideRequired = false
    //channels = {},
    //packetHandler = PacketHandler.class
    //connectionHandler = ConnectionHandler.class,//TODO
)

public class mod_UrbanCraftCoins {
    @SidedProxy(clientSide = "no.openshell.oddstr13.urbancraftcoins.ClientProxy", serverSide = "no.openshell.oddstr13.urbancraftcoins.CommonProxy")
    public static CommonProxy proxy; //This object will be populated with the class that you choose for the environment
    @Instance
    public static mod_UrbanCraftCoins instance; //The instance of the mod that will be defined, populated, and callable



    // Copper, Iron, Gold, Jade
    Configuration configuration;
    int coinStartID;
    int coinStartIDa;
    int spriteLineNumber;
    int spriteLineAdd;

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

    @PreInit
    public void preInit(FMLPreInitializationEvent event) {
        configuration = new Configuration(new File(event.getModConfigurationDirectory(), "UrbanCraftCoins.cfg"));
        loadConfig();
    }


    @Init
    public void load(FMLInitializationEvent event){
        coinCopper      = (new ItemCoin(coinStartIDa)).setIconIndex(0+spriteLineAdd).setItemName("coinCopper");
        coinIron        = (new ItemCoin(coinStartIDa+1)).setIconIndex(1+spriteLineAdd).setItemName("coinIron");
        coinGold        = (new ItemCoin(coinStartIDa+2)).setIconIndex(2+spriteLineAdd).setItemName("coinGold");
        coinJade        = (new ItemCoin(coinStartIDa+3)).setIconIndex(3+spriteLineAdd).setItemName("coinJade");
        coinSilver      = (new ItemCoin(coinStartIDa+4)).setIconIndex(4+spriteLineAdd).setItemName("coinSilver");
        coinX1          = (new ItemCoin(coinStartIDa+5)).setIconIndex(5+spriteLineAdd).setItemName("coinX1");
        coinX2          = (new ItemCoin(coinStartIDa+6)).setIconIndex(6+spriteLineAdd).setItemName("coinX2");
        coinX3          = (new ItemCoin(coinStartIDa+7)).setIconIndex(7+spriteLineAdd).setItemName("coinX3");
        smallCoinCopper = (new ItemCoin(coinStartIDa+8)).setIconIndex(8+spriteLineAdd).setItemName("smallCoinCopper");
        smallCoinIron   = (new ItemCoin(coinStartIDa+9)).setIconIndex(9+spriteLineAdd).setItemName("smallCoinIron");
        smallCoinGold   = (new ItemCoin(coinStartIDa+10)).setIconIndex(10+spriteLineAdd).setItemName("smallCoinGold");
        smallCoinJade   = (new ItemCoin(coinStartIDa+11)).setIconIndex(11+spriteLineAdd).setItemName("smallCoinJade");
        smallCoinSilver = (new ItemCoin(coinStartIDa+12)).setIconIndex(12+spriteLineAdd).setItemName("smallCoinSilver");
        smallCoinX1     = (new ItemCoin(coinStartIDa+13)).setIconIndex(13+spriteLineAdd).setItemName("smallCoinX1");
        smallCoinX2     = (new ItemCoin(coinStartIDa+14)).setIconIndex(14+spriteLineAdd).setItemName("smallCoinX2");
        smallCoinX3     = (new ItemCoin(coinStartIDa+15)).setIconIndex(15+spriteLineAdd).setItemName("smallCoinX3");

        LanguageRegistry.addName(coinCopper, nameCopperCoin);
        LanguageRegistry.addName(coinIron, nameIronCoin);
        LanguageRegistry.addName(coinSilver, nameSilverCoin);
        LanguageRegistry.addName(coinGold, nameGoldCoin);
        LanguageRegistry.addName(coinJade, nameJadeCoin);
        LanguageRegistry.addName(coinX1, nameX1Coin);
        LanguageRegistry.addName(coinX2, nameX2Coin);
        LanguageRegistry.addName(coinX3, nameX3Coin);
        LanguageRegistry.addName(smallCoinCopper, nameSmallCopperCoin);
        LanguageRegistry.addName(smallCoinIron, nameSmallIronCoin);
        LanguageRegistry.addName(smallCoinSilver, nameSmallSilverCoin);
        LanguageRegistry.addName(smallCoinGold, nameSmallGoldCoin);
        LanguageRegistry.addName(smallCoinJade, nameSmallJadeCoin);
        LanguageRegistry.addName(smallCoinX1, nameSmallX1Coin);
        LanguageRegistry.addName(smallCoinX2, nameSmallX2Coin);
        LanguageRegistry.addName(smallCoinX3, nameSmallX3Coin);
    }

    void loadConfig() {
        configuration.load();

        coinStartID = Integer.parseInt(configuration.getOrCreateIntProperty("coinStartID", Configuration.CATEGORY_GENERAL, 17216).value);
        spriteLineNumber = Integer.parseInt(configuration.getOrCreateIntProperty("spriteLineNumber", Configuration.CATEGORY_GENERAL, 1).value);


        coinStartIDa = coinStartID - 256;
        spriteLineAdd = spriteLineNumber * 16;

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

    //@Override
    //public String toString() {
    //    return getName() + " v" + getVersion();
    //}
}
