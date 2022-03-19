package Serialization_and_Deserialization;

import java.io.*;

class Bank implements Serializable {
	String Bankname = "HDFC";
	int ATM = 98741254;
	transient int pin = 1006;
	// After declaring as transient it wont be serialize and value becomes default
	// if variable is int it becomes 0 if variable is string it becomes null

}

public class Test2_With_transient {
	public static void main(String[] args) throws Exception {
		Bank b = new Bank();

		// Serialization
		FileOutputStream fos = new FileOutputStream("2.txt");
		// if the file is not there then JVM automatically creates using above line
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(b);
		oos.close();
		// Deserialization
		FileInputStream fis = new FileInputStream("2.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Bank b2 = (Bank) ois.readObject();
		System.out.println(
				"YourBank name " + b2.Bankname + " " + "Your ATM number " + b2.ATM + " " + "Pin number " + b2.pin);
		ois.close();

	}

}
