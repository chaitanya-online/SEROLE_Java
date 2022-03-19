package Serialization_and_Deserialization;

import java.io.*;

class Laptop implements Serializable {
	String brand = "Apple";
	String model = "Mac Book pro 2021";
	double cost = 393512.000;
}

class Apple extends Laptop {
	String os = "MAC";
	transient String Serialnumber = "48757APRTR22ET5FGS";
}

public class Test_With_Inheritance {
	public static void main(String[] args) throws Exception {
		Apple obj = new Apple();
		// Serialization
		FileOutputStream fos = new FileOutputStream("Laptop.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obj);
		oos.close();
		// DeSerialization
		FileInputStream fis = new FileInputStream("Laptop.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Apple obj2 = (Apple) ois.readObject();
		ois.close();
		System.out.println(Thread.currentThread().getName().toUpperCase());
		System.out.println("Branad: " + obj2.brand + "," + " Model Name: " + obj2.model + "," + " Cost " + obj2.cost);
		System.out.println("Loading PleaseWait...");

		for (byte i = 5; i >= 1; i--) {
			Thread.sleep(1000);
			System.out.println(i);
		}
		System.out.println("Os type: " + obj2.os + "," + "SerialNumber: " + obj2.Serialnumber);

	}

}
