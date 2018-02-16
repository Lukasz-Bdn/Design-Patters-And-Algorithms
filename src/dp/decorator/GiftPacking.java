package dp.decorator;

public class GiftPacking extends ProductDecorator {
	
	Product product;

	public GiftPacking(Product product) {
		this.product = product;
	}

	@Override
	public String getDescription() {
		return this.product.getDescription() + ", gift wrapping";
	}

	@Override
	public double getPrice() {
		return this.product.getPrice() + 1.20;
	}
	
}