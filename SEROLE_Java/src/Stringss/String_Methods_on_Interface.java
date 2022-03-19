package Stringss;

interface a {
	String str = "Hai_Interface";

	void display();

}

class String_Methods_on_Interface implements a {

	public void display() {
		System.out.println(str.length());
		System.out.println(str.charAt(5));

		
	}
	public static void main(String[]args)
	{
		String_Methods_on_Interface obj=new String_Methods_on_Interface();
		obj.display();
		
	}

}