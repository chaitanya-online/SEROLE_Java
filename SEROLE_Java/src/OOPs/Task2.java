package OOPs;

class College2 {
	int Cid = 289;
	String Cname = "DPREC";

}

class Student2 extends College2 {
	int Srollno = 01;
	String Sname = "Murali";
	String Saddress = "Khammam";
	String Sgender = "Male";
	int Sage = 22;

}

public class Task2 {
	public static void main(String[] args) {
		Student2 obj = new Student2();
		System.out.println("College id :-" + obj.Cid + " " + "College Name:-" + obj.Cname);
		System.out.println("Student rollno : " + obj.Srollno + " " + "Student Name :-" + obj.Sname);
		System.out.println("Address :- " + obj.Saddress + " " + "Gender :-" + obj.Sgender);
	}
}
