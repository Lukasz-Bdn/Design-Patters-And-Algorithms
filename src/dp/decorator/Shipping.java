package dp.decorator;

public class Shipping extends ProductDecorator {
	
	Product product;
	
	public Shipping(Product product) {
		this.product = product;
	}

	@Override
	public String getDescription() {
		return product.getDescription() + ", shipping";
	}

	@Override
	public double getPrice() {
		return product.getPrice() + 8.99;
	}

}