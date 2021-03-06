package dp.factory;

import dp.factory.additions.ItalianPizzaAdditionsFactory;
import dp.factory.pizza.CheesePizza;
import dp.factory.pizza.PepperoniPizza;
import dp.factory.pizza.Pizza;
import dp.factory.pizza.SeaPizza;

public class ItalianPizzeria extends Pizzeria {

	@Override
	public Pizza makePizza(String type) {
		Pizza pizza = null;
		PizzaAdditionsFactory additionsFactory = new ItalianPizzaAdditionsFactory();
		
		if (type.equals("cheese")) {
			pizza = new CheesePizza(additionsFactory);
		} else if (type.equals("pepperoni")) {
			pizza = new PepperoniPizza(additionsFactory);
		} else if (type.equals("sea")) {
			pizza = new SeaPizza(additionsFactory);
		}
		return pizza;
	}

}