package Multi_Threading;

public class Thread_Group_1 {
	public static void main(String[] args) {
		// Constructor 1
		ThreadGroup g = new ThreadGroup("First Group");
		// It creates thread group with specified name
		System.out.println(g.getParent().getName());
		// it prints parent of the created group
		System.out.println(g.getName());
		
		// Constructor 2
		ThreadGroup g1 = new ThreadGroup(g, "Second Group");
		// It creates group under specified group name
		System.out.println(g1.getParent().getName());
		System.out.println(g1.getName());
	}

}
