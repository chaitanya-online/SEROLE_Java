package File_INPUT_OUTPUT;

import java.io.*;

public class Renaming_File {
	public static void main(String[] args) throws Exception {
		File f = new File("C:\\Users\\Chayn\\Desktop\\FileOperations\\Fil.txt");
		File f1 = new File("C:\\Users\\Chayn\\Desktop\\FileOperations\\File.txt");
		System.out.println(f.exists());

		f.renameTo(f1);

		f.createNewFile();
		System.out.println("Name Changed to " + f.getName());

	}
}
