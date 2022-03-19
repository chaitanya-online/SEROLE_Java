package Exception_Handling_on_OOps;

// single + hierarchical
class Topp { // parent
	int a = 10;
}

class World extends Topp { // child from parent
	int b = 30;
	String str = null;

	void method1() {
		System.out.println(str.length());
	}
}

class Country extends World { // 1 child from above World class
	void method2() {
		method1();
	}
}

class State extends World { // 2 child from above World class
	void method3() {
		try {
			method1();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println(b + 10);
		}
	}
}

public class Exception_Propagation_On_Hybrid {
	public static void main(String[] args) {
		State obj = new State();
		obj.method3();
	}

}
