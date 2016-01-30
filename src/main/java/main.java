package main.java;

import main.java.classes.Duck;

public class main {
	
	public static void main(String [] args)
	{
		Duck duck = new Duck();
		duck.quack();
		System.out.println("Am I a duck? " + duck.areADuck);
	}
}
