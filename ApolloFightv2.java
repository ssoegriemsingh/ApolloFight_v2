import classes.Debug;

import classes.Character;
import classes.Archer;
import classes.Druid;
import classes.Knight;
import classes.Mage;
import classes.Paladin;
import classes.Ranger;

import interfaces.isMagic;
import interfaces.isMelee;
import interfaces.isRanged;

import java.util.Arrays;
import java.util.ArrayList;

public class ApolloFightv2 {

	public static void main(String[] args) {
			ApolloFightv2 apolloFight = new ApolloFightv2();
	}

	private ApolloFightv2() {
		ArrayList<Character> characterList = new ArrayList<>();

		Archer a = new Archer();
		Druid d = new Druid();
		Knight k = new Knight();
		Mage m = new Mage();
		Paladin p = new Paladin();
		Ranger r = new Ranger();
		// Rogue

		characterList.addAll(Arrays.asList(a, d, k, m, p, r));

		// for(Character character : characterList) {
		// 	if (character instanceof isMagic) {
		// 		isMagic magicChar = (isMagic)character;
		// 		System.out.println("\n" + magicChar.getName());
		// 		System.out.println("ATK: " + magicChar.magicAttack());
		// 		System.out.println("DEF: " + magicChar.magicDefense());
		// 	} else if (character instanceof isRanged) {
		// 		isRanged rangedChar = (isRanged)character;
		// 		System.out.println("\n" + rangedChar.getName());
		// 		System.out.println("ATK: " + rangedChar.rangedAttack());
		// 		System.out.println("DEF: " + rangedChar.rangedDefense());
		// 	} else if (character instanceof isMelee) {
		// 		isMelee meleeChar = (isMelee)character;
		// 		System.out.println("\n" + meleeChar.getName());
		// 		System.out.println("ATK: " + meleeChar.meleeAttack());
		// 		System.out.println("DEF: " + meleeChar.meleeDefense());
		// 	} else {
		// 		System.out.println("\n" + character.getName());
		// 		System.out.println("ATK: " + character.attack());
		// 		System.out.println("DEF: " + character.defense());
		// 	}

		for (Character character : characterList) {
				System.out.println("\n" + character.getName());

				int numberOfTypes = getNumberOfTypes(character);

				for (int i = 1; i <= numberOfTypes; i++) {
					String characterType = getType(character, i);
					Debug.log("Character type: " + characterType);

					switch(characterType) {
							case "isRanged":
									isRanged rangedChar = (isRanged)character;
									System.out.println("ATK: " + rangedChar.rangedAttack());
									break;
					}

				}

				//characterType.addAll(Arrays.asList(character.getClass().getInterfaces()));

				//Debug.log(character.getClass().getInterfaces().getType());

				// Debug.log(character.getClass().getInterfaces().length);
				// Debug.log(Arrays.asList(character.getClass().getInterfaces()).get(0).getSimpleName());
		}
	}

	private int getNumberOfTypes(Character c) {
			int numberOfTypes = c.getClass().getInterfaces().length;

			return numberOfTypes;
	}

	private String getType(Character c, int i) {

			String type = Arrays.asList(c.getClass().getInterfaces()).get(i-1).getSimpleName();

			return type;

	}
}
