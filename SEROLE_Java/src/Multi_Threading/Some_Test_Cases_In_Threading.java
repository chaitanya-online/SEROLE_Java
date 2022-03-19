package Multi_Threading;

class MyThread implements Runnable {
	public void run() {
		System.out.println("I am run method");
	}
	void run1()
	{
		System.out.println("run 1");
	}
}

public class Some_Test_Cases_In_Threading {
	public static void main(String[] args) {
		MyThread obj = new MyThread();
		obj.run1();
		//Thread t = new Thread();
		//Thread t2 = new Thread(obj);
		//t.start();
		// t.run();
		// t2.start();
		// t2.run();
		// obj.run();
		//System.out.println("I am main method");

	}
}

/*
 * 
 * Case 1:- t.start () a new thread will be created which is responsible for the
 * execution of thread class run() which has empty implementation
 * 
 * Case 2:- t.run () no new thread is going to created thread class run method
 * execute just like normal method call
 * 
 * Case 3:- t2.start () New Thread will created which is responsible for
 * execution of MyThread (Our class name) run()
 * 
 * Case 4:- t2.run () no new thread is going to created thread class run method
 * execute just like normal method call
 * 
 * Case 5:- obj.run () no New Thread will created and MyThread (Our class name)
 * run() will execute just like normal method call
 * 
 */