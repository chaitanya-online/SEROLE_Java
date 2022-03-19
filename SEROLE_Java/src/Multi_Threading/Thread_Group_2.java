package Multi_Threading;

// This program is to print all active threads belong to System Group and Child Group
public class Thread_Group_2 {
	public static void main(String[] args) {
		ThreadGroup system = Thread.currentThread().getThreadGroup().getParent();
		Thread[] t = new Thread[system.activeCount()];
		system.enumerate(t);
		for (Thread t1 : t) {
			System.out.println(t1.getName());

		}
	}

}
