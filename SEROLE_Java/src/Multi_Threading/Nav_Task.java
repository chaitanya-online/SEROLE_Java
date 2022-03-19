package Multi_Threading;

public class Nav_Task implements Runnable {
	public void run() {

		for (int i = 1; i <= 50; i++) {
			System.out.println(i);
		}
		System.out.println("Serole");
	}

	public static void main(String[] args) throws InterruptedException {
		for (int i = 1; i <= 100; i++) {
			if (i == 50) {

				System.out.println("MultiThreading");
			}
			if (i != 50)
				System.out.println(i);
		}
		Nav_Task m = new Nav_Task();

		Thread t = new Thread(m);
		t.start();
		t.sleep(10000);
		for (int i = 51; i <= 100; i++) {
			System.out.println(i);
		}
	}
}