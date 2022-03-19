package Chaitanya;

import java.util.Scanner;
import java.util.*;

public class Atm {
	public static void main(String[] args) {
		Double Balance = 1000.00;
		int Deposit, Withdrawl, P;
		Calendar cal = Calendar.getInstance();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your pin");
		P = sc.nextInt();
		if (P == 1006) {
			System.out.println("Login Sucessfully at: " + cal.get(Calendar.HOUR) + ":" + cal.get(Calendar.MINUTE) + ":"
					+ cal.get(Calendar.MILLISECOND));
		} else {
			System.out.println("Incorrect pin");
			System.exit(1);
		}

		while (true) {
			System.out.println("Welcome to JAVA BANK");
			System.out.println("");
			System.out.println("Choose 1 for withdrawl");
			System.out.println("");
			System.out.println("Choose 2 for Deposit");
			System.out.println("");
			System.out.println("Choose 3 for Check balance");
			System.out.println("");
			System.out.println("Choose 4 for Bank details");
			System.out.println("");
			System.out.println("Choose 5 for Logout");
			System.out.println("");

			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter money to withdrawl");
				Withdrawl = sc.nextInt();
				if (Balance >= Withdrawl) {
					Balance = Balance - Withdrawl;
					System.out.println("Collect your money");
				} else {
					System.out.println("Not enough money");
				}
				break;
			case 2:
				System.out.println("Enter money to deposit");
				Deposit = sc.nextInt();
				Balance = Balance + Deposit;
				System.out.println("Money deposited sucessfully");
				System.out.println("Total updated balance is :" + Balance);
				break;
			case 3:
				System.out.println("Total balance is:" + Balance);
				break;
			case 4:
				System.out.println("Ac Holder name : Nampalli ChaitanyaMurali Babu");
				System.out.println("Ac Number 918790295184 , IFSC:IFSC0123456");
				System.out.println("Age : 21 ,Address: Bcm");
				System.out.println("Gender: Male");
				System.out.println("PanNumber:BLKPN3751R");
				break;
			case 5:
				System.out.println("Logout Sucessfully at: " + cal.get(Calendar.HOUR) + ":" + cal.get(Calendar.MINUTE)
						+ ":" + cal.get(Calendar.MILLISECOND));
				System.exit(0);

			}
		}
	}
}
