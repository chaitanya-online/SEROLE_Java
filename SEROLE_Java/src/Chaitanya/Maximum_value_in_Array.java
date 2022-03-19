/* program to find max element in the list
 * if max element is at index 0 print that element array length of times
 * if  max element is at last index print that element array length of times
 * if max element is at middle print last element in array length of times
 */

package Chaitanya;

public class Maximum_value_in_Array {
	public static void main(String[] args) {

		int array[] = { 10, 20, 30, 40, 600 };
		int max = 100;
		int m = array.length - 1;

		for (int i = 0; i < array.length; i++)
			if (array[i] > max)
				max = array[i];
		System.out.println("Largest element in the array is:- " + max);

		if (max == array[0]) {
			for (int n = 0; n < array.length; n++)
				System.out.println(max);
		}

		else if (max == array[m]) {
			for (int i = 0; i < array.length; i++) {
				System.out.println(max);
			}
		}

		else {
			for (int i = 0; i < array.length; i++) {
				System.out.println(array[m]);
			}
		}

	}
}