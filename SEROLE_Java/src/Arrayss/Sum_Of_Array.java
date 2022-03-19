package Arrayss;

public class Sum_Of_Array {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 20; i++) {
			int array[] = { i };
			for (int j = 0; j < array.length; j++)
				sum = sum + array[j];

			// System.out.print(array[j]+" ");
		}

		System.out.print(sum + " ");

	}
}
