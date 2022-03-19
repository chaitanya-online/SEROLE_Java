package OOPs;

/*class College3 {
	 int Cid;
	 String Cname;

	// constructor
	public College3(int cid, String cname) {
		super();
		Cid = cid;
		Cname = cname;
	}*/
//
 class Task3 extends College3 {
	int id;
	String SName;
	int Age;
	String Address;

	// constructor
	public  Task3(int cid, String cname, int id, String sName, int age, String address) {
		super(cid, cname);
		this.id = id;
		SName = sName;
		Age = age;
		Address = address;
	}

	public static void main(String[] args) {
		Task3 obj = new Task3(101, "MLRITM", 01, "VAMSHI", 22, "BCM");
		System.out.println("College id: " + " " + obj.Cid + " " + "College name : " + " " + obj.Cname);
		System.out.println("Student id : " + " " + obj.id + " " + "Student name :" + " " + obj.SName + " "
				+ "Student age : " + obj.Age + " " + "Student address :" + " " + obj.Address);
	}
}
