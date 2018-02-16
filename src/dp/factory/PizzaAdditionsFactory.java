package dp.factory;

import dp.factory.additions.Cheese;
import dp.factory.additions.Sauce;

public interface PizzaAdditionsFactory {
	public Cheese getCheese();
	public Sauce getSauce();
}