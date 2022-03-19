package Stringss;

import java.util.Scanner;

public class Replace_Particular_Element {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your String");
		String string = sc.nextLine();
		System.out.println("Enter index below " + string.length());
		int index = sc.nextInt();
		System.out.println("Enter any one character you want to replace in " + string);
		char character = sc.next().charAt(0);
		string = string.substring(0, index) + character + string.substring(index + 1);
		System.out.println(string);
		sc.close();

	}

}
