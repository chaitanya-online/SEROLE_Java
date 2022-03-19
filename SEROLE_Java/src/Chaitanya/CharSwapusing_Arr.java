package Chaitanya;

public class CharSwapusing_Arr {

	public static void main(String[] args) {
		char a[] = { 'C', 'H','A','Y' };
		char temp;
		for (int j = 0; j < a.length; j = j + 2) {
			temp = a[0];
			a[j] = a[j + 1];
			a[j + 1] = temp; 

		}

		for (int k = 0; k < a.length; k++)

			System.out.print(a[k] + " ");

	}
}
