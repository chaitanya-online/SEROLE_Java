package File_INPUT_OUTPUT;

import java.io.*;

public class BufferedOutputStreamExample {
	public static void main(String[] args) throws Exception {

		FileOutputStream obj = new FileOutputStream("BufferedReaderExample.txt");
		BufferedOutputStream obj1 = new BufferedOutputStream(obj);
		String s = "Chaitanya";
		byte b[] = s.getBytes();
		obj1.write(b);
		System.out.println("File created");
		obj1.close();

		FileInputStream fis = new FileInputStream("BufferedReaderExample.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);

		int i = 0;
		i = bis.read();
		System.out.println((char) i);
		bis.close();

	}

}

// BufferedReaderStream uses buffer to store the data instead of streams.It is
// more efficient than write data into Stream