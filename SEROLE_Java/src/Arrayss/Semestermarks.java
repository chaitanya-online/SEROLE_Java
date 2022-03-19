package Arrayss;

import java.util.Scanner;

public class Semestermarks {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of semesters ");
		int no=sc.nextInt();
		int i;
		int noofsem[]=new int[no];
		for( i=0;i<noofsem.length;i++)
		{
			  System.out.println("Enter no of subjects in "+(i+1)+" semester:");
	            noofsem[i]=sc.nextInt();
	        }
	for (int ii=0;i<noofsem[0];ii++)
		System.out.println("Marks obtained in semester 1:");
		
		noofsem[0]=sc.nextInt();
		}
		
	}


