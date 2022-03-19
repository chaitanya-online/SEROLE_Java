package Multi_Threading;

class Join extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Seetha");

			try {
				Thread.sleep(2000);
			} catch (Exception e) {

			}

		}
	}

}

public class Join_2 {
	public static void main(String[] args) throws InterruptedException {

		Join obj = new Join();

		obj.start();
		obj.join(10000);    // here it waits up to 10000 Sec only
		for (int i = 0; i < 10; i++) {
			System.out.println("Rama");
		}

	}
}
