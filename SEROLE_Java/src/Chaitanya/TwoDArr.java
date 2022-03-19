package Chaitanya;

public class TwoDArr {

	public static void main(String[] args) {
		int[][] arr = new int[3][3];

		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;

		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;

		for (int i = 0; i < arr[0].length; i++) {
			System.out.print(arr[0][i] + " ");
		}
		for (int j = 0; j < arr[1].length; j++) {
			System.out.print(arr[1][j] + " ");
		}

	}

}
