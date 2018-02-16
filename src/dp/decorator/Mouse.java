package dp.decorator;

public class Mouse extends Product {

	public Mouse() {
		description = "New Mouse";
	}
	
	@Override
	public double getPrice() {
		return 19.89;
	}

}
