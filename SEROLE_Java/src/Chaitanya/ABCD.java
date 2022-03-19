
/*program to if any input character  is given to print next 3 characters*/

package Chaitanya;

import java.util.*;

public class ABCD {

	public static void main(String[] args) {
		System.out.println("Enter Character to print next 3 characters");
		Scanner sc = new Scanner(System.in);
		char input = sc.next().charAt(0);
		char array[] = new char[26];
		for (int i = 0; i <= 25; i++) {
			array[i] = (char) (i + 97);
		}

		// for(int index=0;index<array.length;index++)
		if (input == 'w') {
			System.out.println('w');
			System.out.println(array[23]);
			System.out.println(array[24]);
			System.out.println(array[25]);
		}

		if (input == 'x') {

			System.out.println('x');
			System.out.println(array[24]);
			System.out.println(array[25]);
			System.out.println(array[0]);
		}

		if (input == 'y') {

			System.out.println('y');
			System.out.println(array[25]);
			System.out.println(array[0]);
			System.out.println(array[1]);
		}
		if (input == 'z') {

			System.out.println('z');
			System.out.println(array[0]);
			System.out.println(array[1]);
			System.out.println(array[2]);
		}

		for (char a = 'a'; a <= 'v'; a++) {
			if (input == a) {
				char b = a;
				char c = (char) (b + 1);
				char d = (char) (c + 1);
				char e = (char) (d + 1);
				System.out.println(b);
				System.out.println(c);
				System.out.println(d);
				System.out.println(e);
				sc.close();

			}
		}

	}
}