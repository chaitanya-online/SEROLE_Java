package Stringss;

import java.util.Scanner;

interface Upper {

void display();
}


 class To_Upper_On_Interface_Scanner implements Upper{
	 public void display()
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter Your String");
		 String input=sc.nextLine();
		 
		 System.out.println(input.toUpperCase());
		 sc.close();
	 }
	
		 public static void main(String[]args)
		 {
			 To_Upper_On_Interface_Scanner obj=new To_Upper_On_Interface_Scanner();
			 obj.display();
		 }
	 }


