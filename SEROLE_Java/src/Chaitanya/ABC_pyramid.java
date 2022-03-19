package Chaitanya;

public class ABC_pyramid {

	public static void main(String[] args) {
		char arr[] = new char[26];
		int k = 0;
		for (int a = 0; a <= 25; a++) {
			arr[a] = (char) (a + 97);
		}

		for (int line = 0; line <= 4; line++) {
			for (int space = 5; space >= line; space--) {
				System.out.print(" ");
			}
			for (int print = 0; print <= line; print++) {

				System.out.print(arr[k] + " ");
				k++;
			}
			System.out.println();
		}

	}
}