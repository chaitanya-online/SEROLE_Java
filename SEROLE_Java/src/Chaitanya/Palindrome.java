package Chaitanya;

public class Palindrome {

	public static void main(String[] args) {
		for (int line = 0; line <= 4; line++) {
			for (int space = 5; space >= line; space--) {

				System.out.print(" ");
			}
			for (int k = 0; k <= line; k++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}