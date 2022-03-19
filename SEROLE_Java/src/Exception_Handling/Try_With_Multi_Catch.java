package Exception_Handling;

public class Try_With_Multi_Catch {
	public static void main(String[] args) {
		try {
			/*
			 * int a=10/0; System.out.println(a);
			 */
			/*
			 * int array[]= {1}; System.out.println(array[1]);
			 */
			String str = null;
			System.out.println(str.length());

		} catch (ArithmeticException e) {
			System.out.println(e);
			System.out.println("Exception handled at catch 1");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println("Prent exception class");
			System.out.println(e);
		}
		System.out.println("Rest of logic");
	}

}
