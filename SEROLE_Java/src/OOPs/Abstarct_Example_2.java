package OOPs;

abstract class Laptop {
	abstract void buy();

}

class Lenovo extends Laptop {
	void buy() {
		System.out.println("I am windows");

	}
}

class Apple extends Laptop {
	void buy() {
		System.out.println("I am Apple");

	}
}

public class Abstarct_Example_2 {

	public static void main(String[] args) {
		// Apple obj=new Laptop();
		// Lenovo obj = new Lenovo();
		Laptop obj = new Apple();
		obj.buy();
	}
}
