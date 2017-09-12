package Sorting;

public class Sort_useing_comparable
{
	private Sort_useing_comparable()
	{
	}

	public static void sort(Comparable[] arr)
	{
		int n = arr.length;
		for (int i = 0; i < n; i++)
		{
			int minIndex = i;
			for (int j = i + 1; j < n; j++)

				if (arr[j].compareTo(arr[minIndex]) < 0)

					minIndex = j;

			swap(arr, i, minIndex);
		}
	}

	private static void swap(Object[] arr, int i, int j)
	{
		Object t = arr[i];
		arr[i] = arr[j];
		arr[j] = t;
	}

	public static void main(String[] args)
	{
		// test integer
		Integer[] a =
		{ 10, 9, 8, 12, 6, 5, 4, 3, 2, 1 };
		Sort_useing_comparable.sort(a);
		for (int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]);
			System.out.print(' ');
		}
		System.out.println();
		// test double
		Double[] b =
		{ 4.4, 3.3, 2.2, 1.1 };
		Sort_useing_comparable.sort(b);
		for (int i = 0; i < b.length; i++)
		{
			System.out.print(b[i]);
			System.out.print(' ');
		}
		System.out.println();
		// test string
		String[] c =
		{ "C", "B", "W" };
		Sort_useing_comparable.sort(c);
		for (int i = 0; i < c.length; i++)
		{
			System.out.print(c[i]);
			System.out.print(' ');
		}
		System.out.println();
	}

}