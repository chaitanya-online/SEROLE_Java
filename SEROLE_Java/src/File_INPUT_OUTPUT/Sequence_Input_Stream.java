package File_INPUT_OUTPUT;

import java.io.*;

public class Sequence_Input_Stream {
	public static void main(String[] args) throws Exception {
		// Creation of First file
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Chayn\\Desktop\\FileOperations\\Java\\Sequence.txt");

		String name = "Hello ";
		byte array[] = name.getBytes();
		fos.write(array);

		// creation of Second file
		FileOutputStream fos1 = new FileOutputStream("C:\\Users\\Chayn\\Desktop\\FileOperations\\Java\\Sequence1.txt");
		String name1 = "Chaitanya";
		byte array1[] = name1.getBytes();
		fos.write(array1);

		// Reading both First and Second files at a time
		FileInputStream fis = new FileInputStream("C:\\Users\\Chayn\\Desktop\\FileOperations\\Java\\Sequence.txt");
		FileInputStream fis1 = new FileInputStream("C:\\Users\\Chayn\\Desktop\\FileOperations\\Java\\Sequence1.txt");

		SequenceInputStream obj3 = new SequenceInputStream(fis, fis1);

		System.out.println("Characters left before reading " + obj3.available());

		int i;
		while ((i = obj3.read()) != -1) {
			System.out.print((char) i);

		}
		System.out.print("\nCharacters left after reading " + obj3.available());

		fos.close();

		fos1.close();
		fis.close();
		fis1.close();

	}

}
