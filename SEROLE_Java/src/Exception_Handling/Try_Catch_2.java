package Exception_Handling;

public class Try_Catch_2 {
	public static void main(String[] args) {
		try {
			System.out.println(10 + 20);
			System.out.println("Hai");
			System.out.println(50 / 0);
			System.out.println("Hello"); /*
											 * here it wont gets print in try block because exception raising at above
											 * the line before the exception line are going to execute in try block
											 */

		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();

		}
	}

}
