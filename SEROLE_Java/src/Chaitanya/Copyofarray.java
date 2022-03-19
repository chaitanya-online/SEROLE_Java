package Chaitanya;

public class Copyofarray {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {

			int arr1[] = { i };
			int arr2[] = new int[arr1.length];
			arr2 = arr1;
			for (int j = 0; j < arr1.length; j++)

				System.out.print(arr1[j] + " ");

			for (int k = 0; k < arr2.length; k++)

				System.out.println(arr2[k] + "  ");

		}
	}
}
