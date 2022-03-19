package File_INPUT_OUTPUT;

import java.io.*;
import java.awt.*;

public class To_OpenFile {
	public static void main(String[] args) throws Exception {
		File l = new File("C:\\Users\\Chayn\\Desktop\\FileOperations\\Java\\Open.xls");
		l.createNewFile();
		FileWriter ll = new FileWriter(l);
		ll.write("Hai Chaitanya");
		Desktop obj = Desktop.getDesktop();
				obj.open(l);
				ll.close();
	}

}
