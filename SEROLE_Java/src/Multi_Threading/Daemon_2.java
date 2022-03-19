// This code is all about when last non daemon 
//thread terminates automatically all daemon thread will terminates irrespective of their position
// Here main is  non daemon and have only one statement  i .e last 
//after it got executed  by CPU then all threads goes to terminate
package Multi_Threading;

class Daemonn extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Child thread");

			try {
				Thread.sleep(1000);
			} catch (Exception e) {

			}
		}
	}

}

public class Daemon_2 {
	public static void main(String[] args) {
		Daemonn obj = new Daemonn();
		obj.setDaemon(true);
		obj.start();
		System.out.println("end of main " + Thread.currentThread().isDaemon());

	}
}
