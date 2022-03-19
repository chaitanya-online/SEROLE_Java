package OOPs;

abstract class Designation {
	void display() {
	}
}

class second extends Designation {
	void display() {
		System.out.println("Aprove my leave");
	}
}

public class Abstract_Example {
	public static void main(String[] args) {
		second obj = new second();
		obj.display();
	}
}