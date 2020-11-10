package com.qa.javatask.garage;

public class Vehicles {
	private int wheelCount;
	private int numDoor;
	private String colour;
	private int cost;
	

	public void sound() {
		System.out.println("Generic Sound");
	}
	public int cost() {
		cost = 700 * numDoor + 200 * wheelCount;
		return cost;
	}
	
	public void crash() {
		System.out.println("Scrap");
	}
	
	@Override
	public String toString() {
		return "Vehicle has " + wheelCount + " wheels"+ " with " + numDoor + "doors" + "and the colour is " + colour + "";
	}
	public int getNumDoor() {
		return numDoor;
	}

	public void setNumDoor(int doorCount) {
		this.numDoor = doorCount;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public void vehiclesMain(){
		System.out.println("This is a vehicle");
		System.out.println("The vehicle has " + wheelCount + " Wheels.");
	}

	public int getWheelCount() {
		return wheelCount;
	}

	public void setWheelCount(int wheelCount) {
		this.wheelCount = wheelCount;
	}
	
}
