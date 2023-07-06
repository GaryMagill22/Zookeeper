package com.gary.zookeeper;

public class GiantBat extends Mammal {

	
	
	
	public GiantBat() {
		super(300);
	
		
	}
	
	
	
	
	
	// Methods
	
	public void fly() {
		setEnergy(getEnergy() - 50);
		System.out.println("\nThe bat is airborne (flying). Energy levels decreased by 5\n");
	}
	
	
	
	
	public void eatHumans() {
		setEnergy(getEnergy() + 25);
		System.out.println("\nThe bat ate some human flesh, increasing their energy levels by 25.\n");
	}
	
	
	
	
	
	
	public void attackTown() {
		setEnergy(getEnergy() - 50);
		System.out.println("\nThe bat has decided to attack the nearest town, going after little children. \n Bats energy levels have decreased by 100.\n");
	}
	
	
	public void displayEnergy() {
		super.displayEnergy();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
