package OOPs;

class Car {
	String type = "Sports";
	String color = "Red";
	String company = "Ferrari";

}

class type extends Car {
	void display() {
		System.out.println("Car type is " + type);
	}
}

class color extends Car {
	void display() {
		System.out.println("color  is " + color);

	}
}

class brand extends color {
	void display() {
		System.out.println("color  is " + company);

	}
}

public class Hybrid_Hierarchical_Single {
	public static void main(String[] args) {
		type obj = new type();
		obj.display();
		color obj2 = new color();
		obj2.display();
		brand obj3 = new brand();
		obj3.display();

	}
}
