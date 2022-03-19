package OOPs;

 class parent {
	 void display()
	 {
		 System.out.println("Hai");
	 }

}
 class Child extends parent
 {
	 void display()
	 {
		 System.out.print("Bye");
	 }
 }
 public class Method_Overriding{
	 public static  void main(String[]args)
	 {
		 Child obj=new Child();
		 obj.display();
	 }
 }
