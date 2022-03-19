package Multi_Threading;

class MyThr extends Thread {
	MyThr(ThreadGroup g, String name) {
		super(g, name);
	}

	public void run() {
		System.out.println("Child Thread");

		try {
			Thread.sleep(5000);
		} catch (Exception e) {

		}

	}
}

public class Thread_Group_Methods {
	public static void main(String[] args) throws InterruptedException {
		ThreadGroup pg = new ThreadGroup("Parent Group");
		ThreadGroup cg = new ThreadGroup(pg, "Child Group");
		MyThr t1 = new MyThr(pg, "ChildThread1");
		MyThr t2 = new MyThr(pg, "ChildThread2");
		t1.start();
		t2.start();
		System.out.println(pg.activeCount()); // 2
		System.out.println(pg.activeGroupCount()); // 1
		System.out.println(pg.getMaxPriority()); // Default priority for every thread group is 10
		pg.setMaxPriority(5); // Setting priority for thread group
		System.out.println(pg.getMaxPriority()); // Printing priority after setting
		pg.list();
		Thread.sleep(10000);
		// main is sleeping 10 seconds With in that 10 seconds both t1 t2 completed
		// hence
		// no active threads thats why its 0
		System.out.println(pg.activeCount()); // 0
		pg.list();

	}

}