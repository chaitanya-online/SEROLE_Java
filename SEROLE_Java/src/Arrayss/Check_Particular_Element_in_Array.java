package Arrayss;

import java.util.*;

public class Check_Particular_Element_in_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter element to check in array");
		int input = sc.nextInt();
		int check = input;
		int k = 0;
		int arr[] = { 1, 2, 3, 4, 5, 60, 98, 658 };

		for (int index = 0; index < arr.length; index++)

			if (arr[index] == check)

				k++;

		if (k == 1)

		{
			System.out.println("true");

		} else
			System.out.println("false");
		sc.close();
	}
}