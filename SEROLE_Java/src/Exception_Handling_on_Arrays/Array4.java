package Exception_Handling_on_Arrays;

public class Array4 {
	public static void main(String[] args) {
		int array[] = { 10, 20, 30, 40 };

		try {
			System.out.println(array[1] / 0);

		} catch (ArithmeticException e) {
			System.out.println(e);
		}

		try {
			for (int i = 0; i <= array.length; i++) {
				System.out.println(array[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("Exception Occured");
		}
	}
}
