package net.kamikid.chocolate;

import net.fabricmc.api.ModInitializer;
import net.kamikid.chocolate.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Chocolate implements ModInitializer {
	public static final String MOD_ID = "chocolate";
	public static final Logger LOGGER = LoggerFactory.getLogger("modid");



	@Override
	public void onInitialize() {
		ModItems.registerModItems();

	}
}
