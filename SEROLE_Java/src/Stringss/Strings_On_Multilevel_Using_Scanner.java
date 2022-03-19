package Stringss;

import java.util.Scanner;

class Baby { // Parent class
	String Str;
	String Str1;
	String str2;
}

class Boy extends Baby { // Child
	void boy() {
		System.out.println("Enter Your String");
		Scanner sc = new Scanner(System.in);
		Str = sc.nextLine();
		System.out.println(Str.length());
		System.out.println(Str.isEmpty());
		System.out.println(Str.charAt(2));
		System.out.println(Str.trim());

	}
}

class Men extends Boy { // child become parent
	void men() {
		System.out.println("Enter Your String");
		Scanner sc = new Scanner(System.in);

		Str1 = sc.nextLine();
		System.out.println(Str1.contains("ab"));
		System.out.println(Str1.toLowerCase());
		sc.close();
	}
}

public class Strings_On_Multilevel_Using_Scanner {
	public static void main(String[] args) {
		Boy obj = new Boy();
		obj.boy();
		Men obj1 = new Men();
		obj1.men();
	}

}
