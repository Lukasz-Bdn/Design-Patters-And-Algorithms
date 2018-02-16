package dp.factory.pizza;

import dp.factory.PizzaAdditionsFactory;

public class SeaPizza extends Pizza {
	PizzaAdditionsFactory additionsFactory;

	public SeaPizza(PizzaAdditionsFactory additionsFactory) {
		this.additionsFactory = additionsFactory;
		prepare();
	}

	@Override
	protected void prepare() {
		this.sauce = additionsFactory.getSauce();
		this.cheese = additionsFactory.getCheese();
	}
}
