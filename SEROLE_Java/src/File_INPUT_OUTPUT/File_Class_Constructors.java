package File_INPUT_OUTPUT;

import java.io.*;

public class File_Class_Constructors {

	public static void main(String[] args) throws Exception {

		// 1) Constructor
		File obj = new File("Hai.txt"); // it creates file at current working directory
		obj.createNewFile();

		System.out.println(obj.getPath());// it prints path of file
		System.out.println(obj.getParent());
		// 2) Constructor
		File obj1 = new File("D:\\Java IO"); // it creates directory at D location
		obj1.mkdir();
		System.out.println(obj1.getPath());
		System.out.println(obj1.isDirectory()); // it is used to check it is directory or not
		// 3) Constructor
		File obj2 = new File(obj1, "Test.txt"); // it creates file at reference directory or you can mention directory
		obj2.createNewFile();

		System.out.println(obj2.getPath());
		System.out.println(obj2.isFile());// returns true if it is file else prints false

		// System.out.println(obj2.getFreeSpace());

	}

}
