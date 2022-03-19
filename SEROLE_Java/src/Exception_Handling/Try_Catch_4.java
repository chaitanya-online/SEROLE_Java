package Exception_Handling;

public class Try_Catch_4 {
	public static void main(String[] args) throws Exception {
		try {
			System.out.println(50 / 0);
		} catch (Exception e) { // main catch
			System.out.println(e);
			System.out.println("Iam catch");

			try { // here with in catch another exception
				System.out.println(100 / 0);

			} catch (Exception ee) {
				System.out.println("Another exception");
			}
		} // main catch

	}
}
