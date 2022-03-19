package Stringss;

public class Equal_Method {

	public static void main(String[] args) {
		String name = "Chaitanya";
		String name1 = "Chaitanya";
		String name2 = "Murali";
		String name3 = "ChaitanyA";
		System.out.println(name.equals(name1));
		System.out.println(name.equals(name3));
		System.out.println(name2.equals(name3)); // prints false becoz content and case not same

	}
}

/* note: when equals operator in use it checks both case and content in string*/