package File_INPUT_OUTPUT;

import java.io.*;
import java.awt.*;
import java.util.*;

public class Own_Task_ {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welome to Java editor");
		System.out.println("Enter Your Directory name ");
		String dirname = sc.nextLine();
		// Creating Directory
		File obj = new File("C:\\Users\\Chayn\\Desktop\\FileOperations\\Java\\" + dirname);
		obj.mkdir();
		System.out.println(dirname + " Directory Created");
		System.out.println("Enter name of Your java");
		String filename = sc.nextLine();
		// Creating File
		File obj1 = new File(obj, filename);
		obj1.createNewFile();

		System.out.println(filename + " Created");
		// Writing to a file
		FileWriter obj2 = new FileWriter(obj1);
		System.out.println("Enter code");
		String code = sc.nextLine();

		obj2.write(code);
		System.out.println("Do you want to open file Yes or No :");
		String input = sc.nextLine();
		if (input.equals("Yes")) {
			System.out.println("Please wait " + filename + " is loading...");
			Thread.sleep(2000);
			// opening a file
			Desktop obj3 = Desktop.getDesktop();
			obj3.open(obj1);

		} else {
			System.out.println("Thankyou :-)");
		}
		obj2.close();
		sc.close();

	}

}
