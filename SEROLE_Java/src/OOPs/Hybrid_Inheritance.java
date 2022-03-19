package OOPs;
// hybrid inheritance is combination of any two inheritances below code is combo of single + Hierarchical
class cow {
	void display() {
		System.out.println("Iam cow class method");
	}
}

class milk extends cow {
	void display2() {
		System.out.println("iam milk class method");
	}
}

class curd extends milk {
	void display3() {
		System.out.println("iam curd class method");

	}
}

class ghee extends milk {
	void disply4() {
		System.out.println("iam ghee class method");
	}
}

public class Hybrid_Inheritance {
	public static void main(String[] args) {
		ghee obj = new ghee();
		curd obj3 = new curd();
		obj.display();
		obj.display2();
		obj.disply4();
		obj3.display3();

	}

}
