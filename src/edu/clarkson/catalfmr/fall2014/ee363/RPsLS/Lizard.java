/**
 * Represents a Lizard gesture
 */
package edu.clarkson.catalfmr.fall2014.ee363.RPsLS;

/**
 * Represents a Lizard gesture
 * 
 * @author Matt
 *
 */
public class Lizard extends Weapon {

	/**
	 * Constructs a Lizard object with a scoring weight of 4
	 * 
	 */
	public Lizard() {
		super();
		weight = 4;
		name = "Lizard";
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
