package Exception_Handling;

import java.util.*;

public class Exception_Handling_On_Substring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your String");
		String string = sc.nextLine();

		System.out.println("Enter input to find substring");
		try {
			int input = sc.nextInt();
			int input2 = sc.nextInt();
			System.out.println(string.substring(input, input2));
		} catch (InputMismatchException e) {
			System.out.println(e);

		} catch (Exception e) {
			System.out.println(e);
		}

		sc.close();

	}

}
