package Chaitanya;

import java.util.*;

public class leftsideAbcd {
	public static void main(String[] args) {
		int k = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number to print no of lines :-");
		int input = sc.nextInt();
		char[] array = new char[26];
		for (int index = 0; index <= 25; index++) {
			 array[index] = (char) (index + 65);

			// System.out.println(array[index]);

		}
		for (int line = 1; line <= input; line++) {
			for (int j = 1; j <= line; j++) {
				System.out.print(array[k]);
				k++;
				sc.close();
			}
			System.out.println();

		}
		System.out.println('"' + "Your Code Sucessfully Compiled :-)" + '"');

	}

}
