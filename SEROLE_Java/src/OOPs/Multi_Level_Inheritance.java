package OOPs;

class AA {
	void aa() {
		System.out.println("I am class A");
	}
}

class B extends AA {
	void display() {
		System.out.println("I am class B");
	}
}

class C extends B {
	  void display() {
		System.out.println("I am class C");
	}
}

public class Multi_Level_Inheritance {
	public static void main(String[] args) {
		C obj = new C();
		B obj2=new B();
		obj.display();
		obj.display();
		//C.display();
		obj2.display();
	
		
	}

}
