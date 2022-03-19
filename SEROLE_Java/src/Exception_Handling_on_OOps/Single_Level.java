package Exception_Handling_on_OOps;

class A {
	String s = null;
	int a = 10;
	int b = 0;
}

class B extends A {
	void method() {
		System.out.println(a);
		try {
			System.out.println(a / b);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("Iam allways executes");
		}
	}

}

public class Single_Level {
	public static void main(String[] args) {
		B obj = new B();
		obj.method();
	}

}
