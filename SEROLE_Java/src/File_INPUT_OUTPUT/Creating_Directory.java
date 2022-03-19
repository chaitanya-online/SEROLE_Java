package File_INPUT_OUTPUT;
import java.io.*;
public class Creating_Directory {
	public static void main(String[] args)throws Exception {
		File obj=new File("C:\\Users\\Chayn\\Desktop\\FileOperations\\Java\\New Directory");
		obj.mkdir();
		System.out.println("New Directory Created at mentioned path");
	}

}
