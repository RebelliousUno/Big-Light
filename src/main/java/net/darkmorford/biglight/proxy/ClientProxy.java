package net.darkmorford.biglight.proxy;

import net.darkmorford.biglight.init.Blocks;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(Side.CLIENT)
public class ClientProxy extends CommonProxy
{
	@SubscribeEvent
	public static void registerModels(ModelRegistryEvent event)
	{
		Blocks.initModels();
	}
}
