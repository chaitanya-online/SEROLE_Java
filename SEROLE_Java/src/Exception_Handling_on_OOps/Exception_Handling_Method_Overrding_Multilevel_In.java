package Exception_Handling_on_OOps;

class Os {
	void method1() {
		System.out.println("Without me You can't do Anything on Computer");
	}
}

class Windows extends Os {
	void method1() {
		System.out.println("I am Open Source Platform");
	}
}

class Windows11 extends Windows {
	void method1() {
		String str = "Windows11";
		System.out.println(str.charAt(22));
	}
}

public class Exception_Handling_Method_Overrding_Multilevel_In {
	public static void main(String[] args) {
		Windows obj = new Windows();
		Windows11 obj1 = new Windows11();
		obj.method1();
		try {
			obj1.method1();
		} catch (Exception e) {
			System.out.println(e);

		}

	}
}
