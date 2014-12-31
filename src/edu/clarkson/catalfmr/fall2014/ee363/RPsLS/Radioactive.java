/**
 * Using the decorator pattern a Weapon can be decorated with type Radioactive.
 */
package edu.clarkson.catalfmr.fall2014.ee363.RPsLS;

/**
 * Creates a WeaponDecorator of type Radioactive
 * 
 * @author Matt
 *
 */
public class Radioactive extends WeaponDecorator {
	
	/**
	 * Constructs a Radioactive decorator with a scoring weight of 10
	 * 
	 */
	public Radioactive(Weapon weapon) {
		super(weapon);
		weight = 10;
		name = "Radioactive" + " " + tempWeapon.getName();
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
