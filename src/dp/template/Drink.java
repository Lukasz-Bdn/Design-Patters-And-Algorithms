package dp.template;

public abstract class Drink {

	final public void prepareDrink() {
		boilWater();
		makeDrink();
		pourDrinkToCup();
		addAdditions();
	}

	private void boilWater() {
		System.out.println("1. Boiling water");
	}

	public abstract void makeDrink();

	private void pourDrinkToCup() {
		System.out.println("3. Pouring to cup");
	}

	public void addAdditions() {
		
	};

}