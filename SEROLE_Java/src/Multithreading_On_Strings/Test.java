package Multithreading_On_Strings;

class One extends Thread {
	public void run() {
		String s = new String("Multithrading");

		System.out.println(s.charAt(3));

	}
}

class Two extends Thread {
	public void run() {
		String str = "Hai hello";
		System.out.println(str.toUpperCase());

	}
}

public class Test {
	public static void main(String[] args) {
		One obj = new One();
		Two obj2 = new Two();

		obj.start();
		try {
			obj.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		obj2.start();

	}

}
