package Multi_Threading;

class Suspend extends Thread {

	public void run() {

		for (int i = 1; i <= 5; i++) {

			System.out.println(i + " " + Thread.currentThread().getName());

			try {
				Thread.sleep(3000);

			}

			catch (Exception e) {

				System.out.println("Exception is caught");
			}
		}
	}
}

public class Suspend_Resume {

	public static void main(String[] args) throws InterruptedException {

		Suspend t1 = new Suspend();
		Suspend t2 = new Suspend();

		t1.start();
t1.join();
		t2.start();
		t2.suspend();
		System.out.println("Thread Suspended");
		t2.resume();

	}
}
