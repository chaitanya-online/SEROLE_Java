package Exception_Handling;

public class Exception_Propagation_2 {
	void method1() {
		String str = "Chaitanya";
		System.out.println(str.length());
	}

	void method2() {
		method1();           // propagated here but not handled
		{

		}
	}

	void method3() {
		// System.out.println(50 / 0);

		try { // here handling exception of method()
			method2(); // method2() have method1
		} catch (NullPointerException e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		Exception_Propagation_2 obj = new Exception_Propagation_2();
		obj.method3();

	}

}
