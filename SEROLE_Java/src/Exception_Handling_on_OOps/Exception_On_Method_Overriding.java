package Exception_Handling_on_OOps;

class Super {
	void display() {
		System.out.println("I am Super class method");
	}
}

class Child extends Super {
	void display() throws ArithmeticException {
		System.out.println(100 /0 );

	}
}

public class Exception_On_Method_Overriding {
	public static void main(String[] args) {
		Child s = new Child ();
		try {
			s.display();
		} catch (ArithmeticException e) {
			System.out.println(e);
		}

	}
}