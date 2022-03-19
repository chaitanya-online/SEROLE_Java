package OOPs;

class AAA {
	void methodA() {

		System.out.println("Class AAA");
	}
}

class BBB extends AAA {
	void methodB() {
		System.out.print("Class BBB");
	}
}

class CCC extends AAA {
	void diplay() {
		System.out.print("Class CCC");
	}
}

public class Hierarchical_Inheritance {
	public static void main(String[] args) {
		CCC obj = new CCC();
		obj.methodA();
		obj.diplay();
		// obj.methodB();
	}

}
