package Exception_Handling;

public class Finally_ {
	public static void main(String args[]) {
		try {
			System.out.println(100 / 0);
		} catch (ArithmeticException e) {
			System.out.println(e);
		} finally {
			System.out.println("Iam iam finally i excecute always");
		}
	}

}
// here exception is handled finally executed
