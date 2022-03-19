package Serialization_and_Deserialization;

import java.io.*;

class a implements Serializable {
	String bookname;
	int pages;
	String size;
	transient String company;

	public a(String bookname, int pages, String size, String company) {
		this.bookname = bookname;
		this.pages = pages;
		this.size = size;
		this.company = company;
	}
}

class B2 extends a {

	public B2(String bookname, int pages, String size, String company) {
		super(bookname, pages, size, company);
		// TODO Auto-generated constructor stub
	}

}

public class Test_3_With_Constructor {
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		B2 h = new B2("drawing book", 200, "A4", "classamte");
		FileOutputStream one = new FileOutputStream("2.txt");
		ObjectOutputStream two = new ObjectOutputStream(one);
		two.writeObject(h);
		System.out.println("sucessfully entered the values");
		two.close();
		FileInputStream three = new FileInputStream("2.txt");
		ObjectInputStream foure = new ObjectInputStream(three);
		B2 obj = (B2) foure.readObject();
		System.out.println(obj.bookname);
		System.out.println(obj.pages);
	}
}
