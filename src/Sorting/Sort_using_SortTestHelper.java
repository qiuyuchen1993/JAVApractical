package Sorting;

public class Sort_using_SortTestHelper
{
	private Sort_using_SortTestHelper()
	{
	}

	public static void sort(Comparable[] arr)
	{
		int n = arr.length;
		for (int i = 0; i < n; i++)
		{
			int minIndex = i;
			for (int j = i + 1; j < n; j++)
				// use compareTo compare 2 Comparable
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
		int N = 20000;
		Integer[] arr = SortTestHelper.generateRandomArray(N, 0, 100000);
		Sort_using_SortTestHelper.sort(arr);
		SortTestHelper.printArray(arr);

		return;
	}

}