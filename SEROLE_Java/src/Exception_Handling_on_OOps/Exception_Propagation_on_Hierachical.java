package Exception_Handling_on_OOps;

class Trees  { // parent
	int a = 20;
	String str = "Chay";

	void method1() {
		System.out.println(str.charAt(55));
	}
}

class Fruits extends Trees { // first child from parent
	void method2() {
		method1();
	}
}

class Flowers extends Trees {   //second child from parent
	void method3() {
		try {
			method1();
		} catch (Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println(a);
		}
	}
}

public class Exception_Propagation_on_Hierachical {
	public static void main(String[]arg)
	{
		Flowers obj=new Flowers();
		obj.method3();
	}

}
