package Exception_Handling_on_OOps;

abstract class Bike
{
abstract void m1();	
}
class Triumph extends Bike{
	void m1()
	{
		try {
			System.out.println(100/0);
		}
		catch (Exception e)
		{
		System.out.println(e);	
		}
	}
}

public class Exception_Handling_On_Abstraction {
	public static void main(String[]args)
	{
		Triumph obj=new Triumph();
		obj.m1();
	}

}
