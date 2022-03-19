package Stringss;

public class Double_Equal_And_Dot_Equal {
	public static void main(String[] args) {
		String str = "chay";
		String str1 = str;
		System.out.println(str == str1);
		/*
		 * Here it returns true because for str already chay created with some address
		 * ex 101 in String constant pool and when str2 created as chay it again wont
		 * create the previous chay assigned to it for memory save and == used for
		 * reference address comparison
		 */
		String str2 = new String("chay");
		System.out.println(str == str2);
		/*
		 * Here it false because it create new object for chay the reason is we created
		 * using new keyword
		 */

	}

}
