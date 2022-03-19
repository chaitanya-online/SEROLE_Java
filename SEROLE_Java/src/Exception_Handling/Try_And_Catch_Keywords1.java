package Exception_Handling;

public class Try_And_Catch_Keywords1 {
	public static void main(String[] args) {
		try {
			String str = null;

			System.out.println(str.length());

		} catch (NullPointerException e) {
			System.out.println(e);
		}
	}
}
