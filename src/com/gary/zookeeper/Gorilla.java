package com.gary.zookeeper;

public class Gorilla extends Mammal {
	
	public Gorilla() {
		
	}
	



// Methods

public void throwSomething() {
	setEnergy(getEnergy()- 5 );
	System.out.println("\n Gorilla just threw something,\n Energy decreased by 5!");
	
}



public void eatBananas() {
	setEnergy(getEnergy() + 10 );
	System.out.println("Your Gorilla ate bananas and your energy went up by 10.");
}



public void climb() {
	setEnergy(getEnergy() - 10 );
	System.out.println("Your Gorilla has climbed up a tree and has decreased your energy by 10.");
}









}