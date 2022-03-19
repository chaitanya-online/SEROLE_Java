package Multi_Threading;

class Alive implements Runnable {
	public void run() {
		System.out.println("I am Alive method "+Thread.currentThread().isAlive());
	}

}

public class Is_Alive {
	public static void main(String[] args) {
		Alive obj=new Alive();
		Thread t=new Thread(obj);
		System.out.println(t.isAlive()); // Here it prints falls because thread not started yet
		t.start();
		System.out.println(t.isAlive()); // Here it prints True because thread is in running phase
		

	}
}
//Note :- It returns true if thread is running other wise it print false