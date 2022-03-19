package Exception_Handling;

import java.util.*;

class Throw_1 {
	public static void main(String[] args) throws Exception  {
		int Balance = 15000;
		int Withdrawl = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Money to Withdrawl :- ");

		try {
			Withdrawl = sc.nextInt();
		}

		catch (InputMismatchException e) {
			System.out.println(e);
		}

		if (Withdrawl <= Balance) {

			System.out.println(Withdrawl);
		} else {
			throw new Exception("Not enough balance to Withdrawl");
		}

	}
}
