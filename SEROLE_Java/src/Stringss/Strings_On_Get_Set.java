package Stringss;

class Parent {
	String str;
	String str2;
	String str3;

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public String getStr2() {
		return str2;
	}

	public void setStr2(String str2) {
		this.str2 = str2;
	}

	public String getStr3() {
		return str3;
	}

	public void setStr3(String str3) {
		this.str3 = str3;
	}

}

public class Strings_On_Get_Set {
	public static void main(String[] args) {
		Parent obj = new Parent();
		obj.setStr("Chaitanya");
		obj.setStr2("Nampalli");

		System.out.println(obj.getStr().length());
		System.out.println(obj.getStr2().charAt(2));
		System.out.println(obj.getStr2().trim());
		System.out.println(obj.getStr2().indexOf('a'));

	}

}
