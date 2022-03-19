
/* program to if any character  is given in Serole to print RO*/

package Chaitanya;

import java.util.*;

public class Anyinput_printRO {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any single character in SEROLE");
		char input = sc.next().charAt(0);
		sc.close();
		char array[] = { 's', 'E', 'R', 'O', 'L', 'E' };
		for (int index = 0; index < array.length; index++) {
			if (input == array[index]) {
				System.out.println("RO");
				break;

			}
		}

	}
}
