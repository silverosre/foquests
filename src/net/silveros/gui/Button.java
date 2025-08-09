package net.silveros.gui;

import java.awt.Color;
import java.awt.Graphics2D;

import net.silveros.quests.Quest;

public class Button {
	private int x, y;
	private int width, height;
	
	private Quest quest;
	
	private boolean locked = false;
	
	public Button(int position_x, int position_y, int w, int h, Quest new_quest) {
		this.x = position_x;
		this.y = position_y;
		this.width = w;
		this.height = h;
		this.quest = new_quest;
	}
	
	//default buttons
	public Button(int position_y, Quest new_quest) {
		this(10, 10 + position_y, 320, 30, new_quest);
	}
	
	public void render(Graphics2D g2d) {
		if (!this.locked) {
			g2d.setColor(Color.WHITE);
			g2d.fillRect(this.x, this.y, this.width, this.height);
			g2d.setColor(this.quest.getBGColor());
			g2d.fillRect(this.x+2, this.y+2, this.width-4, this.height-4);
			
			
			g2d.translate(this.x+3, this.y+3);
			g2d.scale(0.2, 0.2);
			//g2d.drawImage(Sprites.getImage(this.sprite), 0, 0, null);
			
			g2d.translate(-10, -10);
			g2d.scale(4, 4);
			g2d.setColor(Color.BLACK);
			g2d.drawString(this.quest.getQuestTitle(), 36, 12);
			g2d.setColor(Color.GRAY);
			g2d.drawString(this.quest.getQuestDescription(), 36, 22);
			g2d.setColor(Color.GRAY);
			g2d.drawString(this.quest.getExperienceStringPresentation(), this.width, 32);
		} else {
			//this.renderLockedMode(g2d);
		}
	}
}
