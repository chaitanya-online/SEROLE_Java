 package Multi_Threading;

class Test1 implements Runnable {
	public void run() {
		for (int i = 1; i < 5; i++) {
			System.out.println("i am run");
			Thread.yield(); // 
		}

	}

}

public class Yeild_Method {
	public static void main(String[] args) throws InterruptedException {

		Test1 obj = new Test1();
		Thread t = new Thread(obj);
		t.start();

		for (int i = 1; i <= 3; i++)
			System.out.println("i am main ");

	}
}
// yield is method which is used to pause the current thread execution give
// chance to waiting threads
// of same priory
