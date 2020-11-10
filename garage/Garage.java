package com.qa.javatask.garage;
import java.util.ArrayList;
import java.util.List;

public class Garage {
	private List<Vehicles> vehicles = new ArrayList<>();

	public void addVehicle(Vehicles vehicle) {
		this.vehicles.add(vehicle);
	}

	public List<Vehicles> getVehicles() {
		return this.vehicles;
	}

	public void delVehicle(int id) {
		this.vehicles.remove(id);
	}

	public void delVehicle(Vehicles vehicle) {
		this.vehicles.remove(vehicle);
	}

	public void clearVehicles() {
		this.vehicles.removeAll(vehicles);
	}
}
