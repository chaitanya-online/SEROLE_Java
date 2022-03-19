package Arrayss;

// find min and max then sum both min and max values
import java.util.Scanner;

public class Hemanth_Exam {
	// public static void main(String[] args) {
	// Scanner sc = new Scanner(System.in);
	//
	// int size = sc.nextInt();
	// int array[] = new int[size];
	//
	// for (int elements = 0; elements < array.length; elements++) {
	// array[elements] = sc.nextInt();
	// }
	//
	// int i;
	// int max = array[0];
	// for (i = 1; i < array.length; i++)
	// if (array[i] > max)
	// max = array[i];
	//
	// int j;
	// int min = array[0];
	// for (i = 1; i < array.length; i++)
	// if (array[i] < min)
	// min = array[i];
	// System.out.println(min + max);
	// //
	//
	// }
	// }

	static final int MAX_CHAR = 256;

	static void getOccuringChar(String str) {

		int count[] = new int[MAX_CHAR];

		int len = str.length();

		for (int i = 0; i < len; i++)
			count[str.charAt(i)]++;

		char ch[] = new char[str.length()];
		for (int i = 0; i < len; i++) {
			ch[i] = str.charAt(i);
			int find = 0;
			for (int j = 0; j <= i; j++) {

				if (str.charAt(i) == ch[j])
					find++;
			}

			if (find == 1)
				System.out.println(str.charAt(i) + "" + count[str.charAt(i)]);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str = str1;
		getOccuringChar(str);
	}
}