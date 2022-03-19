package Chaitanya;

class Example

{

	public static void main(String[] args)

	{

		int m = 5;

		for (int i = 0; i < m; i++)

		{

			int n = 1;

			System.out.printf("%" + (m - i) * 2 + "s", "");

			for (int j = 0; j <= i; j++)

			{

				System.out.printf("%4d", n);

				n = n * (i - j) / (j + 1);

			}

			System.out.println("");

		}

	}

}