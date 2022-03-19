package OOPs;

class College {
	private int Rollno;
	private String CName;

	public int getRollno() {
		return Rollno;
	}

	public void setRollno(int rollno) {
		Rollno = rollno;
	}

	public String getCName() {
		return CName;
	}

	public void setCName(String cName) {
		CName = cName;
	}

}

class Student extends College {
	private int id;
	String SName;
	int Age;
	String Address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSName() {
		return SName;
	}

	public void setSName(String sName) {
		SName = sName;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}
}

public class Task {
	public static void main(String[] args) {
		Student obj = new Student();
		obj.setRollno(10);
		obj.setCName("MLR");
		obj.setId(1002);
		obj.setSName("Chay");
		obj.setAge(22);
		obj.setAddress("BCM");

		System.out.println("College id :-" + obj.getRollno() + " " + "College Name:-" + obj.getCName());
		System.out.println("Student id :-" + obj.getId() + " " + "Student Name:-" + obj.getSName());
		System.out.println("Student Age :-" + obj.getAge() + " " + "Student Address:-" + obj.getAddress());

	}
}
