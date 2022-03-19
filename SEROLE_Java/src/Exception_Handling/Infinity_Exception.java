package Exception_Handling;

public class Infinity_Exception {
	public static void main(String[] args) {
		int a=20;
		double b=20;
		float c=20;
		
		System.out.println(b/0); //prints infinity because it uses floating point arithmetic algorithm
		System.out.println(c/0); 
		System.out.println(a/0);
	}

}
