package Stringss;

public class Equal_Ignore {
	public static void main(String[] args) {
		String s = "Snikee";
		String s1 = "SnikEE";
		String s2 = "SniEEe";

		System.out.println(s.equalsIgnoreCase(s1));
		System.out.println(s1.equalsIgnoreCase(s2));// it prints false becoz characters different
	}

}
