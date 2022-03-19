package Stringss;

class Vehicle // parent
{
	String str = "   Bike Two Wheeler ";
	String str2 = "  Car Four Wheeler  ";

}

class Bike extends Vehicle // one child from parent
{
	void myMethod() {
		System.out.println(str.trim());
	}
}

class Car extends Vehicle // another child from parent
{
	void myMethod() {
		System.out.println(str2.trim());

	}
}

public class Trim_On_Hierarchical_Inher {

	public static void main(String[] args) {

		Bike obj1 = new Bike();
		obj1.myMethod();
		Car obj = new Car();
		obj.myMethod();

	}

}
