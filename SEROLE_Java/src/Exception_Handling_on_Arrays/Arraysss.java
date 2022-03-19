package Exception_Handling_on_Arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Arraysss {
	public static void main(String[] args) {
		int array[] = new int[20];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter index value");
		
		for (int i = 0; i < array.length; i++) {
			array[i] = i + 1;
		}
		try {
			int input=sc.nextInt();
			System.out.println(array[input]);
		}
		catch(InputMismatchException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
