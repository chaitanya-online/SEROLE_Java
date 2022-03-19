package File_INPUT_OUTPUT;

import java.io.*;

public class Excersise_On_File_Writer {

	public static void main(String[] args) throws Exception {
		FileWriter obj = new FileWriter("C:\\Users\\Chayn\\Desktop\\FileOperations\\Java\\Java_Team.xls");
		obj.write("Resource Id\tResource Name\tGender\tAge\n");
		obj.write("SE101\tAmthul Saba\tFemale\t21\n");
		obj.write("SE102\tChaitanya\tMale\t22\n");
		obj.write("SE103\tJaya Surya\tMale\t22\n");
		obj.write("SE104\tMounica\tFeMale\t26\n");
		obj.write("SE105\tRachana\tFeMale\t22\n");
		obj.write("SE106\tNavya\tFeMale\t22\n");
		obj.write("SE107\tSrikanth\tMale\t24\n");

		obj.close();
		System.out.println("File Created Sucessfully");
	

	}

}
