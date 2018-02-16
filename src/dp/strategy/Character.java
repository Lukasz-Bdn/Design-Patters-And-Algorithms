package dp.strategy;

public abstract class Character {
	WeaponInterface weapon;
	
	public void useWeapon() {
		this.weapon.useWeapon();
	}
	
	public void setWeapon(WeaponInterface weapon) {
		this.weapon = weapon;
	}
}