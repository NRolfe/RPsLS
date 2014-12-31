/**
 * Represents a Rock gesture.
 */
package edu.clarkson.catalfmr.fall2014.ee363.RPsLS;

/**
 * Represents a Rock gesture.
 * 
 * @author Matt
 * 
 */
public class Rock extends Weapon {

	/**
	 * Constructs a Rock with a scoring weight of 3
	 * 
	 */
	public Rock() {
		super();
		weight = 3;
		name = "Rock";
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
