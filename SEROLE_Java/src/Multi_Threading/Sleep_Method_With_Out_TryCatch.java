package Multi_Threading;

class one implements Runnable {
	public void run() {
		System.out.println("Hai iam run () ");
	}
}

public class Sleep_Method_With_Out_TryCatch {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Hai iam main ()");

		one obj = new one();
		Thread t = new Thread(obj);
		t.start();

		Thread.sleep(5000);
		System.out.println("I woke up");

	}
}
