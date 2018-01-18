package interview;

import java.util.Scanner;

public class test
{

	public static int getlength(double[] arr) throws ArithmeticException
	{
		if (arr.length == 0)
		{
			throw new ArithmeticException("length is 0");
		} else
		{
			return arr.length;
		}
	}

	public static void main(String[] arg)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a int: ");
		int b = input.nextInt();
		double mylist[] = new double[b];

		try
		{
			int a = getlength(mylist);
			System.out.println(a);
			for (double x : mylist)
				System.out.println(x + " ");
		} catch (ArithmeticException ex)
		{
			System.out.println("zero");
		} finally
		{
			System.out.println(mylist.length);
		}

	}

}