/* program to find out element for given index value in array*/

package Chaitanya;

import java.util.*;

public class A_to_Zar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter index to find element :");

		int input = sc.nextInt();

		char array[] = new char[26];
		for (int i = 0; i < 26; i++) {

			array[i] = (char) (i + 97);
		}

		System.out.println(array[input]);
		sc.close();
	}
}