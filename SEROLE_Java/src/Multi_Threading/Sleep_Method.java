package Multi_Threading;

public class Sleep_Method {
	public static void main(String[] args) {
		System.out.println("Thread started");
		
		try {
			Thread.sleep(5000);  //1k milli == 1 sec

		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		System.out.println("Thread woke up"); // here it prints after 5sec of time
		
		
		
	}

}
