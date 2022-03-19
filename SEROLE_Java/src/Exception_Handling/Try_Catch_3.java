package Exception_Handling;

public class Try_Catch_3 {
	public static void main(String[] args) {
		try {
			System.out.println(10 / 0);
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("Number can't divide by zero");
			/* in catch block you can print custom message also and write logics too */
			for (int i = 0; i <= 5; i++) {
				System.out.println(i);

			}
			System.out.println("Hai there");

		}
	}

}
