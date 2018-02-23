package dp.command;

public class LightOnCommand implements Command {
	Light light;

	public LightOnCommand(Light light) {
		super();
		this.light = light;
	}

	@Override
	public void execute() {
		this.light.switchOn();
	}

}
