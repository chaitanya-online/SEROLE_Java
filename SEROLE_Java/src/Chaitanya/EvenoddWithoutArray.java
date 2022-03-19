package Chaitanya;

public class EvenoddWithoutArray {
	public static void main(String[] args) {
		int Even=0,Odd=0;
		for (int i = 50; i <= 100; i++) {
			if (i % 2 == 0) {
Even++;
				System.out.println(Even+")"+i+" Is Even number"); }
			
		}
		for (int j = 50; j <= 100; j++) {
			if (j % 2 != 0) {
				Odd++;
				System.out.println(Odd+")"+j+ " is Odd number");
			}
		}
	}
}
