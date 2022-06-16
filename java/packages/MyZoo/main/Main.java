package main;

import animals.Zoo;

public class Main{

	public static void main(String[] args){
		Zoo zoo = new Zoo();
		
		System.out.println("Let's go to the zoo!");
		zoo.visit();
		System.out.println("That was a fun day at the zoo.");
	}
}