package cn.nukkit.block;

import cn.nukkit.api.PowerNukkitOnly;
import cn.nukkit.api.Since;
import cn.nukkit.item.ItemTool;

/**
 * @author LoboMetalurgico
 * @since 08/06/2021
 */

@PowerNukkitOnly
@Since("FUTURE")
public abstract class BlockRaw extends BlockSolidMeta {
    @PowerNukkitOnly
    @Since("FUTURE")
    public BlockRaw() {
        this(0);
    }

    @PowerNukkitOnly
    @Since("FUTURE")
    public BlockRaw(int meta) {
        super(meta);
    }

    @Override
    public double getHardness() {
        return 5;
    }

    @Override
    public double getResistance() {
        return 6;
    }

    @Override
    public int getToolType() {
        return ItemTool.TYPE_PICKAXE;
    }

    @Since("1.4.0.0-PN")
    @PowerNukkitOnly
    @Override
    public int getToolTier() {
        return ItemTool.TIER_STONE;
    }

    @Override
    public boolean canHarvestWithHand() {
        return false;
    }

    @Override
    public boolean isLavaResistant() {
        return true;
    }
}
