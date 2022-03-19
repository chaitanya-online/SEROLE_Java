package Multi_Threading;

public class Thread_Priority extends Thread {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getPriority());
		
	}

}
// By default main thread priority is 5