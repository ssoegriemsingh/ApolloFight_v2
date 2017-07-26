package classes;

import classes.Debug;

public abstract class Character {
	
	public Character() {
		
	}
	
	public void print( String s ) {
		System.out.println(s);
	}
	
	public void Greeting() {
		print("Greeting");
	}
}