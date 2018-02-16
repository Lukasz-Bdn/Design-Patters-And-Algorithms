package dp.decorator;

public class Laptop extends Product {
	
	public Laptop() {
		description = "New Laptop";
	}

	@Override
	public double getPrice() {
		return 1200;
	}

}