package Exception_Handling;

public class Finally_1 {
	public static void main(String[] args) {
		try {
			int[] a = { 10, 20 };
			System.out.println(a[3]);

		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (NullPointerException e) {
			System.out.println(e);
		} finally {
			System.out.println("Allways Executes");
		}
	}

}

// Exception not handled here but still finally block get executes
