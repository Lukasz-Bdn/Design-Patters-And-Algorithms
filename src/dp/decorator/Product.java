package dp.decorator;

public abstract class Product {
	
	String description = "Unknown product";
	
	public String getDescription() {
		return this.description;
	}
	
	public abstract double getPrice();
	
}