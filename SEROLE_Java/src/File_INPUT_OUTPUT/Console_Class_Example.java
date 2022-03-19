package File_INPUT_OUTPUT;

import java.io.*;

public class Console_Class_Example {

	public static void main(String[] args) {
		try {

			Console l = System.console();
			System.out.println("Enter Id");
			String name = l.readLine();
			System.out.println(name);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
