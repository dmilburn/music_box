package musicbox;

import musicbox.blocks.BlockMusicBox;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by dobner on 12/9/2017.
 */
@Mod.EventBusSubscriber
public abstract class CommonProxy {
    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().register(new BlockMusicBox());
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new
                ItemBlock(ModBlocks.musicBox).setRegistryName(ModBlocks.musicBox.getRegistryName()));
    }

    public void preInit() {
    }

    public void init() {

    }

    public void postInit() {

    }
}
