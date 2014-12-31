/**
 * Scoring object to determine winner of the game
 */
package edu.clarkson.catalfmr.fall2014.ee363.RPsLS;

import java.util.ArrayList;

public class Scoring {

	/**
	 * Creates Scoring object to determine a winner of the game
	 * 
	 * @author Nick Rolfe
	 * @param weapons This is an ArrayList of weapons
	 * @param calledForTie This determines if a tie was called or not
	 * @return weapons.get(0).getName()
	 */
	public String getWinnerRPsLS(ArrayList<Weapon> weapons, boolean calledForTie) {
		while (weapons.size() > 1) {
			if (weapons.get(0).getWeight() % 10 == 1) {

				// winning scenarios
				if (weapons.get(1).getWeight() % 10 == 2
						|| weapons.get(1).getWeight() % 10 == 4)
					weapons.remove(1);

				// losing scenarios
				else if (weapons.get(1).getWeight() % 10 == 3
						|| weapons.get(1).getWeight() % 10 == 5)
					weapons.remove(0);

				// tie breaker
				else {
					if (calledForTie) {
						weapons.remove(1);
						return "It's a tie!";
					} else
						getWinnerRPI(weapons, true);
				}
			}

			if (weapons.get(0).getWeight() % 10 == 2) {

				// winning scenarios
				if (weapons.get(1).getWeight() % 10 == 3
						|| weapons.get(1).getWeight() % 10 == 5)
					weapons.remove(1);

				// losing scenarios
				else if (weapons.get(1).getWeight() % 10 == 1
						|| weapons.get(1).getWeight() % 10 == 4)
					weapons.remove(0);

				// tie breaker
				else {
					if (calledForTie) {
						weapons.remove(1);
						return "It's a tie!";
					} else
						getWinnerRPI(weapons, true);
				}
			}

			if (weapons.get(0).getWeight() % 10 == 3) {

				// winning scenarios
				if (weapons.get(1).getWeight() % 10 == 4
						|| weapons.get(1).getWeight() % 10 == 1)
					weapons.remove(1);

				// losing scenarios
				else if (weapons.get(1).getWeight() % 10 == 2
						|| weapons.get(1).getWeight() % 10 == 5)
					weapons.remove(0);

				// tie breaker
				else {
					if (calledForTie) {
						weapons.remove(1);
						return "It's a tie!";
					} else
						getWinnerRPI(weapons, true);
				}

			}

			if (weapons.get(0).getWeight() % 10 == 4) {

				// winning scenarios
				if (weapons.get(1).getWeight() % 10 == 5
						|| weapons.get(1).getWeight() % 10 == 2)
					weapons.remove(1);

				// losing scenarios
				else if (weapons.get(1).getWeight() % 10 == 3
						|| weapons.get(1).getWeight() % 10 == 1)
					weapons.remove(0);

				// tie breaker
				else {
					if (calledForTie) {
						weapons.remove(1);
						return "It's a tie!";
					} else
						getWinnerRPI(weapons, true);
				}
			}

		}

		if (weapons.get(0).getWeight() % 10 == 5) {

			// winning scenarios
			if (weapons.get(1).getWeight() % 10 == 1
					|| weapons.get(1).getWeight() % 10 == 3)
				weapons.remove(1);

			// losing scenarios
			else if (weapons.get(1).getWeight() % 10 == 2
					|| weapons.get(1).getWeight() % 10 == 4)
				weapons.remove(0);

			// tie breaker
			else {
				if (calledForTie) {
					weapons.remove(1);
					return "It's a tie!";
				} else
					getWinnerRPI(weapons, true);
			}

		}
		return weapons.get(0).getName();
	}

	/**
	 * @author Nick Rolfe
	 * @param weapons This is an ArrayList of weapons
	 * @param calledForTie This determines if a tie was called or not
	 * @return weapons.get(0).getName()
	 */
	public String getWinnerRPI(ArrayList<Weapon> weapons, boolean calledForTie) {

		while (weapons.size() > 1) {
			if (weapons.get(0).getWeight() > 10
					&& weapons.get(0).getWeight() < 20) {
				// Poisoned
				if (weapons.get(1).getWeight() > 20
						&& weapons.get(1).getWeight() < 30)
					weapons.remove(1);
				// Infested
				else if (weapons.get(0).getWeight() > 30
						&& weapons.get(0).getWeight() < 40) // Infested
					weapons.remove(0);
				else {
					if (calledForTie) {
						weapons.remove(1);
						return "It's a tie!";
					} else {
						getWinnerRPsLS(weapons, true);
						return "It's a tie!";
					}
				}
			}
			if (weapons.get(0).getWeight() > 20
					&& weapons.get(0).getWeight() < 30) {
				// Poisoned
				if (weapons.get(1).getWeight() > 30
						&& weapons.get(1).getWeight() < 40)
					weapons.remove(1);
				// Infested
				else if (weapons.get(0).getWeight() > 10
						&& weapons.get(0).getWeight() < 20) // Infested
					weapons.remove(0);
				else {
					if (calledForTie) {
						weapons.remove(1);
						return "It's a tie!";
					} else
						getWinnerRPsLS(weapons, true);
				}
			}
			if (weapons.get(0).getWeight() > 30
					&& weapons.get(0).getWeight() < 40) {
				// Poisoned
				if (weapons.get(1).getWeight() > 10
						&& weapons.get(1).getWeight() < 20)
					weapons.remove(1);
				// Infested
				else if (weapons.get(0).getWeight() > 20
						&& weapons.get(0).getWeight() < 30) // Infested
					weapons.remove(0);
				else {
					if (calledForTie) {
						weapons.remove(1);
						return "It's a tie!";
					} else
						getWinnerRPsLS(weapons, true);
				}
			}
		}
		return weapons.get(0).getName();
	}
}
