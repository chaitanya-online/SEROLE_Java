package File_INPUT_OUTPUT;

import java.io.*;

class FileOutputStreamExample {

	public static void main(String args[]) throws Exception {

		FileOutputStream object = new FileOutputStream("C:\\Users\\Chayn\\Desktop\\Data.xls");

		object.write(65);
		// it takes ascii value and write to data to file
		object.close();
		System.out.println("Done File Created Sucessfully at specified location");

	}
}

// Note :- FileOutputStream only accepts the primitive values like
// int,byte,short,long.float,double,boolean,char