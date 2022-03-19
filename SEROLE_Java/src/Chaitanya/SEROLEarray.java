package Chaitanya;

public class SEROLEarray {
	public static void main(String[] args) {
		char a[] = { 'S', 'E', 'R', 'O', 'L', 'E' };
		for (int i = 5; i >= 0; i--) {
			for (int j = 0; j <= i; j++)
				System.out.print(a[j]);
			if (i == 2) {
				System.out.print(" This is company");
			}

			System.out.println();
		}

	}
}
