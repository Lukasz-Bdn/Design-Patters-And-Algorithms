package dp.decorator;

public class Packing extends ProductDecorator {
	
	Product product;

	public Packing(Product product) {
		this.product = product;
	}

	@Override
	public String getDescription() {
		return this.product.getDescription() + ", packaging";
	}

	@Override
	public double getPrice() {
		return this.product.getPrice() + 0.19;
	}
}