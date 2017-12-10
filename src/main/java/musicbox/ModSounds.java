package musicbox;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

/**
 * Created by dobner on 12/9/2017.
 */
public class ModSounds {
    private static ResourceLocation location = new ResourceLocation(MusicBox.MODID, "owl_noises");
    public static final SoundEvent owlNoises = new SoundEvent(location);

    @SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> evt) {
        IForgeRegistry<SoundEvent> r = evt.getRegistry();
        r.register(owlNoises);
    }
}
