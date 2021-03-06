package stargatetech2;

import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import stargatetech2.IContentModule.Module;

public interface ISidedProxy {
	public void registerRenderers(Module module);
	public void registerHandlers();
	public boolean isLocalPlayerInAABB(World world, AxisAlignedBB aabb);
}
