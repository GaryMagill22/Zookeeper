package com.gary.zookeeper;

public class Mammal {
	// 1. add zero-argument constructor
	// 2. add overloaded constructor that takes the type
	// 3. add all getters/setters
	
	
	// member variables
	private int energy;
	
	
	// constructor
	public Mammal() {
		this.energy = 100;
	}
	
	// Constructor Overload
	
	public Mammal(int energy) {
		this.energy = energy;
	}


	// Getter
	public int getEnergy() {
		return energy;
	}


	// Setter
	public void setEnergy(int energy) {
		this.energy = energy;
	}
	
	
	
	
	//Methods
	
	public void displayEnergy() {
		System.out.println("============DISPLAY==============");
		System.out.printf("\n Your energy is at " + this.energy );
	}
	
	
	
	
	
}

