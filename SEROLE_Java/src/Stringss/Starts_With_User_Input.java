package Stringss;

import java.util.Scanner;

public class Starts_With_User_Input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your string");
		String input=sc.nextLine();
		System.out.println("enter string to check above string is starts with given string or not");
		String input2=sc.nextLine();
		int input3=sc.nextInt();
		if(input.startsWith(input2,0+input3))
		{
			System.out.print("Yes "+input+" Starts with "+input2);
		}
		else
		{
			System.out.print("No "+input+" Not with "+input2);

		}
		
		sc.close();

	}

}
