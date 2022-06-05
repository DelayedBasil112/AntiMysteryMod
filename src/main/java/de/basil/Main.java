package de.basil;

import de.basil.listener.PluginMessageListener;
import net.labymod.api.LabyModAddon;
import net.labymod.settings.elements.SettingsElement;

import java.util.List;

public class Main extends LabyModAddon {
    @Override
    public void onEnable() {
       this.getApi().getEventManager().register(new PluginMessageListener());
    }

    @Override
    public void loadConfig() {

    }

    @Override
    protected void fillSettings(List<SettingsElement> list) {

    }
}
