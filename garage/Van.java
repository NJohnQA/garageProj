package com.qa.javatask.garage;

public class Van extends Vehicles {

	public Van(String colour) {
		this.setColour(colour);
		this.setNumDoor(2);
		this.setWheelCount(4);
		this.cost();
	}
	@Override
	public void sound() {
		System.out.println("Rumble");
	}
	@Override
	public String toString() {
		return "Van has " + getWheelCount() + " wheels"+ " with " + getNumDoor() + " doors" + " and of colour "
				+ getColour() +  " and of cost " + cost();
	}

}
