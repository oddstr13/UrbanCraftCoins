package no.openshell.oddstr13.urbancraftcoins;

import java.util.*;
import java.io.File;

import net.minecraft.src.Item;

import net.minecraftforge.common.Property;
import net.minecraftforge.common.Configuration;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PreInit;
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
    int idCopperCoin;
    int idIronCoin;
    int idGoldCoin;
    int idJadeCoin;
    int idSilverCoin;
    int idX1Coin;
    int idX2Coin;
    int idX3Coin;
    int idSmallCopperCoin;
    int idSmallIronCoin;
    int idSmallGoldCoin;
    int idSmallJadeCoin;
    int idSmallSilverCoin;
    int idSmallX1Coin;
    int idSmallX2Coin;
    int idSmallX3Coin;

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
        coinCopper      = (new ItemCoin(idCopperCoin )).setIconIndex(0  + spriteLineAdd).setItemName("coinCopper");
        coinIron        = (new ItemCoin(idIronCoin   )).setIconIndex(1  + spriteLineAdd).setItemName("coinIron");
        coinGold        = (new ItemCoin(idGoldCoin   )).setIconIndex(2  + spriteLineAdd).setItemName("coinGold");
        coinJade        = (new ItemCoin(idJadeCoin   )).setIconIndex(3  + spriteLineAdd).setItemName("coinJade");
        coinSilver      = (new ItemCoin(idSilverCoin )).setIconIndex(4  + spriteLineAdd).setItemName("coinSilver");
        coinX1          = (new ItemCoin(idX1Coin     )).setIconIndex(5  + spriteLineAdd).setItemName("coinX1");
        coinX2          = (new ItemCoin(idX2Coin     )).setIconIndex(6  + spriteLineAdd).setItemName("coinX2");
        coinX3          = (new ItemCoin(idX3Coin     )).setIconIndex(7  + spriteLineAdd).setItemName("coinX3");
        smallCoinCopper = (new ItemCoin(idSmallCopper)).setIconIndex(8  + spriteLineAdd).setItemName("smallCoinCopper");
        smallCoinIron   = (new ItemCoin(idSmallIron  )).setIconIndex(9  + spriteLineAdd).setItemName("smallCoinIron");
        smallCoinGold   = (new ItemCoin(idSmallGold  )).setIconIndex(10 + spriteLineAdd).setItemName("smallCoinGold");
        smallCoinJade   = (new ItemCoin(idSmallJade  )).setIconIndex(11 + spriteLineAdd).setItemName("smallCoinJade");
        smallCoinSilver = (new ItemCoin(idSmallSilver)).setIconIndex(12 + spriteLineAdd).setItemName("smallCoinSilver");
        smallCoinX1     = (new ItemCoin(idSmallX1    )).setIconIndex(13 + spriteLineAdd).setItemName("smallCoinX1");
        smallCoinX2     = (new ItemCoin(idSmallX2    )).setIconIndex(14 + spriteLineAdd).setItemName("smallCoinX2");
        smallCoinX3     = (new ItemCoin(idSmallX3    )).setIconIndex(15 + spriteLineAdd).setItemName("smallCoinX3");

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

        // TODO: Add one config property per item
        idCopperCoin = configuration.getItem("id", "CopperCoin", 17216).value;
        idIronCoin   = configuration.getItem("id", "IronCoin",   17217).value;
        idGoldCoin   = configuration.getItem("id", "GoldCoin",   17218).value;
        idJadeCoin   = configuration.getItem("id", "JadeCoin",   17219).value;
        idSilverCoin = configuration.getItem("id", "SilverCoin", 17220).value;
        idX1Coin     = configuration.getItem("id", "X1Coin",     17221).value;
        idX2Coin     = configuration.getItem("id", "X2Coin",     17222).value;
        idX3Coin     = configuration.getItem("id", "X3Coin",     17223).value;

        idSmallCopperCoin = configuration.getItem("id", "SmallCopperCoin", 17224).value;
        idSmallIronCoin   = configuration.getItem("id", "SmallIronCoin",   17225).value;
        idSmallGoldCoin   = configuration.getItem("id", "SmallGoldCoin",   17226).value;
        idSmallJadeCoin   = configuration.getItem("id", "SmallJadeCoin",   17227).value;
        idSmallSilverCoin = configuration.getItem("id", "SmallSilverCoin", 17228).value;
        idSmallX1Coin     = configuration.getItem("id", "SmallX1Coin",     17229).value;
        idSmallX2Coin     = configuration.getItem("id", "SmallX2Coin",     17230).value;
        idSmallX3Coin     = configuration.getItem("id", "SmallX3Coin",     17231).value;


        spriteLineNumber = configuration.get(Configuration.CATEGORY_GENERAL, "spriteLineNumber", 1, Property.Type.INTEGER).value;

        spriteLineAdd = spriteLineNumber * 16;

        nameCopperCoin = configuration.get("name", "CopperCoin", "Copper Coin", Property.Type.STRING).value;
        nameIronCoin   = configuration.get("name", "IronCoin",   "Iron Coin",   Property.Type.STRING).value;
        nameSilverCoin = configuration.get("name", "SilverCoin", "Silver Coin", Property.Type.STRING).value;
        nameGoldCoin   = configuration.get("name", "GoldCoin",   "Gold Coin",   Property.Type.STRING).value;
        nameJadeCoin   = configuration.get("name", "JadeCoin",   "Jade Coin",   Property.Type.STRING).value;
        nameX1Coin     = configuration.get("name", "X1Coin",     "X1 Coin",     Property.Type.STRING).value;
        nameX2Coin     = configuration.get("name", "X2Coin",     "X2 Coin",     Property.Type.STRING).value;
        nameX3Coin     = configuration.get("name", "X3Coin",     "X3 Coin",     Property.Type.STRING).value;

        nameSmallCopperCoin = configuration.get("name", "SmallCopperCoin", "Small Copper Coin", Property.Type.STRING).value;
        nameSmallIronCoin   = configuration.get("name", "SmallIronCoin",   "Small Iron Coin",   Property.Type.STRING).value;
        nameSmallSilverCoin = configuration.get("name", "SmallSilverCoin", "Small Silver Coin", Property.Type.STRING).value;
        nameSmallGoldCoin   = configuration.get("name", "SmallGoldCoin",   "Small Gold Coin",   Property.Type.STRING).value;
        nameSmallJadeCoin   = configuration.get("name", "SmallJadeCoin",   "Small Jade Coin",   Property.Type.STRING).value;
        nameSmallX1Coin     = configuration.get("name", "SmallX1Coin",     "Small X1 Coin",     Property.Type.STRING).value;
        nameSmallX2Coin     = configuration.get("name", "SmallX2Coin",     "Small X2 Coin",     Property.Type.STRING).value;
        nameSmallX3Coin     = configuration.get("name", "SmallX3Coin",     "Small X3 Coin",     Property.Type.STRING).value;

        configuration.save();
    }

    //@Override
    //public String toString() {
    //    return getName() + " v" + getVersion();
    //}
}
