package Exception_Handling_on_OOps;

class Laptop {// parent
	String str = "Chaitanya";
	String str1 = null;
	int a = 10, b = 0;
}

class Dell extends Laptop { // child
	void dellMethod() {
		try {
			System.out.println(str.length());
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

class Hp extends Laptop { // child
	void Hpmethod() {
		try {
			System.out.println(a / b);
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}

public class Hierarchical__ {
	public static void main(String[] args) {
		Dell obj = new Dell();
		obj.dellMethod();
		Hp obj1 = new Hp();
		obj1.Hpmethod();

	}

}
