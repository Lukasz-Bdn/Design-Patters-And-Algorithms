package dp.factory.pizza;

import dp.factory.PizzaAdditionsFactory;

public class CheesePizza extends Pizza {
	PizzaAdditionsFactory additionsFactory;
	
	public CheesePizza(PizzaAdditionsFactory additionsFactory) {
		this.additionsFactory = additionsFactory;
		prepare();
	}

	@Override
	protected void prepare() {
		this.sauce = additionsFactory.getSauce();
		this.cheese = additionsFactory.getCheese();
	}

}