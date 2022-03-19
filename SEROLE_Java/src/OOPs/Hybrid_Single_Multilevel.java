package OOPs;
//hybrid inheritance is combination of any two inheritances below code is combo of multilevel + single

class internet {
	void display() {
		System.out.println("Iam internet class method");
	}
}

class social_media extends internet {
	void display2() {
		System.out.println("Iam social_media class method");

	}
}

class Whatsapp extends social_media {
	void display3() {
		System.out.println("iam whatsapp class method");
	}
}

class insta extends social_media {
	void display4() {
		System.out.println("iam insta class method");
	}
}

public class Hybrid_Single_Multilevel {
	public static void main(String[] args) {
		insta obj = new insta();
		obj.display();
		obj.display2();
		Whatsapp obj2 = new Whatsapp();
		obj2.display3();
		obj.display4();

	}

}
