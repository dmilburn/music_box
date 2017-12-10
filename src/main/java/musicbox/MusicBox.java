package musicbox;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

/**
 * Created by dobner on 12/9/2017.
 */
@Mod(modid = MusicBox.MODID, version = MusicBox.VERSION)
public class MusicBox {
    public static final String MODID = "musicbox";
    public static final String VERSION = "1.0";

    @SidedProxy(clientSide="musicbox.ClientOnlyProxy", serverSide = "musicbox.DedicatedServerProxy")
    public static CommonProxy proxy;

    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
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
