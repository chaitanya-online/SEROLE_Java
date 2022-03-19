package Arrayss;

import java.util.*;

public class Check_positive_Negative_in_Array {
	public static void main(String[] args) {
		int[] array = new int[5];
	System.out.println("Enter elements into the array");
	Scanner sc=new Scanner(System.in);
	
	for(int elements=0;elements<array.length;elements++) {
		array[elements]=sc.nextInt();
	}
	for(int index=0;index<array.length;index++) {
if(array[index]>=0)
{
	System.out.println("Positive value : "+array[index]+" ");
}
else
{
	System.out.println("Negative value : "+array[index]+" ");
}
sc.close();
	}

}}
