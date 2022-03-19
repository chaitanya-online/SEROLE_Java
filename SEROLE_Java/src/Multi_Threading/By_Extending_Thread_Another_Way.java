package Multi_Threading;

 class my extends Thread {
	public void run()
	{
		for(int i=1;i<=5;i++)
		System.out.println(" i am run method thread "+Thread.currentThread().getPriority());
	}

} 
 public class  By_Extending_Thread_Another_Way {
	 public static void main(String[] args) {
		 my obj=new my();
		 Thread t=new Thread(obj);
		 t.start();
		 for(int i=1;i<=5;i++)
		System.out.println(" i am main method thread"+Thread.currentThread().getPriority());
		 
	}
 }
/* Here my is child class of Thread 
 * Thread is already implements Runnable 
 * 
 * 
 * 
 */
 