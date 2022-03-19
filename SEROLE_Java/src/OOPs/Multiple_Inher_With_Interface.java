package OOPs;

interface cars {
	void type();
}

interface fuel {
	void run();

}

class Multiple_Inher_With_Interface implements cars, fuel {

	public void type() {
		System.out.println("Petrol");
	}

	public void run() {
		System.out.println("sedan");
	}

	public static void main(String[] args) {
		Multiple_Inher_With_Interface obj = new Multiple_Inher_With_Interface();
		obj.type();
		obj.run();
	}

}
