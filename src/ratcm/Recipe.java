package ratcm;

public class Recipe {
	private String name = "";
	private int price = 0;
	private int amtCoffee = 0;
	private int amtMilk = 0;
	private int amtSugar = 0;
	private int amtChocolate = 0;

	/**
	 * @return Returns the amtChocolate.
	 */
	public int getAmtChocolate() {
		return amtChocolate;
	}

	/**
	 * @param chocolate The amount of chocolate to set.
	 */
	public void setAmtChocolate(int chocolate) {
		amtChocolate = chocolate;
	}

	/**
	 * @return Returns the amtCoffee.
	 */
	public int getAmtCoffee() {
		return amtCoffee;
	}

	/**
	 * @param coffee The amount of coffee to set.
	 */
	public void setAmtCoffee(int coffee) {
		amtCoffee = coffee;
	}

	/**
	 * @return Returns the amtMilk.
	 */
	public int getAmtMilk() {
		return amtMilk;
	}

	/**
	 * @param milk The amount of milk to set.
	 */
	public void setAmtMilk(int milk) {
		amtMilk = milk;
	}

	/**
	 * @return Returns the amtSugar.
	 */
	public int getAmtSugar() {
		return amtSugar;
	}

	/**
	 * @param sugar The amount of sugar to set.
	 */
	public void setAmtSugar(int sugar) {
		amtSugar = sugar;
	}

	/**
	 * @return Returns the name.
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name The name to set.
	 */
	public void setName(String name) {
		if (name != null) {
			this.name = name;
		}
	}

	/**
	 * @return Returns the price.
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @param price The price to set.
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * Returns the name of the recipe.
	 * 
	 * @return String
	 */
	public String toString() {
		return name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final Recipe other = (Recipe) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
