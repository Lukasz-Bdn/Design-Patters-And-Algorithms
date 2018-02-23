package dp.command;

public class App {
	public static void main(String[] args) {
		RemoteControl remote =new RemoteControl();
		Light kitchenLight = new KitchenLight();
		Command kitchenLightOn = new LightOnCommand(kitchenLight);
		Command kitchenLightOff = new LightOffCommand(kitchenLight);
		Light corridorLight = new CorridorLight();
		Command corridorLightOn = new LightOnCommand(corridorLight);
		Command corridorLightOff = new LightOffCommand(corridorLight);
		remote.setCommand(0, kitchenLightOn, kitchenLightOff);
		remote.setCommand(1, corridorLightOn, corridorLightOff);
		
		remote.executeOnSlot(0);
		remote.executeOffSlot(0);
	}
}
