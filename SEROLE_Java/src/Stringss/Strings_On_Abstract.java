package Stringss;

abstract class Laptop {
	String str;
	String str2;

	abstract void method();
}

class Lenovo extends Laptop {
	void method() {
		str = "chaitanya";
		str2 = "MURALI         ";
		System.out.println(str.length());
		System.out.println(str.toUpperCase());
		System.out.println(str2.toLowerCase());
		System.out.println(str2.trim());
	}
}

public class Strings_On_Abstract {
	public static void main(String[] args) {
		Lenovo obj = new Lenovo();

		obj.method();
	}

}
