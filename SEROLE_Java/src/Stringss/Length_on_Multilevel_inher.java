package Stringss;

class One {                     //Parent
	String str = "Chaitanya";
}

class Two extends One {            // child
	String str2 = "Murali";

	void display() {
		System.out.println(str.length());
	}
}

class Three extends Two {             // child become parent
	void display() {
		System.out.println(str2.length());
	}
}

public class Length_on_Multilevel_inher {
	public static void main(String[] args) {

		Three obj = new Three();
		obj.display();
		Two obj1=new Two();
		obj1.display();
	}

}
