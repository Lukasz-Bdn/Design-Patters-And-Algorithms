package dp.command;

public class KitchenLight extends Light {

	@Override
	public void switchOn() {
		System.out.println("Switching kitchen lights on...");
	}

	@Override
	public void switchOff() {
		System.out.println("Switching kitchen lights off...");
	}
}