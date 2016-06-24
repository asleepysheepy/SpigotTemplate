package net.flutterflies.template;

import net.flutterflies.template.util.Language;
import net.flutterflies.template.util.Settings;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public class Template extends JavaPlugin {

    /**
     * The instance of the wrapper class for the plugin's
     * configuration file.
     */
    private Settings settings;

    /**
     * The instance of the wrapper class for the plugin's
     * language localization file
     */
    private Language language;

    /**
     * Method called when the plugin gets enabled on the server.
     * Initializes all aspects of the plugin.
     */
    @Override
    public void onEnable() {
        initFiles();
        registerListeners();
        registerCommands();

        settings = new Settings(getConfig());
        language = new Language(getDataFolder());
    }

    /**
     * Method called when the plugin gets disabled. Safely stops all of the plugins processes.
     */
    @Override
    public void onDisable() {

    }

    /**
     * Make sure all of the necessary plugin files exist in the plugin's data folder.
     */
    private void initFiles() {
        saveDefaultConfig();

        File lang = new File(getDataFolder(), "lang.yml");
        if(!lang.exists()) {
            saveResource("lang.yml", false);
        }
    }

    /**
     * Register all of the listeners used by the plugin.
     */
    private void registerListeners() {

    }

    /**
     * Register all of the command executors and tab completers for the plugin's commands
     */
    private void registerCommands() {

    }

    /**
     * Get the instance of the plugin's config wrapper.
     *
     * @return The plugin's config wrapper.
     */
    public Settings getSettings() {
        return settings;
    }

    /**
     * Get the instance of the plugin's lang file wrapper.
     *
     * @return the plugin's lang wrapper.
     */
    public Language getLanguage() {
        return language;
    }
}
