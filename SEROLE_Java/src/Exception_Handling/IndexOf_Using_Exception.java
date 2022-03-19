package Exception_Handling;

import java.util.*;

public class IndexOf_Using_Exception {

	public static void main(String[] args) {

		String str = "Chaitanya";
		System.out.println(str);
		System.out.println("Enter any single character to find index value");
		Scanner sc = new Scanner(System.in);
		try {
			char input = sc.next().charAt(0);
			System.out.println(str.indexOf(input));

		} catch (InputMismatchException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}
		sc.close();

	}

}
