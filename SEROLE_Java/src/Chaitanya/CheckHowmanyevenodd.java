package Chaitanya;

public class CheckHowmanyevenodd {
	public static void main(String[] args) {
		for (int i = 50; i <= 100; i++) {
			int array[] = { i };
			for (int j = 0; j < array.length; j++)
				
if(array[j]%2==0)
	{
				System.out.println(array[j]+" is Even number");}
else
{
	System.out.println(array[j]+" is Odd number");
}
			
			
		}
	}

}
