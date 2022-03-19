package Stringss;

import java.util.Scanner;

public class Task2_on_Strings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string to convert:-");

		String input = sc.nextLine();
		System.out.println("Your string in lower case : " + input.toLowerCase());
		System.out.println("Your String in upper case : " + input.toUpperCase());
		System.out.println("Enter your string to convert:-");

		sc.close();

	}

}
