package Exception_Handling_on_Arrays;

import java.util.*;

public class Array2 {
	public static void main(String[] args) {
		char array[] = new char[26];
		for (int i = 0; i < 26; i++) {

			array[i] = (char) (i + 97);
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter index to find character");
		try {
			int input=sc.nextInt();
			System.out.println(array[input]);
		}
		catch(InputMismatchException e)
		{
			System.out.println(e);
		}
		catch(Exception e )
		{
			System.out.println(e);
		}

	}

}
