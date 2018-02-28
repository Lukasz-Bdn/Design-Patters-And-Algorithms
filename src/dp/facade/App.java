package dp.facade;

public class App {
	public static void main(String[] args) {
		PrintOne one = new PrintOne();
		PrintTwo two = new PrintTwo();
		PrintThree three = new PrintThree();
		
		one.printOne();
		two.printTwo();
		three.printThree();
		
		PrintFacade facade = new PrintFacade(one, two, three);
		facade.printNumbers();
		
	}
}