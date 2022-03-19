package Multi_Threading;

class Onee implements Runnable {
	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
		System.out.println("Serole");
	}
}

class Twoo implements Runnable {
	public void run() {
		for (int i = 1; i <= 100; i++) {

			if (i == 50) {
				System.out.println("Hello Chaitanya");
			}
			if (i != 50) {
				System.out.println(i);
			}
		}
	}
}

public class Task1 {
	public static void main(String[] args) {

		Onee obj1 = new Onee();
		Thread t1 = new Thread(obj1);

		Twoo obj2 = new Twoo();
		Thread t2 = new Thread(obj2);

		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
		
		}
		t2.start();
	
		
		

	}
}