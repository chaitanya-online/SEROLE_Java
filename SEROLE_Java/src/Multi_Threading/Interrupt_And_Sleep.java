package Multi_Threading;

class MyT implements Runnable {

	public void run() {
		try {
			for (int i = 1; i <= 20; i++) {
				System.out.println(i);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			System.out.println("I got interrupted");
		}

	}
}

public class Interrupt_And_Sleep {
	public static void main(String[] args) {

		MyT obj = new MyT();
		Thread t = new Thread(obj);
		t.start();
		t.interrupt();

		System.out.println("i am main "+Thread.currentThread().getPriority());

	}
}

// Note 1 : - Here the targeted thread is (t) When targeted thread entered into
// sleeping state or Waiting State
// Immediately the interrupt method will interrupt the targeted Thread

// Note 2: - If targeted thread never went to sleep or Wait the interrupt method
// will Wasted
