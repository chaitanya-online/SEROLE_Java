package File_INPUT_OUTPUT;

import java.io.*;

public class File_Input_Stream {
	public static void main(String[] args) throws Exception {
		FileInputStream obj = new FileInputStream("C:\\Users\\Chayn\\Desktop\\FileOperations\\Java\\InputStream.txt");
		System.out.print("1 File:)");
		// System.out.println(obj.available());
		int i = 0;

		// if you want to read whole text form file use this formula
		while ((i = obj.read()) != -1) {
			System.out.print((char) i + "");

		}
		obj.close();

		FileInputStream obj1 = new FileInputStream("C:\\Users\\Chayn\\Desktop\\FileOperations\\Java\\InputStream1.txt");

		int j = 0;
		j = obj1.read();
		System.out.print(" 2)" + (char) j);
		obj1.close();
	}
}
// FileInputStream which is used to read the data from the file