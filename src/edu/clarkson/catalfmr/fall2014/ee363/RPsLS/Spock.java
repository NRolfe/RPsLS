/**
 * Represents a Spock gesture
 */
package edu.clarkson.catalfmr.fall2014.ee363.RPsLS;

/**
 * Represents a Spock gesture
 * 
 * @author Matt
 *
 */
public class Spock extends Weapon {

	/**
	 * Constructs a Spock object with a scoring weight of 5
	 * 
	 */
	public Spock() {
		super();
		weight = 5;
		name = "Spock";
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
