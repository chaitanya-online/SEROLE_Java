package OOPs;

class Parameterized_Constructor {
	int Cid;
	String Cname;

	 Parameterized_Constructor(int cid, String cname) {
		
		this.Cid = cid;
		this.Cname = cname;
	}

	@Override
	public String toString() {
		return  Cid + " " + Cname
				;
	}

	/*void display() {
		System.out.println(Cid + " " + Cname);
	}*/

	public static void main(String[] args) {
		Parameterized_Constructor obj = new Parameterized_Constructor(101, "MLRITM");
System.out.println(obj);
		//obj.display();
		

	}
}