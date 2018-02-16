package dp.decorator;

public class App {

	public static void main(String[] args) {
		Product product = new Laptop();
		System.out.println(product.getDescription());
		System.out.println("------------");
		
		Product product2 = new Mouse();
		System.out.println(product2.getDescription() + " | " + product2.getPrice());
		System.out.println("------------");
		product2 = new Shipping(product2);
		System.out.println(product2.getDescription() + " | " + product2.getPrice());
		System.out.println("------------");
		product2 = new Packing(product2);
		System.out.println(product2.getDescription() + " | " + product2.getPrice());
		System.out.println("------------");
		product2 = new GiftPacking(product2);
		System.out.println(product2.getDescription() + " | " + product2.getPrice());
		System.out.println("------------");

	}
}