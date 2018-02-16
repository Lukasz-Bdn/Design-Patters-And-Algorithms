package dp.factory;

import dp.factory.pizza.Pizza;

public abstract class Pizzeria {
	
	public Pizza orderPizza(String type) {
		Pizza pizza = makePizza(type);
		return pizza;
	}
	
	public abstract Pizza makePizza(String type);
}