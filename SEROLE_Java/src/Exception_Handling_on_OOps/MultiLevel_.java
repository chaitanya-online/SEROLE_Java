package Exception_Handling_on_OOps;

class AA {  // parent

	int a = 20;
	int b = 0;

}

class BB extends AA {  // child from parent

	String str = null;

	void display() {
		try {
			System.out.println(a / b);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}

	}
}

class CC extends BB { // child become parent here
	void display() {

		try {
			System.out.println(str.length());
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Iam BB classes child");
	}

}

public class MultiLevel_ {
	public static void main(String[] args) {
		CC obj = new CC();
		obj.display();
		BB obj1 = new BB();
		obj1.display();

	}
}
