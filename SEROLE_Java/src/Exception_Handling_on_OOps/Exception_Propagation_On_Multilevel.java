package Exception_Handling_on_OOps;

class Cup {
	String str = "I am cup";

	void display() { // raises exception
		System.out.println(str.charAt(20));
	}
}

class Milk extends Cup {
	void display1() { // propagated here but not handled
		display();
	}
}

class Coffe extends Milk {
	
	void display2() { // propagated here to handle
		try {
			display1();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

public class Exception_Propagation_On_Multilevel {
	public static void main(String[] args) {
		/*
		 * Milk obj = new Milk(); obj.display();
		 */
		Coffe obj2 = new Coffe();
		obj2.display2();
	}

}
