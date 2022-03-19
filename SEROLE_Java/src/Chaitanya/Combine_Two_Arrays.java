package Chaitanya;

import java.util.*;

public class Combine_Two_Arrays {
	public static void main(String[] args) {
		int elements1;
		int elements2;
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the size of  Your  array 1 ");
		int input = sc.nextInt();
		int array1[] = new int[input];
		System.out.println("Enter the " + input + " elements into the array 1 ");
		for (int index1 = 0; index1 < array1.length; index1++) {
			array1[index1] = sc.nextInt();

		}
		System.out.println("Elements in the  array 1 are :- ");
		for (elements1 = 0; elements1 < array1.length; elements1++) {

			System.out.print(array1[elements1] + " ");
		}

		System.out.println("Enter the size of the array 2");
		Scanner sc2 = new Scanner(System.in);
		int input2 = sc2.nextInt();
		int array2[] = new int[input2];
		System.out.println("Enter the " + input2 + " Elements into the array 2");
		for (int index2 = 0; index2 < array2.length; index2++) {
			array2[index2] = sc2.nextInt();
		}
		System.out.println("Elements in the array 2 are : -");
		for (elements2 = 0; elements2 < array2.length; elements2++) {
			System.out.print(array2[elements2] + " ");

		}
sc.close();
sc2.close();

	}
}
