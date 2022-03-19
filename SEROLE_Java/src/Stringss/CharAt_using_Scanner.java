package Stringss;

import java.util.Scanner;

public class CharAt_using_Scanner {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your string");
		String input=sc.nextLine();
		System.out.println("Enter your index number ");
		int input1=sc.nextInt();
		System.out.println(input.charAt(input1));
		sc.close();
	}

}
