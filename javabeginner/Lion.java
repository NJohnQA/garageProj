package com.qa.javatask.javabeginner;

public class Lion extends Animal{
	private String color;

	public Lion(boolean veg, String food, int legs) {
		super(veg, food, legs);
		this.color="Black";
	}

	public Lion(boolean veg, String food, int legs, String color){
		super(veg, food, legs);
		this.color=color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
