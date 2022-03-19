package Exception_Handling;

public class Class_Not_Found_Exception {
	public static void main(String[] args) {
		try {
			Class.forName("Class_Not_Found_Exception");

		} catch (ClassNotFoundException e)

		{
			System.out.println(e);

		}
	}

}
