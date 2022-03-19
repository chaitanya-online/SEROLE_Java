package Multi_Threading;

class A extends Thread {
	public void run() {
	

		for (int i = 1; i < 5; i++) {
			System.out.println("Run ");
		}

	}
}

public class By_Extending_Thread {
	public static void main(String[] args) {
		A obj = new A();
		A obj1 = new A();
		obj.setPriority(Thread.MAX_PRIORITY);
		obj.start();
		obj1.start();
		

	/*	for (int i = 1; i < 5; i++) {

			System.out.println("Main");*/
		}

	}

