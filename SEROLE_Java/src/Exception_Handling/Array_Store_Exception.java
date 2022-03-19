package Exception_Handling;

public class Array_Store_Exception {
	public static void main(String[] args) {
		try {
			Object x[] = new String[3];
			x[0] = new Integer(2);
			System.out.println(x[0]);
		} catch (ArrayStoreException e) {
			System.out.println(e);
		}

	}

}
/*
 * when trying to store wrong type of object into array type object it throws
 * ArrayStoreException
 */