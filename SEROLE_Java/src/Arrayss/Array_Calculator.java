package Arrayss;

import java.util.Scanner;

public class Array_Calculator {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter type  of operator to do math");
		char input = sc.next().charAt(0);
		char input2 = input;
		System.out.println("Enter operand 1");
		int operand1 = sc.nextInt();
		System.out.println("Enter operand 2");
		int operand2 = sc.nextInt();
		int[] a = new int[150000];
		for (int i = 0; i < 150000; i++) {
			a[i] = i;
		}

		switch (input2) {
		case '*':

			System.out.print(a[operand1] * a[operand2]);
			break;

		case '/':

			System.out.print(a[operand1] / a[operand2]);
			break;

		case '+':

			System.out.print(a[operand1] + a[operand2]);
			break;

		case '-':

			System.out.print(a[operand1] - a[operand2]);
			break;
		case '%':

			System.out.print(a[operand1] % a[operand2]);
			break;

		default:
			System.out.println("wrong operand");
			sc.close();
		}
	}

}
