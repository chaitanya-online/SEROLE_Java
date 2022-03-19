package Exception_Handling;

public class Nested_Try_ {
	public static void main(String[] args) {
		try { // outer
			try {
				String str = null;
				System.out.println(str.length());
			} catch (NullPointerException e) {
				System.out.println(e);
			}
			try {
				int[] a = { 1, 2 };
				System.out.println(a[3]);
			} catch (ArithmeticException e) {
				System.out.println(e);
			}

		} // outer
		catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Hey program handled exception sucessfully");
	}

}
