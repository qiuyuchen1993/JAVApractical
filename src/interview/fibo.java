package interview;

import java.util.Scanner;

public class fibo
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int a = input.nextInt();
		int i = 0;
		do
		{
			int min = fibo(i);
			i++;
		} while (fibo(i) < a);

		if (a - fibo(i - 1) < a - fibo(i))
		{
			System.out.print(fibo(i - 1));
		} else
		{
			System.out.print(fibo(i));
		}
	}

	public static int fibo(int a)
	{
		if (a == 0)
		{
			return 0;
		} else if (a == 1)
		{
			return 1;
		} else
		{
			return fibo(a - 1) + fibo(a - 2);
		}
	}

}