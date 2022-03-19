package Stringss;

import java.util.Scanner;

public class To_Upper_Method_Using_Scan {
	public static void main(String[]args)

	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string in lower to convert to upper");
		String name = sc.nextLine();
		System.out.println(name.toUpperCase());
		
		System.out.println("Enter your string in lower to convert to upper");
		String name1 = sc.nextLine();

		String name2 = new String(name1);
		System.out.println(name2.toUpperCase());
		sc.close();
		
	}
}