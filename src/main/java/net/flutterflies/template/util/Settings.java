package net.flutterflies.template.util;

import org.bukkit.configuration.file.FileConfiguration;

public class Settings {

    /**
     * The plugin's configuration file
     */
    private FileConfiguration config;

    /**
     * Construct a new instance of the settings class.
     *
     * @param config The plugin's configuration file
     */
    public Settings(FileConfiguration config) {
        this.config = config;
        loadSettings();
    }

    /**
     * Load all of the plugin's settings from the configuration file.
     */
    private void loadSettings() {

    }
}
