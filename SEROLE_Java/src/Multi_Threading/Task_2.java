package Multi_Threading;

class Bottle implements Runnable {
	public void run() {

		for (int i = 1; i <= 100; i++) {
			if (i == 51)
				try {
					Thread.sleep(10000);// here 1000 milli seconds equal to 1 sec
				} catch (InterruptedException e) {
					System.out.println(e);
				}

			System.out.println(i);
		}
		System.out.println("Serole");
	}
}

class Cap implements Runnable {

	public void run() {

		for (int i = 1; i <= 100; i++) {

			if (i == 50) {
				System.out.println("Hello Murali");
			}
			if (i != 50) {
				System.out.println(i);
			}
		}
	}
}

public class Task_2 {
	public static void main(String[] args) throws InterruptedException {
		Bottle obj = new Bottle();
		Thread t = new Thread(obj);
		t.setPriority(Thread.MAX_PRIORITY);

		Cap obj2 = new Cap();
		Thread t1 = new Thread(obj2);
		t1.setPriority(Thread.MIN_PRIORITY);

		t.start();
t.join();
		t1.start();

	}
}
