package Arrayss;

import java.util.Scanner;

public class Arr_from_user_input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array :-");
		int size = sc.nextInt();
		int array[] = new int[size];
		System.out.println("Enter the elements in the array :-");
		for (int elements = 0; elements < array.length; elements++) {
			array[elements] = sc.nextInt();
		}
		System.out.print("List of elements in the array are:- ");
		for (int index = 0; index < array.length; index++) {

			System.out.println(array[index] + " ");
		}
		System.out.println("The total length of the array is :- " + array.length);
		sc.close();
	}
}
