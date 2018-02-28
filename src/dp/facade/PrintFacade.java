package dp.facade;

public class PrintFacade {
	private PrintOne one;
	private PrintTwo two;
	private PrintThree three;
	
	public PrintFacade(PrintOne one, PrintTwo two, PrintThree three) {
		this.one = one;
		this.two = two;
		this.three = three;
	}

	public void printNumbers() {
		one.printOne();
		two.printTwo();
		three.printThree();
	}
}
