package dp.template;

public class Coffee extends Drink {

	@Override
	public void makeDrink() {
		System.out.println("2. Brew coffee");
	}
	
	@Override
	public void addAdditions() {
		System.out.println("4. Adding milk");
	}

}
