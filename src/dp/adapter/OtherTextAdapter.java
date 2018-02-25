package dp.adapter;

public class OtherTextAdapter implements PrintInterface {
	public PrintOtherText printOtherText;

	public OtherTextAdapter(PrintOtherText printOtherText) {
		this.printOtherText = printOtherText;
	}

	@Override
	public void printText() {
		this.printOtherText.printOtherText();		
	}
	
}
