package dp.strategy;

public class App {

	public static void main(String[] args) {
		Character roland = new Knight();
		roland.useWeapon();
		roland.setWeapon(new Club());
		roland.useWeapon();
		roland.setWeapon(new Bow());
		roland.useWeapon();
		Character bob = new Peasant();
		bob.useWeapon();
		bob.setWeapon(new Spear());
		bob.useWeapon();
	}
}