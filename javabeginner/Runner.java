package com.qa.javatask.javabeginner;

public class Runner {
	public static void main(String[] args) {
		Cat cat = new Cat(false, "milk", 4, "black");
		dogs dog = new dogs(false, "Smruthi", 4, "White");
		Lion lion = new Lion(false, "Cow", 4, "Red");
		

		System.out.println("Di#og is Vegetarian? " + dog.isVegetarian());
		System.out.println("Dog eats " + dog.getEats());
		System.out.println("Dog has " + dog.getNumLegs() + " legs.");
		System.out.println("Dog color is " + dog.getColor());
		
		System.out.println("Cat is Vegetarian?" + cat.isVegetarian());
		System.out.println("Cat eats " + cat.getEats());
		System.out.println("Cat has " + cat.getNumLegs() + " legs.");
		System.out.println("Cat color is " + cat.getColor());
		
		System.out.println("Lion is Vegetarian?" + lion.isVegetarian());
		System.out.println("Lion eats " + lion.getEats());
		System.out.println("Lion has " + lion.getNumLegs() + " legs.");
		System.out.println("Lion color is " + lion.getColor());
	}
}
