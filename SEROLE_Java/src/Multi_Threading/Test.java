package Multi_Threading;

public class Test {
 int addition()
{
	int a=10,b=20,z=a+b;
	return z;
	
}
 public static void main(String[] args) {
	Test t=new Test();
	int addition =t.addition();
	System.out.println(addition);
}
}
