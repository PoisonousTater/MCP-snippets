package com.github.poisonoustater.ui.clickgui.comp;

import java.awt.Color;

import com.github.poisonoustater.hud.mod.HudMod;
import com.github.poisonoustater.mod.Mod;
import com.github.poisonoustater.mod.ModManager;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ResourceLocation;

public class ModButton2  {
	public Minecraft mc = Minecraft.getMinecraft();
	public int x,y,w,h;
	
	public Mod m;
	
	
	public ModButton2(int x,int y,int w,int h,Mod m){
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		this.m = m;
	  
		
	}
	
	public void draw() {
		//Gui.drawRect(x, y, x+w, y+h,new Color(0,0,0,170).getRGB());
		Gui.drawRect(x, y, x+w, y+h, new Color(255,255,255,170).getRGB());
		Minecraft.getMinecraft().fontRendererObj.drawString(m.getName(), x + 2, y + 2, getColor());
	}
	
	private int getColor() {
		if(m.enabled ) {
			return new Color(0,255,0,255).getRGB();
		}else {
			return new Color(255,0,0,255).getRGB();
		}

	}
	public void onClick(int mouseX,int mouseY , int button) {
		if(mouseX >= x && mouseX<=x + w && mouseY >=y && mouseY <=y+h) {
			m.toggled();
			}
			
			
		}

	}

	
