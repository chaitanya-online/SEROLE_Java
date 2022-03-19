package OOPs;

interface Desgination {

	 void display(); }
	


class employee implements Desgination {
	public void display() {
		System.out.print("Please approve my designation");
	}
}

public class Interface_Example {
	public static void main(String[] args) {
		employee obj = new employee();
		obj.display();
	}
}