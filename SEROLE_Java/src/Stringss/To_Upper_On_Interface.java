package Stringss;

interface Upperr {
	String name = "serole";
String name1=new String("k h a m m a m");
	void display();
}

 class To_Upper_On_Interface implements Upperr {
public void display()
{
	System.out.println(name.toUpperCase());
	System.out.println(name1.toUpperCase());

}

public static void main(String[]args)
{
	To_Upper_On_Interface obj=new To_Upper_On_Interface();
	obj.display();
}
}
