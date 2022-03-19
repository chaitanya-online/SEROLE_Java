package Serialization_and_Deserialization;

import java.io.*;

class Bike implements Serializable {
	String model = "Interceptor 650";
	String company = "Royal Enfield";

}

public class Test {
	public static void main(String[] args) throws Exception {
		Bike b = new Bike();
		
		// Serialization
		FileOutputStream fos = new FileOutputStream("1.xls");
		// if the file is not there then JVM automatically creates using above line
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(b);
		oos.close();
// Deserialization
		FileInputStream fis = new FileInputStream("1.xls");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Bike b2 = (Bike) ois.readObject();
		System.out.println(b2.company + "  " + b2.model);
		ois.close();

	}

}
