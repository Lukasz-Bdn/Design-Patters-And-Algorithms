package dp.factory.additions;

import dp.factory.PizzaAdditionsFactory;

public class ItalianPizzaAdditionsFactory implements PizzaAdditionsFactory {

	@Override
	public Cheese getCheese() {
		return new ParmezanCheese();
	}

	@Override
	public Sauce getSauce() {
		return new MarinaraSauce();
	}

}
