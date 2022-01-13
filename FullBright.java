package com.github.poisonoustater.mod.impl;

import com.github.poisonoustater.event.EventTarget;
import com.github.poisonoustater.event.impl.EventUpdate;
import com.github.poisonoustater.mod.Category;
import com.github.poisonoustater.mod.Mod;
import org.lwjgl.input.Keyboard;

public class FullBright extends Mod {
    private float oldBrightness;

    public FullBright() {
        super("FullBringt", "Makes Stuff nice and shiny", Category.MISC);
    }

    @Override
    public void onEnable() {
        super.onEnable();

        oldBrightness = mc.gameSettings.saturation;
    }

    @EventTarget
    public void onUpdate(EventUpdate event) {
        mc.gameSettings.saturation = 1000F;
    }

    @Override
    public void onDisable() {
        super.onDisable();

        mc.gameSettings.saturation = oldBrightness;
    }
}