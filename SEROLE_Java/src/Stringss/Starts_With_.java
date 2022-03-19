package Stringss;

public class Starts_With_ {
	public static void main(String[] args) {
		String str = "Chaitanya";
		String str1 = "Chaitany@";
		String str2 = "Chayit";
		System.out.println(str1.startsWith("C"));
		System.out.println(str1.startsWith("@", 8));
		System.out.println(str2.startsWith("y", 3));
		System.out.println(str1.startsWith("C", 0));
		System.out.println(str1.startsWith("c"));
		System.out.println(str1.startsWith("h", 2));
		System.out.println(str2.startsWith(""));
		System.out.println(str2.startsWith("Chayit"));

	}
}
