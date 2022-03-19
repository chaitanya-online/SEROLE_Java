package Exception_Handling;

public class Try_And_Catch_Keywords {
	public static void main(String[] args) {
		try {
			int a = 100 / 0;
			System.out.println(a);
		} catch (Exception e) {
			System.out.println(e); // here it handling the exception and executes the remaining code
			String a = "Hai";
			int b = 10 + 20;
			System.out.println(a);
			System.out.println(b);
			
		}
		
		}
	}


/*
 * The file named test.java not executing at all and stops flow of execution
 * Because it have exception to over come that we used try and catch in this
 * program to run code successfully
 */