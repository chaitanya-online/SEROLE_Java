package OOPs;

interface ios {
	String company = "Apple";
	String model = "13 pro max";
	double price = 90000.0;
}

interface andriod {
	String company1 = "Google";
	String model1 = "pixel 6";
	double price1 = 65000.0;
}

class mobile implements ios, andriod {
	String model2 = "Windows";

	void display1() {
		System.out.println("My ios mobile is " + company);
		System.out.println("My ios mobile model is " + model);

	}

	void display2() {
		System.out.println("My andriod mobile is " + company1);
	}
}

class Windows extends mobile {
	void display3() {
		System.out.println("My windows mobile is " + model2);
	}
}

public class Hybrid_Multiple_Single {
	public static void main(String[] args) {
		mobile obj = new mobile();
		Windows obj2 = new Windows();

		obj.display1();
		obj.display2();
		obj2.display3();

	}

}
