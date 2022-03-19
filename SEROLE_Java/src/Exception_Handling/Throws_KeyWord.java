package Exception_Handling;

class My {
	void display() throws ArithmeticException, Exception {
		try {
			// System.out.println(10 / 0);
			String str = null;
			System.out.println(str.length());
		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);

		}

	}
}

public class Throws_KeyWord {
	public static void main(String[] args) throws ArithmeticException, Exception {
		My obj = new My();
		obj.display();

	}

}
