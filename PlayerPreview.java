package com.github.poisonoustater.hud.mod.impl;

import java.awt.Color;

import com.github.poisonoustater.hud.mod.HudMod;

import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.client.renderer.GlStateManager;

public class PlayerPreview extends HudMod{

	public PlayerPreview() {
		super("PlayerPreview", 5, 5);
	}
	
	@Override
	public void draw() {
		fr.drawStringWithShadow(mc.thePlayer.getName(), getX()+fr.getStringWidth(mc.thePlayer.getName())+3, getY()-20, -1);
		//x,y,width,height
		//Gui.drawRect(100,200, 200, 100, new Color(0,0,0,170).getRGB());
		
		fr.drawStringWithShadow(Float.toString(mc.thePlayer.getHealth())+" \u2764", getX()+fr.getStringWidth(mc.thePlayer.getName())+fr.getStringWidth(mc.thePlayer.getName())-9,  getY()-20+13, -1);
		
		GuiInventory.drawEntityOnScreen(getX()+fr.getStringWidth(mc.thePlayer.getName())+30, getY()+30, 20, 50, 0, mc.thePlayer);
		super.draw();
	}
	@Override
	public void renderDummy(int mouseX, int mouseY) {
		fr.drawStringWithShadow(mc.thePlayer.getName(), getX()+fr.getStringWidth(mc.thePlayer.getName())+3, getY()-20, -1);
		//Gui.drawRect(100,200, 200, 100, new Color(0,0,0,170).getRGB());
		
		fr.drawStringWithShadow(Float.toString(mc.thePlayer.getHealth())+" \u2764", getX()+fr.getStringWidth(mc.thePlayer.getName())+fr.getStringWidth(mc.thePlayer.getName())-9,  getY()-20+13, -1);
		
		GuiInventory.drawEntityOnScreen(getX()+fr.getStringWidth(mc.thePlayer.getName())+30, getY()+30, 20, 50, 0, mc.thePlayer);
		super.renderDummy(mouseX, mouseY);
		
	}
	
	@Override
	public int getWidth() {
		return 100;
		
	}	
	@Override
	public int getHeight() {
		return fr.FONT_HEIGHT*2+4;
	}
}
