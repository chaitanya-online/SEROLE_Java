package Chaitanya;

public class SwappingArray {
	public static void main(String[] args) {

		int a[] = { 10, 20, 30, 40 };
		int temp;
		for (int j = 0; j < a.length; j = j + 2) {
			temp = a[0]; // assigning a[0] element to b
			a[j] = a[j + 1]; // assigning index value a [1] to a[0]
			a[j + 1] = temp; // assigning index b value to a [0]

		}

		for (int k = 0; k < a.length; k++)

			System.out.print(a[k] + " ");

	}
}
