package org.oakbricks.firearms;

import net.fabricmc.api.ModInitializer;
import org.oakbricks.firearms.registry.ModItems;

public class OaksFirearms implements ModInitializer {

	public static String MOD_ID = "oakfirearms";

	@Override
	public void onInitialize() {	// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		ModItems.registerItems();

	}

}
