package OOPs;

class A {
	void method1() {
		System.out.println("Method 1");
	}
}

class Single_Level extends A {

	static void method2() { // static method you can directly call without creation of object
		System.out.println("Method 2");
	}

	public static void main(String[] args) {
		Single_Level obj = new Single_Level();
		obj.method1();
		Single_Level.method2();

	}

}
