package com.qa.javatask.garage;

public class Car  extends Vehicles {
	
	@Override
	public void sound() {
		System.out.println("Vrum Vrum");
	}
	
	public Car(String colour) {
		super();
		this.setWheelCount(4);
		this.setNumDoor(5);
		this.setColour(colour);
		this.cost();

	}
	

	@Override
	public String toString() {
		return "Car has " + getWheelCount() + " wheels" + " with " + getNumDoor() + " doors " + " and of colour "
				+ getColour() + " and of cost " + cost() +  "]" ;
	}
}
