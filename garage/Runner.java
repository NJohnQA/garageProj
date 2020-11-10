package com.qa.javatask.garage;
import java.util.Scanner;
public class Runner {
	public static void main(String[] args) {

		Vehicles car1 = new Car("Blue");
		Vehicles bike1 = new Motorbike("Silver");
		Vehicles truck1 = new Van("yellow");

		Garage gar = new Garage();

		gar.addVehicle(car1);
		gar.addVehicle(bike1);
		gar.addVehicle(truck1);

		for (Vehicles veh : gar.getVehicles()) {
			System.out.println(veh);

		}
//		while (true) {
//
//			System.out.println("Would you like to perform another operation?");
//			Scanner scProceed = new Scanner(System.in);
//			String proceed = scProceed.nextLine();
//			if (proceed.equals("yes")) {
//
//				System.out.println("restarting");
//			} else {
//				System.out.println("Shutting Down");
//				break;
//			}
//		}
		System.out.println("\n");
		System.out.println("What would you like to do?");
		System.out.println("Type 'add' to add a vehicle.");
		System.out.println("Type 'remove' to remove a vehicle.");
		System.out.println("Type 'clear' to clear vehicles.");
		Scanner sc = new Scanner(System.in);
		String userOperation = sc.nextLine();
		switch (userOperation) {
		case "add":
			System.out.println("Which type of vehicle would you like to add?");
			System.out.println("Type 'motorbike', 'car' or 'van.'");
			String userAVehicle = sc.nextLine();
			switch (userAVehicle) {
			case "motorbike":
				System.out.println("Enter the colour of the motorbike.");
				String newM = sc.nextLine();

				Vehicles bike = new Motorbike(newM);
				gar.addVehicle(bike);
				break;
			case "car":
				System.out.println("Enter the colour of the car.");
				String newC = sc.nextLine();

				Vehicles car = new Car(newC);
				gar.addVehicle(car);
				break;
			case "Van":
				System.out.println("Enter the colour of the van.");
				String newT = sc.nextLine();

				Vehicles van = new Van(newT);
				gar.addVehicle(van);
				break;
			}
			break;

		case "remove":
			System.out.println("enter an id, you hoser");
			int id = Integer.parseInt(sc.nextLine());
			gar.delVehicle(id);
			break;
		case "Clear":
			gar.clearVehicles();
			break;
		default:
			System.out.println("Invalid input.");
		}
		sc.close();
		int count = 0;
		for (Vehicles v : gar.getVehicles()) {
			System.out.println("Garage slot " + count + " Contains.");
			System.out.println(v);
			count++;

		}
	}

}
