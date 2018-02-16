package dp.singleton;

public class Singleton {
	private String text;
	private static Singleton singletonInstance;
	
	private Singleton() {
		this.text = "New clean instance";
	}
	
	public static Singleton getInstance() {
		if(singletonInstance==null) {
			singletonInstance = new Singleton();
		}
		return singletonInstance;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
}