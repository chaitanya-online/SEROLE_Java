package Exception_Handling;

public class Aritmetic_Exception {
	public int method(int a, int b) {
		int z = a / b;
		return z;
	}

	public int method2() {
		int aa = 20;
		int bb = 30;
		int c = aa + bb;
		return c;

	}

	public static void main(String[] args) {
		Aritmetic_Exception obj = new Aritmetic_Exception();
		Aritmetic_Exception obj1 = new Aritmetic_Exception();

		int add = obj1.method2();
		System.out.println(add);
		int exception = obj.method(10, 0);
		System.out.println(exception);
	}

}
