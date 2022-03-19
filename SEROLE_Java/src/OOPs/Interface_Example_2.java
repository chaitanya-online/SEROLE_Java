package OOPs;

interface OS {
	abstract void install();
}

class windows1 implements OS {
	public void install() {
		System.out.println("Hai i am open source os");
	}
}

class Mac implements OS {

	public void install() {
		System.out.println("Hai i am restricted os");
	}

}

public class Interface_Example_2 {
	public static void main(String[] args) {
		OS obj = new Mac();
		obj.install();
		OS obj1 = new windows1();
		obj1.install();
		Mac obj3=new Mac();
		obj3.install();
		windows1 obj4=new windows1();
		obj4.install();
		
	}

}
