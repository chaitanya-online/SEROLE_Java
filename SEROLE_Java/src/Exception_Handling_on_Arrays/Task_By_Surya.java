package Exception_Handling_on_Arrays;

public class Task_By_Surya {
	public static void main(String[] args) {
		int[] a = new int[5];
		a[0] = 10;
		a[1] = 20;
		try {
			a[7] = 100;
		} catch (Exception e) {
			System.out.println(e);
		}

		a[2] = 30;
		a[3] = 40;
		try {
			a[8] = 10;
		} catch (Exception e) {
			System.out.println(e);
		}

		a[4] = 50;
		 for(int i:a){    // for each loop
		     System.out.println(i);  
		}

	}

}
