package Multi_Threading;

class Display {
	public synchronized  void Wish(String Name) {  // Wish is the Method name here
		for (int i = 1; i <= 5; i++) {
			System.out.print("Hai : ");

			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
			System.out.println(Name);
		}
	}

}

class MyThreadd extends Thread {            // Creating parameterized Constructor
	Display d;
	String Name;

	MyThreadd(Display d, String Name) {
		this.d = d;
		this.Name = Name;

	}

	public void run() {
		d.Wish(Name);
	}

}

public class Synchronization____ {
	public static void main(String[] args) {
		Display d = new Display();              // d is the object 
		MyThreadd t1 = new MyThreadd(d, "Dhoni");    /*  The two Threads t1 and t2 accessing object d*/
		MyThreadd t2 = new MyThreadd(d, "Kohli");
		t1.start();
		t2.start();

	}
}
