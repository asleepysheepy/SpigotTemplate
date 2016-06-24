/**
 * File created 23 June 2016
 *
 * Distributed as part of Lucavrynn. A Discord integration for Spigot 1.10
 * made by Ashrynn Macke (Flutterflies). You should have received a copy
 * of the MIT license with this code, if not please find it here:
 * https://opensource.org/licenses/MIT
 */
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
