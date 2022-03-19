package Multi_Threading;

class Daemon implements Runnable {
	public void run() {
		if (Thread.currentThread().isDaemon()) {
			System.out.println("Hey! iam Daemon Thread Executing");
			for (int i = 1; i <= 3; i++) {
				System.out.println(i);
			}

		} else {
			System.out.println("Hey iam User Thread ");
			
		}

	}
}

public class Daemon_Thread {
	public static void main(String[] args) {
		Daemon obj = new Daemon();
		Thread t = new Thread(obj);

		Daemon obj1 = new Daemon();
		Thread t1 = new Thread(obj1);
		t.setDaemon(true);
		t.start(); 
		t1.start();

	}

}
