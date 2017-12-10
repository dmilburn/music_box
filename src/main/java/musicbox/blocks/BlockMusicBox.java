package musicbox.blocks;

import musicbox.ModSounds;
import musicbox.MusicBox;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.apache.logging.log4j.Level;

/**
 * Created by dobner on 12/9/2017.
 */
public class BlockMusicBox extends Block {
    public BlockMusicBox() {
        super(Material.ROCK);
        this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        this.setUnlocalizedName(MusicBox.MODID + ".musicBox");
        this.setRegistryName("musicBox");
    }

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        if (worldIn.isRemote) {
            return true;
        } else {
            MusicBox.logger.log(Level.INFO, "OWLSSS");
            worldIn.playSound(null, pos, ModSounds.owlNoises, SoundCategory.MUSIC, 1.0F, 1.0F);
            return true;
        }
    }
}
