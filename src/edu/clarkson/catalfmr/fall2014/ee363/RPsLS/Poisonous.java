/**
 * Using the decorator pattern a Weapon can be decorated with type Poisonous.
 */
package edu.clarkson.catalfmr.fall2014.ee363.RPsLS;

/**
 * Creates a WeaponDecorator of type Poisonous
 * 
 * @author Matt
 *
 */
public class Poisonous extends WeaponDecorator {

	/**
	 * Constructs a Poisonous decorator with a scoring weight of 20
	 * 
	 */
	public Poisonous(Weapon weapon) {
		super(weapon);
		weight = 20;
		name = "Poisonous" + " " + tempWeapon.getName();
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
