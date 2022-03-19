package Multi_Threading;

class Pen implements Runnable {
	public void run() {
		System.out.println("I am pen ");
	}
}

class Ink implements Runnable {
	public void run() {
		System.out.println("I am Ink ");

	}
}

public class Set_Name_Get_Name {
	public static void main(String[] args) {
		Pen obj = new Pen();
		Thread t = new Thread(obj);
		System.out.println(t.getName()); // Before Setting Thread Name
		t.setName("I am Pen Thread");
		System.out.println(t.getName());  // After Setting Thread Name

		Ink obj2 = new Ink();

		Thread t2 = new Thread(obj2);
		System.out.println(t2.getName());  // Before Setting Thread Name
		t2.setName("I am Ink Thread");
		System.out.println(t2.getName());  // After Setting Thread Name

	}
}
