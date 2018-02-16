package dp.factory;

import dp.factory.pizza.Pizza;

public class App {
	public static void main(String[] args) {
		Pizzeria pizzeria = new ItalianPizzeria();
		Pizza pizza = pizzeria.makePizza("cheese");
		System.out.println(pizza.cheese);
	}
}