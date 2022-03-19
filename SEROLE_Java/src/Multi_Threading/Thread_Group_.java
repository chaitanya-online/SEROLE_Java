package Multi_Threading;

public class Thread_Group_ {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getThreadGroup().getName());// Which is used to get the name of group
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());// Which is used to Parent
																							// group of thread
	}

}
