/**
 * Represents a Paper gesture
 */
package edu.clarkson.catalfmr.fall2014.ee363.RPsLS;

/**
 * Represents a Paper gesture
 * 
 * @author Matt
 *
 */
public class Paper extends Weapon {

	/**
	 * Constructs a Paper object with a scoring weight of 2
	 */
	public Paper() {
		super();
		weight = 2;
		name = "Paper";
	}

	/**
	 * Returns the scoring weight.
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
