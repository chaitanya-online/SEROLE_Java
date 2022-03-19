package Multithreading_On_Strings;

import java.util.Scanner;

class input extends Thread {
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string");
		String str = sc.nextLine();
		System.out.println("Length of " + str + " is " + +str.length());
		System.out.println(Thread.currentThread().getName() + " execution is completed");
		sc.close();

	}
}

class input2 extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getClass());
		System.out.println(Thread.currentThread().getName() + " execution is completed");

	}
}

public class User_Input {
	public static void main(String[] args) throws InterruptedException {
		input obj = new input();
		obj.setName("First Thread");
		input2 obj2 = new input2();
		obj2.setName("Second Thread");
		obj.start();
		obj.join();

		obj2.start();

	}

}
