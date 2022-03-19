package Stringss;

class Phone // Parent
{
	String str = "Andriod";
	String str1 = "IOS";
	String str2 = "";
}

class Andriod extends Phone // One child from parent
{
	void myAndriodPhone() {
		System.out.println(str.isEmpty());
		System.out.println(str.contains("iod"));
		System.out.println(str.contains("IOD"));
		System.out.println("======================");

	}
}

class IOS extends Phone // Second child from parent
{
	void myIosPhone() {
		System.out.println(str1.isEmpty());
		System.out.println(str1.contains("Iphone"));
		System.out.println(str2.isEmpty());

	}
}

public class Is_Empty_And_Contains_on_Hierarchical {
	public static void main(String[] args) {
		Andriod obj = new Andriod();
		obj.myAndriodPhone();
		IOS obj1 = new IOS();
		obj1.myIosPhone();

	}

}
