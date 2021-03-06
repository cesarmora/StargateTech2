package stargatetech2;

import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import stargatetech2.IContentModule.Module;
import stargatetech2.common.util.GUIHandler;
import cpw.mods.fml.common.network.NetworkRegistry;

public class ProxyServer implements ISidedProxy{
	
	/* Unimplemented Client-Side methods. */
	@Override public void registerRenderers(Module module){}
	@Override public boolean isLocalPlayerInAABB(World world, AxisAlignedBB aabb){ return false; }

	@Override
	public void registerHandlers() {
		NetworkRegistry.instance().registerGuiHandler(this, new GUIHandler());
	}
}