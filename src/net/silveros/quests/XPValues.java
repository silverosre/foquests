package net.silveros.quests;

public enum XPValues {
	_10K("10k EXP", 10000),
	_15K("15k EXP", 15000),
	_20K("20k EXP", 20000),
	_25K("25k EXP", 25000),
	_30K("30k EXP", 30000),;
	
	private String stringValue;
	private int experiencePoints;
	
	XPValues(String string_representation, int experience_points) {
		this.stringValue = string_representation;
		this.experiencePoints = experience_points;
	}
	
	public String getStringRepresentation() {
		return stringValue;
	}
	
	public int getExperiencePoints() {
		return this.experiencePoints;
	}
}
