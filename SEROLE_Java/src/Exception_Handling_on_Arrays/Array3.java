package Exception_Handling_on_Arrays;

public class Array3 {
	public static void main(String[] args) {
		String array[] = new String[5];
		array[0] = "Chaitanya";
		array[1] = "Murali";
		array[2] = "Babu";
		array[3] = "Nampalli";
		array[4] = "123456";
		try {
			for (int i = 0; i <=array.length; i++) {
				System.out.println(array[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println("Exception Occured");
	}

}
