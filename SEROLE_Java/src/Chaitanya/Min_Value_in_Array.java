package Chaitanya;

public class Min_Value_in_Array {
	public static void main(String args[]) {
		int arr[] = { 12, 12, 20, 30, -22, 0 };

		int min = 1;
		for (int i = 0; i < arr.length; i++)
			if (arr[i] < min)
				min = arr[i];
		System.out.println(min);
	}

}
