package Chaitanya;

public class Max_Value_in_Arr {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 8, 59, 92 };
		int max = 10;
		for (int i = 0; i < arr.length; i++)
			if (arr[i] > max)
				max = arr[i];
		System.out.println(max);
	}

}
