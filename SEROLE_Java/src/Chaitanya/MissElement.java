package Chaitanya;

import java.util.Scanner;

public class MissElement {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number from 1 to 10 to delete element");
		int input = sc.nextInt();

		for (int i = 1; i <= 10; i++) {
			int array[] = { i };
			for (int j = 0; j < array.length; j++)
				if (input == array[j]) {
					continue;
				}
				else
				{
					System.out.println(array[j]);
					sc.close();
				}
		
		}
	}
}
