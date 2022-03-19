package Chaitanya;

import java.util.*;

public class NumberPattren {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to print :-");
		int input = sc.nextInt();
		for (int i = 1; i <= input; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i+ " ");
			}
			System.out.println();

		}
		
		System.out.print("'"+"Your code running sucessfully"+"'");
		sc.close();

	}

}
