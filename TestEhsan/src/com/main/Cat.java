package com.main;

public class Cat extends Animal {
	private String bodyColor;
	private boolean isWild;
	private Integer weight;
	private Integer legCount;

	public Cat(String fName) {
		super(fName, null);
	}

	public Cat(Integer lCount) {
		this.legCount = lCount;// set lcount of own
		super.legCount = lCount;// set parent value
	}

	public Integer getLegCount() {
		return legCount;
	}

	public void setLegCount(Integer legCount) {
		this.legCount = legCount;
	}

	public String getBodyColor() {
		return bodyColor;
	}

	public void setBodyColor(String bodyColor) {
		this.bodyColor = bodyColor;
	}

	public boolean isWild() {
		return isWild;
	}

	public void setWild(boolean isWild) {
		this.isWild = isWild;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public String sound() {
		return "mioooom";
	}
}
