package Stringss;
import java.util.*;
public class Length_Method__using_Scan {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your String to find length");
		String name=sc.nextLine();
		System.out.print(name.length());
		sc.close();
	}

}
