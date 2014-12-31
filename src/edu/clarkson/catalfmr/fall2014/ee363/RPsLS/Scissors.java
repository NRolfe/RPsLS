/**
 * Represents a Scissor gesture
 */
package edu.clarkson.catalfmr.fall2014.ee363.RPsLS;

/**
 * Represents a Scissor gesture
 * 
 * @author Matt
 *
 */
public class Scissors extends Weapon {

	/**
	 * Constructs a Scissors object with a scoring weight of 1
	 * 
	 */
	public Scissors() {
		super();
		weight = 1;
		name = "Scissors";
	}

	/**
	 * Returns the scoring weight
	 * 
	 * @return weight
	 */
	public int getWeight() {
		return weight;
	}

	/**
	 * Returns the object name
	 * 
	 * @return name
	 */
	@Override
	public String getName() {
		return name;
	}

}
