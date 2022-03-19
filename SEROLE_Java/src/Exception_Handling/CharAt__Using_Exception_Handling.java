package Exception_Handling;

import java.util.*;

public class CharAt__Using_Exception_Handling {
	public static void main(String[] args) {
		String str = "Chay";
		System.out.println(str);
		System.out.println("Enter Index value to check particular Character");
		Scanner sc=new Scanner(System.in);
		try {
			int index=sc.nextInt();
			System.out.println(str.charAt(index));
		}
		catch (InputMismatchException e)
		{
			System.out.println(e);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
}

}
