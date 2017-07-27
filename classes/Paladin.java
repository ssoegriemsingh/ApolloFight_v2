package classes;

import interfaces.isMagic;

public class Paladin extends Knight implements isMagic {
	
	private final String name = "Paladin";
	
	public String getName() {
		return name;
	}
	
	public String magicAttack() {
		String attack = "Consecrate";
		return attack;
	}
	
	public String magicDefense() {
		String defense = "Holy shield";
		return defense;
	}
	
	public String meleeAttack() {
		String attack = "Sword strike";
		return attack;
	}
	
	public String meleeDefense() {
		String defense = "Shield block";
		return defense;
	}
}
