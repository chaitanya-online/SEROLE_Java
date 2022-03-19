package Exception_Handling;

import java.util.*;

public class WaterCan_Using_Throw {
	public static void main(String[] args) {
		int people = 100;

		System.out.println("Enter Token to check avail to drink water or not");
		Scanner sc = new Scanner(System.in);
		int input = 0;

		try {
			input = sc.nextInt();

			sc.close();
		} catch (InputMismatchException e) {
			System.out.println(e);
			return;

		}
		if (input <= people && input >= 0) {
			System.out.println("Drink 1 ltr Water");
			System.out.println("Available ");
			System.out.println(people - input + " Ltr" + "s");
		} else {
			try {
				throw new Exception("Not enough water to drink");
			} catch (Exception e) {
				// System.out.println(e);

				System.out.println(e.getMessage());
			}
		}

	}

}
