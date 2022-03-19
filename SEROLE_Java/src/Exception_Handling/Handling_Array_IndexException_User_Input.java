package Exception_Handling;

import java.util.*;

public class Handling_Array_IndexException_User_Input {
	public static void main(String[] args) {

		int array[] = new int[20];
		for (int i = 0; i < array.length; i++) {
			array[i] = i + 1;
		}

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter index to find element :");

		try {
			int input = sc.nextInt();
			System.out.println(array[input]);
		} catch (InputMismatchException e) {
			System.out.println(e);
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}

		sc.close();
	}
}
