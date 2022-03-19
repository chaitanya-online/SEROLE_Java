package Multi_Threading;

class Displayy {
	public synchronized void displayn() { // Loop top print 1-10 numbers
		for (int i = 1; i <= 10; i++) {
			System.out.print(i);
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
			}
		}

	}

	public synchronized void displaychar() { // Loop to Print Characters From A to K
		for (int i = 65; i <= 75; i++) {
			System.out.print((char) i);
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
			}
		}
	}
}

class MyThread1 extends Thread { // Constructor
	Displayy d;

	MyThread1(Displayy d) {

		this.d = d;
	}

	public void run() {
		d.displayn();
	}

}

class MyThread2 extends Thread { // Constructor
	Displayy d;

	MyThread2(Displayy d) {

		this.d = d;
	}

	public void run() {
		d.displaychar();
	}

}

public class Synchronization_2 {
	public static void main(String[] args) {
		Displayy d = new Displayy();
		MyThread1 t1 = new MyThread1(d);
		MyThread2 t2 = new MyThread2(d);
		t1.start();
		t2.start();

	}
}