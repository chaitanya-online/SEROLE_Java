package Chaitanya;

public class EvenoddWithArray {
	public static void main(String[] args) {
		for (int i = 50; i <= 100; i++) {
			int a[] = { i };
			for (int j = 0; j < a.length; j++)
				if(a[j]%2==0)
				System.out.println(a[j]+ " Even number");
				else
				{
					System.out.println(a[j]+" Odd numbers");
				}
		}

	}

}