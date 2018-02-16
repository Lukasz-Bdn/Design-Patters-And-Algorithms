package dp.singleton;

public class App {
	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		System.out.println(singleton.getText());
		Singleton singleton2 = Singleton.getInstance();
		singleton2.setText("Something changed in second object");
		System.out.println(singleton.getText());
	}
}
