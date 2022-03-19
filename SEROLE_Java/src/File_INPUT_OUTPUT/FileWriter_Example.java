package File_INPUT_OUTPUT;

import java.io.*;

public class FileWriter_Example {
	public static void main(String[] args) throws Exception {
		// FileWriter obj = new
		// FileWriter("C:\\\\Users\\\\Chayn\\\\Desktop\\\\FileOperations\\\\Data1.xls");
		FileWriter obj = new FileWriter("C:\\Users\\Chayn\\Desktop\\FileOperations\\Java\\Data1.xls");

		obj.write("Hai Chaitanya\tMurali");
		obj.write("\nBabu");

		obj.close();
		System.out.println("File Created at mentioned location");
	
	}

}

 //Note :-  /t which is used to print at next tab 
//          /n which is used to print at next line