package com.nincodedo.nincraftythings.handler;

import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import com.nincodedo.nincraftythings.reference.Settings;

public class ThunderJoinHandler {

	private boolean isPlayerThundertastic(EntityPlayerMP player) {

		boolean thundery = false;

		for (int i = 0; i < Settings.Silly.thunderList.length; i++) {
			if (Settings.Silly.thunderList[i].equals(player.getDisplayName())) {
				thundery = true;
			}
		}
		return thundery;
	}

	@SubscribeEvent
	public void onPlayerJoin(EntityJoinWorldEvent event) {
		if (event.entity instanceof EntityPlayerMP) {
			EntityPlayerMP player = (EntityPlayerMP) event.entity;
			World world = event.world;
			if (isPlayerThundertastic(player)) {
				world.spawnEntityInWorld(new EntityLightningBolt(world,
						player.posX, 257, player.posZ));
			}
		}
	}

}
