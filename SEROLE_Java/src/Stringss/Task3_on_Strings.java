package Stringss;

import java.util.Scanner;

public class Task3_on_Strings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your First String");
		String first = sc.nextLine();
		System.out.println("Enter Your Second String");
		String second = sc.nextLine();
		//equals
		System.out.println(first.equals(second));
		//equals ignore case
		System.out.println(first.equalsIgnoreCase(second));
		System.out.println("Enter Your Third String");
		String Third = sc.nextLine();
		System.out.println("Enter Your Forth String");
		String Forth = sc.nextLine();
		int length = Forth.length();
		System.out.println("Enter index for above string to find element  " + length);
		int input = sc.nextInt();
		System.out.println(Forth.charAt(input));
		/*
		 * conacat System.out.println(Third.concat(Forth));
		 */
		System.out.println(Forth);
		System.out.println("Please enter two integer values below or eqaul to " + length + " find substring ");
		int sub1 = sc.nextInt();
		int sub2 = sc.nextInt();
		System.out.print(Forth.substring(sub1, sub2));
		sc.close();
	}

}
