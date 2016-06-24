/**
 * File created 23 June 2016
 *
 * Distributed as part of Lucavrynn. A Discord integration for Spigot 1.10
 * made by Ashrynn Macke (Flutterflies). You should have received a copy
 * of the MIT license with this code, if not please find it here:
 * https://opensource.org/licenses/MIT
 */
package net.flutterflies.template.util;

import org.bukkit.ChatColor;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;

/**
 * Class used to get localized language strings.
 *
 * @author Ashrynn Macke | Flutterflies
 * @since 1.0
 */
public class Language {

    /**
     * The Yaml file that contains the localized strings.
     */
    private YamlConfiguration langYamlFile;

    /**
     * @param pluginDataFolder This plugin's data folder.
     */
    public Language(File pluginDataFolder) {
        File langFile = new File(pluginDataFolder, "lang.yml");

        langYamlFile = YamlConfiguration.loadConfiguration(langFile);
    }

    /**
     * Get a string from the language yaml file.
     *
     * @param yamlKey The yaml key corresponding to the desired string.
     *
     * @return The localized string.
     */
    public String getString(String yamlKey) {
        String message = langYamlFile.getString(yamlKey);
        if(message.contains("&")) {
            message = ChatColor.translateAlternateColorCodes('&', message);
        }

        return message;
    }
}
