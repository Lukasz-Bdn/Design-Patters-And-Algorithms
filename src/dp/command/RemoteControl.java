package dp.command;

public class RemoteControl {
	Command[] onCommand;
	Command[] offCommand;
	
	public RemoteControl() {
		this.onCommand = new Command[2];
		this.offCommand = new Command[2];
		
		Command emptyCommand = new EmptyCommand();
		for (int i =0; i<2; i++) {
			this.onCommand[i] = emptyCommand;
			this.offCommand[i] = emptyCommand;
		}
	}

	public void setCommand(int slot, Command onCommand, Command offCommand) {
		this.onCommand[slot] = onCommand;
		this.offCommand[slot] = offCommand;
	}
	
	public void executeOnSlot(int slot) {
		this.onCommand[slot].execute();
	}
	
	public void executeOffSlot(int slot) {
		this.offCommand[slot].execute();
	}
	
}
