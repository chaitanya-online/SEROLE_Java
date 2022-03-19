package Exception_Handling;

class A {
	void method1() throws NullPointerException {
		try {
			String str = null;
			System.out.println(str.length());

		} catch (NullPointerException e) {
			System.out.println(e);
		}
	}
}

/*
 * class B { void method2() throws ClassNotFoundException { try {
 * Class.forName("B"); System.out.println("B iam there"); } catch
 * (ClassNotFoundException e) { System.out.println(e); }
 * 
 * } }
 */

class B {
	void method2() throws Exception {
		try {
			System.out.println(50 / 5);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

public class Throws_2 {

	public static void main(String[] args) throws NullPointerException, Exception {
		A obj = new A();
		obj.method1();
		B obj1 = new B();
		obj1.method2();

	}

}
