package main.java;

import main.java.classes.Duck;
import main.java.classes.Mallard;
import main.java.classes.WoodDuck;

public class main {
	
	public static void main(String [] args)
	{
		Mallard malDuck = new Mallard();
		malDuck.quack();
		System.out.println("it was the: " + malDuck.getType());
		
		WoodDuck woodDuck = new WoodDuck();
		woodDuck.quack();
		System.out.println("it was the: " + woodDuck.getType());

	}
}
