package com.bedless.instanceexample;

import org.bukkit.plugin.java.JavaPlugin;

public final class InstanceExample extends JavaPlugin {

    private static InstanceExample instance;
    @Override
    public void onEnable() {
        instance = this;
    }

    @Override
    public void onDisable() {

    }

    public static InstanceExample getInstance(){
        return instance;
    }
}
