package ratcm;

public class Inventory {


	private final static int maxDose = 15;
	private int coffee = maxDose;
	private int milk = maxDose;
	private int sugar = maxDose;
	private int chocolate = maxDose;

	/**
	 * Add the number of chocolate units in the inventory
	 * to the current amount of chocolate units.
	 * @param chocolate
	 * @return true if the amount is changed; false otherwise
	 */
	public boolean addChocolate(int amtChocolate) {
		if (amtChocolate >= 0 && chocolate+amtChocolate <= maxDose) {
			chocolate += amtChocolate;
			return true;
		} else
			return false;
	}

	/**
	 * Add the number of coffee units in the inventory
	 * to the current amount of coffee units.
	 * @param coffee
	 * @return true if the amount is changed; false otherwise
	 */
	public boolean addCoffee(int amtCoffee) {
		if (amtCoffee >= 0 && coffee+amtCoffee <= maxDose) {
			coffee += amtCoffee;
			return true;
		} else
			return false;
	}

	/**
	 * Add the number of milk units in the inventory
	 * to the current amount of milk units.
	 * @param milk
	 * @return true if the amount is changed; false otherwise
	 */
	public boolean addMilk(int amtMilk) {
		if (amtMilk >= 0 && milk+amtMilk <= maxDose) {
			milk += amtMilk;
			return true;
		} else
			return false;
	}

	/**
	 * Add the number of sugar units in the inventory
	 * to the current amount of sugar units.
	 * @param sugar
	 * @return true if the amount is changed; false otherwise
	 */
	public boolean addSugar(int amtSugar) {
		if (amtSugar >= 0 && sugar+amtSugar <= maxDose) {
			sugar += amtSugar;
			return true;
		} else
			return false;
	}

	/**
	 * Returns true if there are enough ingredients to make
	 * the beverage.
	 * @param r
	 * @return boolean
	 */
	public boolean enoughIngredients(Recipe r) {
		boolean isEnough = true;
		if(this.coffee < r.getAmtCoffee()) {
			isEnough = false;
		}
		if(this.milk < r.getAmtMilk()) {
			isEnough = false;
		}
		if(this.sugar < r.getAmtSugar()) {
			isEnough = false;
		}
		if(this.chocolate < r.getAmtChocolate()) {
			isEnough = false;
		}
		return isEnough;
	}

	/**
	 * Removes the ingredients used to make the specified
	 * recipe.  Assumes that the user has checked that there
	 * are enough ingredients to make
	 * @param r
	 */
	public boolean useIngredients(Recipe r) {
		if (enoughIngredients(r)) {
			this.coffee -= r.getAmtCoffee();
			this.milk -= r.getAmtMilk();
			this.sugar -= r.getAmtSugar();
			this.chocolate -= r.getAmtChocolate();
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Returns a string describing the current contents
	 * of the inventory.
	 * @return String
	 */
	public String toString() {
		StringBuilder string = new StringBuilder();
		string.append("Coffee: ");
		string.append(coffee);
		string.append("\n");
		string.append("Milk: ");
		string.append(milk);
		string.append("\n");
		string.append("Sugar: ");
		string.append(sugar);
		string.append("\n");
		string.append("Chocolate: ");
		string.append(chocolate);
		string.append("\n");
		return string.toString();
	}
}
