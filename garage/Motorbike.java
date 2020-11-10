package com.qa.javatask.garage;

public class Motorbike extends Vehicles {

	public Motorbike(String colour) {
		this.setWheelCount(2);
		this.setNumDoor(0);
		this.setColour(colour);
		this.cost();
	}
	@Override
	public void sound() {
		System.out.println("Wooosh");
	}
	@Override
	public String toString() {
		return "Motorbike has " + getWheelCount() + " wheels" + " with " + getNumDoor() + " doors" + " and of colour "
				+ getColour() + " and of cost " + cost();

}
}
