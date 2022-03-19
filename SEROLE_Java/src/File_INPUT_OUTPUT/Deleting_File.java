package File_INPUT_OUTPUT;

import java.io.*;
import java.util.*;

public class Deleting_File {
	public static void main(String[] args) throws Exception {

		File l = new File("Deleting.txt"); // creating file at current working directory
		l.createNewFile();
		System.out.println("File created");
		Thread.sleep(10000); // after some amount of time file goes to delete
		l.delete();
		System.out.println("File deleted");

	}
}
