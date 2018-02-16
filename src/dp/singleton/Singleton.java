package dp.singleton;

public class Singleton {
	private String text;
	private Singleton singeltonInstance;
	
	private Singleton() {
		this.singeltonInstance = new Singleton();
		this.text = "Clean, unchaged instance";
	}
	
	public Singleton getInstance() {
		if(singeltonInstance==null) {
			return new Singleton();
		}
		return singeltonInstance;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
}