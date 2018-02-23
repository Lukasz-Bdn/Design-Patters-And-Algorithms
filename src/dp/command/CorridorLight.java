package dp.command;

public class CorridorLight extends Light {

	@Override
	public void switchOn() {
		System.out.println("Switching corridor lights on...");
	}

	@Override
	public void switchOff() {
		System.out.println("Switching corridor lights off...");
	}

}
