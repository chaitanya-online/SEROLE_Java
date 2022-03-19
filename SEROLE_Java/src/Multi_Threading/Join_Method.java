package Multi_Threading;

class Method implements Runnable {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Day " + i + " Fever Cough and Throat pain ");
			try {
				Thread.sleep(2000);

			} catch (InterruptedException e) {
				System.out.println(e);
			}

		}

	}

}

class Method2 implements Runnable {
	public void run() {
		System.out.println("Corona");

	}

}

public class Join_Method {
	public static void main(String[] args) throws InterruptedException {
		Method obj = new Method();
		Thread t = new Thread(obj);

		Method2 obj1 = new Method2();
		Thread t2 = new Thread(obj1);
		t.start();
		t.join(); // Here the t2 waits until completion of t
		t2.start();

	}
}
