package com.main;

public class Animal {
	private String foodName;
	protected Integer legCount;
	private String nest;

	public Animal() {
	}

	public Animal(String foodName, String leg) {

		this.foodName = foodName;

		this.footPrint();
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public Integer getLegCount() {
		return legCount;
	}

	public void setLegCount(Integer legCount) {
		this.legCount = legCount;
	}

	public String getNest() {
		return nest;
	}

	public void setNest(String nest) {
		this.nest = nest;
	}

	public String footPrint() {
		return "animal can walk";
	}

	public String eatingMode() {
		return "eating";
	}

}
