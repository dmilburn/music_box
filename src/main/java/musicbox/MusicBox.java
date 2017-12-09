package musicbox;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by dobner on 12/9/2017.
 */
@Mod(modid = MusicBox.MODID, version = MusicBox.VERSION)
public class MusicBox {
    public static final String MODID = "musicbox";
    public static final String VERSION = "1.0";

    @SidedProxy(clientSide="musicbox.ClientOnlyProxy", serverSide = "musicbox.DedicatedServerProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init();
    }

    @Mod.EventHandler
    public void init(FMLPostInitializationEvent event) {
        proxy.postInit();
    }

    public static String prependModID(String name) {
        return MODID + ":" + name;
    }
}
