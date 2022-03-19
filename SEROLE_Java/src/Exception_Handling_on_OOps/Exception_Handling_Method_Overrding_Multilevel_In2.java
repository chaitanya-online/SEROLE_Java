package Exception_Handling_on_OOps;

import java.util.*;

class Pen {// parent
	void m() {
		System.out.println("I am pen");
	}
}

class Cello extends Pen {// child
	void m() {
		System.out.println("i am Cello pen");
	}
}

class Reynolds extends Cello {// above child become parent
	void m() throws InputMismatchException {
		System.out.println("Enter your input");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		System.out.println(input);
		sc.close();
	}
}

public class Exception_Handling_Method_Overrding_Multilevel_In2 {
	public static void main(String[] args) {
		Reynolds obj = new Reynolds();
		try {
			obj.m();
		} catch (InputMismatchException e) {
			System.out.println(e);
		}

	}

}
