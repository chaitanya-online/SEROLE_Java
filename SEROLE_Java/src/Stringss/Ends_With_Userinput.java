package Stringss;

import java.util.Scanner;

public class Ends_With_Userinput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string :");
		String input = sc.nextLine();
		System.out.println("Enter your string to check :");
		String input2 = sc.nextLine();

		if (input.endsWith(input2)) {

			System.out.println("Yes "+input+" ends with " + input2);
		} else {

			System.out.println(input + " not ends with " + input2);
		}
		sc.close();

	}
	
}
