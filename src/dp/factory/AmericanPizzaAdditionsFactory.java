package dp.factory;

import dp.factory.additions.BarbecueSauce;
import dp.factory.additions.Cheese;
import dp.factory.additions.RegularCheese;
import dp.factory.additions.Sauce;

public class AmericanPizzaAdditionsFactory implements PizzaAdditionsFactory {

	@Override
	public Cheese getCheese() {
		return new RegularCheese();
	}

	@Override
	public Sauce getSauce() {
		return new BarbecueSauce();
	}

}
