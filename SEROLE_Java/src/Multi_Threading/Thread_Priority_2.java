package Multi_Threading;

class GrandFather implements Runnable {
	public void run() {
		int i = 1;
		while (i <= 3) {
			System.out.println(i + " Grand father "+Thread.currentThread().getPriority());
			i++;
		}
		System.out.println("==========");
	}
}

class Father implements Runnable {
	public void run() {
		int i = 1;
		while (i <= 3) {
			System.out.println(i + " Father "+Thread.currentThread().getPriority());

			i++;
		}
		System.out.println("==========");

	}
}

class Son implements Runnable {
	public void run() {
		int i = 1;
		while (i <= 3) {
			System.out.println(i + " Son "+Thread.currentThread().getPriority());

			i++;
		}
		System.out.println("==========");

	}
}

public class Thread_Priority_2 {
	public static void main(String[] args) {

		GrandFather obj1 = new GrandFather();
		Thread t1 = new Thread(obj1);
		Father obj2 = new Father();
		Thread t2 = new Thread(obj2);
		Son obj3 = new Son();
		Thread t3 = new Thread(obj3);

		//t1.setPriority(Thread.MIN_PRIORITY); // 1
		t1.setPriority(9);
		t2.setPriority(10);// 10
		t3.setPriority(7); // if u not set by default it is 5


		t2.start();
		t1.start();
		t3.start();
		

	}

}

// Note :- In general, at any time, the highest priority thread is running. But sometimes, 
// the thread scheduler might choose low-priority threads for execution to avoid starvation.
