package net.silveros.quests;

import java.awt.Color;

public class Quest {
	private String title, description;
	private XPValues xp;
	private boolean isPriority;
	
	private static final Color BG_COLOR = Color.LIGHT_GRAY;
	private static final Color PRIORITY_BG_COLOR = Color.getHSBColor(-0.55f, 1.0f, 0.9f); // how minty
	
	public Quest(String quest_title, String quest_description, XPValues xp_value, boolean is_priority) {
		this.title = quest_title;
		this.description = quest_description;
		this.xp = xp_value;
		this.isPriority = is_priority;
	}
	
	public Quest(String quest_title, String quest_description, XPValues xp_value) {
		this(quest_title, quest_description, xp_value, false);
	}
	
	public boolean isQuestPriority() {
		return this.isPriority;
	}
	
	public String getExperienceStringPresentation() {
		return this.xp.getStringRepresentation();
	}
	
	public int getExperiencePoints() {
		return this.xp.getExperiencePoints();
	}
	
	public String getQuestTitle() {
		return this.title;
	}
	
	public String getQuestDescription() {
		return this.description;
	}
	
	public Color getBGColor() {
		return this.isQuestPriority() ? PRIORITY_BG_COLOR : BG_COLOR;
	}
}
