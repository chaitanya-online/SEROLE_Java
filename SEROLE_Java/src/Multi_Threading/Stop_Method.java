package Multi_Threading;

class Stop implements Runnable {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {

			}
			System.out.println(i);
		}
	}
}

public class Stop_Method {

	public static void main(String[] args) throws InterruptedException {
		Stop obj1 = new Stop();
		Stop obj2 = new Stop();
		Stop obj3 = new Stop();

		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		Thread t3 = new Thread(obj3);

		t1.start();

		t1.join();
		t2.start();
		t2.join();
		t3.stop();
		t3.start();  // it wont start becoz we all ready stooped this thread

	}

}
