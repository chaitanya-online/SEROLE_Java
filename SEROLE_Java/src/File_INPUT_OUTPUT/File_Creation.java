package File_INPUT_OUTPUT;

import java.io.*;
import java.nio.file.*;

public class File_Creation {
	public static void main(String[] args) throws Exception {
		// 1) Approach

		File f = new File("C:\\Users\\Chayn\\Desktop\\FileOperations\\Java\\File Creation 1.txt");
		System.out.println(f.exists());
		f.createNewFile(); // this is responsible for creation of file
		System.out.println(f.exists()); // this checks if file is created or not if created returns true else false
		System.out.println("Your file created at " + f.getPath() + " path");
		System.out.println(f.getParent()); // used to get the file directory
		// 2) Approach
		FileOutputStream obj2 = new FileOutputStream(
				"C:\\Users\\Chayn\\Desktop\\FileOperations\\Java\\File Creation 2.txt");
		System.out.println("By using FileOutputStream also create a file");
		obj2.close();
		// 3) Approach
		Path newFilePath = Paths.get("C:\\Users\\Chayn\\Desktop\\FileOperations\\Java\\File Creation 3.txt");
		Files.createFile(newFilePath);
		System.out.println(newFilePath.getParent()); // used to get the file directory

	}
}
