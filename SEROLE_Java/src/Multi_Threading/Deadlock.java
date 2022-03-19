package Multi_Threading;

class AA {
	public synchronized void d1(BB b)
	{
		System.out.println("Thread 1 starts execution of d1() method");
		try {
			Thread.sleep(5000);
		}
		catch(InterruptedException  e)
		{
			
		}
		System.out.println("Thread 1 trying to call B's last()");
		b.last();
		
	}
	public synchronized void last()
	{
		System.out.println("In side A class this is last ()");
	}
	
}
class BB
{
	public synchronized void d2(AA a)
	{
		System.out.println("Thread 2 starts execution of d2() method");
		try {
			Thread.sleep(5000);
		}
		catch(InterruptedException  e)
		{
			
		}
		System.out.println("Thread 2 trying to call A's last()");
		a.last();
		
}
	public synchronized void last()
	{
		System.out.println("In side B class this is last ()");
	}
	
}

public class Deadlock extends Thread {
	AA a=new AA();
	BB b=new BB();
	public void m1()
	{
		this.start();
		a.d1(b);  // This line executed by main thread
	}
	public void run()
	{
		b.d2(a); //This line executed by child thread
	}
	public static void main(String[] args) {
		Deadlock obj=new Deadlock();
		obj.m1();
	}

}


//Note :- If we remove at least one Synchronized keyword for any one of method then Deadlock won't occur
//that's why synchronization is the only reason for deadlock
