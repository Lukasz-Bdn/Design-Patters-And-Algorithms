package dp.various;

public class ObjectChange {

	public static void main(String[] args) {
		String string1 = "abc";
		String string3 = string1;
		System.out.println(string1);
		System.out.println(string3);
		string1 = "def";
		System.out.println(string1);
		System.out.println(string3);
	}
}