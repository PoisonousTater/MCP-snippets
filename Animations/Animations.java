package com.github.poisonoustater.mod.impl;

import com.github.poisonoustater.event.EventTarget;
import com.github.poisonoustater.event.impl.EventUpdate;
import com.github.poisonoustater.mod.Category;
import com.github.poisonoustater.mod.Mod;

import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.renderer.ItemRenderer;

public class Animations extends Mod{

	


	public Animations() {
		super("Animation", "aski", Category.MISC);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isEnabled() {
	
		return super.isEnabled();
	}
	
	
	@Override
	public void onEnable() {
		super.onEnable();
		
		System.out.println("Animations Mod Enabled ");
		
	}
}
