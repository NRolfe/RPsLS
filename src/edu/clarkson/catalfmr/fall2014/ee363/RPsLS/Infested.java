/**
 * Using the decorator pattern a Weapon can be decorated with type Infested.
 */
package edu.clarkson.catalfmr.fall2014.ee363.RPsLS;

/**
 * Creates a WeaponDecorator of type Infested
 * 
 * @author Matt
 *
 */
public class Infested extends WeaponDecorator {

	/**
	 * Constructs an Infested decorator with a scoring weight of 30
	 * 
	 */
	public Infested(Weapon weapon) {
		super(weapon);
		weight = 30;
		name = "Infested" + " " + tempWeapon.getName();
	}

	/**
	 * Returns the scoring weight.
	 * 
	 * @return weight
	 */
	public int getWeight() {
		return this.getWeapon().getWeight() + weight;
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
