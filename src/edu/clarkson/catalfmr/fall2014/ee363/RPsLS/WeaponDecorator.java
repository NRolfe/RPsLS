/**
 * 
 */
package edu.clarkson.catalfmr.fall2014.ee363.RPsLS;

/**
 * @author Matt
 *
 */
public abstract class WeaponDecorator extends Weapon {
	protected Weapon tempWeapon;

	public WeaponDecorator(Weapon weapon) {
		this.tempWeapon = weapon;
	}

	public Weapon getWeapon() {
		return tempWeapon;
	}

	@Override
	public int getWeight() {
		return 0;
	}

}
