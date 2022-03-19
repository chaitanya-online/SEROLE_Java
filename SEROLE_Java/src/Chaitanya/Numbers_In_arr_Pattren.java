package Chaitanya;

import java.util.Scanner;

public class Numbers_In_arr_Pattren {

	public static void main(String[] args) {
		int k = 0;
		 int array[]=new int[25];

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number to print");
		int input = sc.nextInt();
	 
		for (int i = 1; i <array.length; i++) {

			array [i]=i;
			//System.out.print(array1[k]);
		
		}
		for (int line = 1; line <= input; line++) {
			for (int j = 1; j <= line; j++) {
				System.out.print(array[k]+" ");
				k++;
				sc.close();
			}
			System.out.println();
		}

	}
}
