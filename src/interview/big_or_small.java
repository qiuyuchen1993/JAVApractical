package interview;

import java.util.Arrays;

public class big_or_small
{
	public static void main(String[] args)
	{
		int[] a =
		{ 1, 6 };
		System.out.print(Arrays.toString(compare(a)));

	}

	public static int[] compare(int[] a)
	{
		if (a.length == 0 || a.length == 1 || a.length == 2)
		{
			return a;
		} else
		{
			for (int i = 1; i < a.length - 1; i++)
			{
				if (a[i] > a[i - 1] & a[i] > a[i + 1])
				{
					a[i] = a[i] - 1;
				} else if (a[i] < a[i - 1] & a[i] < a[i + 1])
				{
					a[i] = a[i] + 1;
				}
			}
			return a;
		}
	}

}