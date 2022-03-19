package File_INPUT_OUTPUT;

import java.io.*;

public class Excercise_On_File_InputStream {
	public static void main(String[] args) throws Exception {
		int i = 0;

		FileInputStream fis = new FileInputStream("C:\\Users\\Chayn\\Desktop\\FileOperations\\Java\\Java_Team.xls");
		while ((i = fis.read()) != -1) {
			System.out.print((char) i + "");

		}
		fis.close();

	}
}
