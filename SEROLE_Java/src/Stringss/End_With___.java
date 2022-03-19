package Stringss;

public class End_With___ {
public static void main(String[]args)
{
	String name="Chaitanya";
	String name1="Nampalli";
	System.out.println(name.endsWith("a"));
	System.out.println(name.endsWith("ya"));
	System.out.println(name1.endsWith(""));
	System.out.println(name1.endsWith("LLI"));
	System.out.println(name1.endsWith("Nampalli"));

	if(name.endsWith("ya"))
	{
		System.out.println("Yes "+name+" Ends with ya ");
	}
	else
	{
		System.out.print(name+ " Not ends with ya");
	}



	
}
}
