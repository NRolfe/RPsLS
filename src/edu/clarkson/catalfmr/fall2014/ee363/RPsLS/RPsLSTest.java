package edu.clarkson.catalfmr.fall2014.ee363.RPsLS;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class RPsLSTest {

	@Test
	public void testAllPossibilities(){
		for (int i=1; i<6; i++){
			if ( i==1 ){
				for ( int j=10; j<40; j += 10 ){
					Weapon scissors = new Scissors();
					if ( j==10 ) { 
						scissors = new Radioactive(scissors);
						assertEquals("Radioactive Scissors", scissors.getName());
					}
					else if ( j==20 ) { 
						scissors = new Poisonous(scissors);
						assertEquals("Poisonous Scissors", scissors.getName());
					}
					else if ( j==30 ) {
						scissors = new Infested(scissors);
						assertEquals("Infested Scissors", scissors.getName());
					}
					else break;
					assertNotNull("Weight should not be null", scissors.getWeight());
					assertEquals(i+j, scissors.getWeight());		
				}
			}
			if ( i==2 ){
				for ( int j=10; j<40; j += 10 ){
					Weapon paper = new Paper();
					if ( j==10 ) { 
						paper = new Radioactive(paper);
						assertEquals("Radioactive Paper", paper.getName());
					}
					else if ( j==20 ) { 
						paper = new Poisonous(paper);
						assertEquals("Poisonous Paper", paper.getName());
					}
					else if ( j==30 ) {
						paper = new Infested(paper);
						assertEquals("Infested Paper", paper.getName());
					}
					else break;
					assertNotNull("Weight should not be null", paper.getWeight());
					assertEquals(i+j, paper.getWeight());		
				}
			}
			if ( i==3 ){
				for ( int j=10; j<40; j += 10 ){
					Weapon rock = new Rock();
					if ( j==10 ) { 
						rock = new Radioactive(rock);
						assertEquals("Radioactive Rock", rock.getName());
					}
					else if ( j==20 ) { 
						rock = new Poisonous(rock);
						assertEquals("Poisonous Rock", rock.getName());
					}
					else if ( j==30 ) {
						rock = new Infested(rock);
						assertEquals("Infested Rock", rock.getName());
					}
					else break;
					assertNotNull("Weight should not be null", rock.getWeight());
					assertEquals(i+j, rock.getWeight());		
				}
			}
			if ( i==4 ){
				for ( int j=10; j<40; j += 10 ){
					Weapon lizard = new Lizard();
					if ( j==10 ) { 
						lizard = new Radioactive(lizard);
						assertEquals("Radioactive Lizard", lizard.getName());
					}
					else if ( j==20 ) { 
						lizard = new Poisonous(lizard);
						assertEquals("Poisonous Lizard", lizard.getName());
					}
					else if ( j==30 ) {
						lizard = new Infested(lizard);
						assertEquals("Infested Lizard", lizard.getName());
					}
					else break;
					assertNotNull("Weight should not be null", lizard.getWeight());
					assertEquals(i+j, lizard.getWeight());		
				}
			}
			if ( i==5 ){
				for ( int j=10; j<40; j += 10 ){
					Weapon spock = new Spock();
					if ( j==10 ) { 
						spock = new Radioactive(spock);
						assertEquals("Radioactive Spock", spock.getName());
					}
					else if ( j==20 ) { 
						spock = new Poisonous(spock);
						assertEquals("Poisonous Spock", spock.getName());
					}
					else if ( j==30 ) {
						spock = new Infested(spock);
						assertEquals("Infested Spock", spock.getName());
					}
					else break;
					assertNotNull("Weight should not be null", spock.getWeight());
					assertEquals(i+j, spock.getWeight());		
				}
			}
		}
		
	}
	
	@Test
	public void doubleTieRPsLS() {
		Weapon radioactiveRock = new Rock();
		radioactiveRock = new Radioactive(radioactiveRock);

		Weapon radioactiveRock2 = new Rock();
		radioactiveRock2 = new Radioactive(radioactiveRock2);
		Scoring scoring = new Scoring();
		ArrayList<Weapon> weaponArrayList = new ArrayList<Weapon>();
		weaponArrayList.add(radioactiveRock);
		weaponArrayList.add(radioactiveRock2);

		assertEquals("It's a tie!",
				scoring.getWinnerRPI(weaponArrayList, false));
	}

	@Test
	public void doubleTieRPI() {
		Weapon radioactiveRock = new Rock();
		radioactiveRock = new Radioactive(radioactiveRock);

		Weapon radioactiveRock2 = new Rock();
		radioactiveRock2 = new Radioactive(radioactiveRock2);
		Scoring scoring = new Scoring();
		ArrayList<Weapon> weaponArrayList = new ArrayList<Weapon>();
		weaponArrayList.add(radioactiveRock);
		weaponArrayList.add(radioactiveRock2);

		assertEquals("It's a tie!",
				scoring.getWinnerRPI(weaponArrayList, false));

	}
	 @Test
	 public void sixPlayerTests() {
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
		 
		 assertEquals("Radioactive Scissors", multipleScoring.getWinnerRPsLS(weaponList, false));
		 
		 assertEquals("Radioactive Scissors", multipleScoring.getWinnerRPI(weaponList, false));
	 } 
}