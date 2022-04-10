package io.github.stonewall0201.acutils;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ACUtils implements ClientModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("AC-Utils");
    @Override
    public void onInitializeClient() {
        LOGGER.info("Thanks for using AC-Utils!");
    }
}
