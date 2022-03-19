package Exception_Handling_on_OOps;

// Hybrid means any two type of inheritances here Hierarchical+Single
class Mobile { // parent
	static int a = 10;
	static int b = 0;
	static String str = null;
	static String str2 = "Hello";

}

class Andriod extends Mobile { // 1 child from parent
	static void andriod() {
		try {
			System.out.println(a / b);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
	}
}

class Ioss extends Mobile { // 2 child from parent
	static String s = "Iphone13";

	static void ios() {
		System.out.println(str2);
		try {
			System.out.println(str.length());

		} catch (NullPointerException e) {
			System.out.println(e);
		}
	}
}

class Apple extends Ioss { // from child another child class Ios become parent here
	static void apple() {
		try {
			System.out.println(s.charAt(4));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}

	}
}

public class Hybrid__ {
	public static void main(String[] args) {
		Andriod.andriod();
		Ioss.ios();
		Apple.apple();

	}

}
