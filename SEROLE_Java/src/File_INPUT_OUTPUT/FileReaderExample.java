package File_INPUT_OUTPUT;

import java.io.*;

public class FileReaderExample {
	public static void main(String[] args) throws Exception {
		FileReader obj = new FileReader("C:\\Users\\Chayn\\Desktop\\FileOperations\\Java\\InputStream.txt");
		int i;
		while ((i = obj.read()) != -1) {
			System.out.print((char) i);
		}

		obj.close();
	}

}
