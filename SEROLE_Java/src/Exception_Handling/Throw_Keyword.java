package Exception_Handling;

public class Throw_Keyword {
	public static void main(String[] args) {
		// System.out.println(50 / 0);

		// here exception raises internally the same thing we can do explicitly by user
		// using throw keyword
		try {
			throw new Exception("my own exception");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println(e.getMessage());
			// get message is used to print only message

		}

	}
}
