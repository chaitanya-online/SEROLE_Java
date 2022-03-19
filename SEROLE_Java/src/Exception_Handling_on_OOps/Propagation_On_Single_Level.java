package Exception_Handling_on_OOps;

class One {//parent
	int a = 20;

	void display() { // it have exception

		System.out.println(50 / 0);
	}

}

class Two extends One {// child
	void display2() {
		System.out.println(a);
		try {
			display(); // propagated  here to handle exception
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

public class Propagation_On_Single_Level {
	public static void main(String[] args) {
		Two obj = new Two();
		obj.display2();
	}
}
