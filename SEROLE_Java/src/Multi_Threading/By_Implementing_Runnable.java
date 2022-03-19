package Multi_Threading;

class AAA implements Runnable {
	public void run() {
		for (int i = 1; i < 5; i++)
			System.out.println("i am run");
	}
}

class AAAA implements Runnable {
	public void run() {
		for (int i = 1; i < 5; i++)
			System.out.println("i am run2");
	}
}

public class By_Implementing_Runnable {

	public static void main(String[] args) {
		AAA run = new AAA();
		
		Thread t = new Thread(run);

		AAAA run2 = new AAAA();
		Thread t1 = new Thread(run2);

		t.setPriority(Thread.MAX_PRIORITY);
		t.start();

		t1.setPriority(Thread.MIN_PRIORITY);
		t1.start();

	}

}

// Note :- The reason behind Why we are Creating Thread object is to Start Our
// Thread Class
// Named with AAA and AAAA and and Runnable Interface don't have Start() thats
// the main reason
// We are Creating Object for Thread Class to Start our Thread name with AAA