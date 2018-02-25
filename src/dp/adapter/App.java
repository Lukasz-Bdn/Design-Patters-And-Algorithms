package dp.adapter;

public class App {
	public static void main(String[] args) {
		PrintInterface printer = new PrintText();
		printer.printText();
		
		PrintInterface printerOther = new OtherTextAdapter(new PrintOtherText());
		printerOther.printText();
	}
}