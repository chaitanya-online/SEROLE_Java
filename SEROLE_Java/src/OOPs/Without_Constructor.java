package OOPs;

/*public class Without_Constructor {
	String name;
	int no;

	public static void main(String[] args) {
		Without_Constructor obj = new Without_Constructor();
		Without_Constructor obj2 = new Without_Constructor();
		System.out.println(obj.name + " " + obj.no);
		System.out.println(obj2.name + " " + obj.no);

	}
}*/
public class Without_Constructor {
	String name;
	int no;
//constructor
	public Without_Constructor(String name, int no) {
		super();
		this.name = name;
		this.no = no;
	}

	public static void main(String[] args) {
		Without_Constructor obj = new Without_Constructor("Chay", 101);
		Without_Constructor obj2 = new Without_Constructor("Murali", 102);
		System.out.println(obj.name + " " + obj.no);
		System.out.println(obj2.name + " " + obj.no);

	}
}
