package Exception_Handling;

class Exception_Propagation______ {

	void method1() {
		System.out.println(50 / 0);
	}

	void method2() {
		try {
			method1();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public static void main(String[] args) {
		Exception_Propagation______ obj = new Exception_Propagation______();
		obj.method2();

	}
}
