/**
 * 
 */
package edu.clarkson.catalfmr.fall2014.ee363.RPsLS;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

/**
 * @author Matt
 *
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Weapon radioactiveRock = new Rock();
		 radioactiveRock = new Radioactive(radioactiveRock);
		 Weapon infestedPaper = new Paper();
		 infestedPaper = new Infested(infestedPaper);		 
		 Weapon poisonousLizard = new Lizard();
		 poisonousLizard = new Poisonous(poisonousLizard);		 
		 Weapon poisonousSpock = new Spock();
		 poisonousSpock = new Poisonous(poisonousSpock);		 
		 Weapon infestedSpock = new Spock();
		 infestedSpock = new Infested(infestedSpock);		 
		 Weapon radioactiveScissors = new Scissors();
		 radioactiveScissors = new Radioactive(radioactiveScissors);
		 
		 Scoring multipleScoring = new Scoring();
		 
		 ArrayList<Weapon> weaponList = new ArrayList<Weapon>();
		 weaponList.add(radioactiveRock);
		 weaponList.add(infestedPaper);
		 weaponList.add(poisonousLizard);
		 weaponList.add(poisonousSpock);
		 weaponList.add(infestedSpock);
		 weaponList.add(radioactiveScissors);
		 
		System.out.println(multipleScoring.getWinnerRPsLS(weaponList, false));
		 
		 System.out.println(multipleScoring.getWinnerRPI(weaponList, false));
		
	}

}
