package Arrayss;

import java.util.Scanner;

public class Course_Avail_or_Not {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k=0;
		System.out.println("Ener the no of courses");
		int courses = sc.nextInt();
		System.out.print("Enter " + courses + " Courses");
		String array[] = new String[courses];
		for (int index = 0; index < array.length; index++) {
			array[index] = sc.next();

		}
		System.out.print("Enter course to be search :- ");
		String course = sc.next();
		for (int i = 0; i < array.length; i++) 
			if (array[i] .equals(course))
				k++;
		
		if(k==1) {
				System.out.print(course+" Availabale");}
			else {
				System.out.println(course+" Not available");
			}

	sc.close();
}}
