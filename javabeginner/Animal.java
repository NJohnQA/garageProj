package com.qa.javatask.javabeginner;

public class Animal {
	protected boolean vegy;
	protected String eats;
	protected int numLegs;
	protected Animal() {}


	public Animal(boolean veg, String food, int legs){
		this.vegy = veg;
		this.eats = food;
		this.numLegs = legs;
		
	}
	
	public boolean isVegetarian() {
		return vegy;
	}

	public boolean isVegy() {
		return vegy;
	}

	public void setVegy(boolean vegy) {
		this.vegy = vegy;
	}

	public String getEats() {
		return eats;
	}

	public void setEats(String eats) {
		this.eats = eats;
	}

	public int getNumLegs() {
		return numLegs;
	}

	public void setNumLegs(int numLegs) {
		this.numLegs = numLegs;
	}

	
}
