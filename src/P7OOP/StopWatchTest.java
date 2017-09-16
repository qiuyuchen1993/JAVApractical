package P7OOP;

import java.util.Arrays;

public class StopWatchTest
{
	public static void main(String[] args)
	{
		// Create an an array filled with integers
		int[] arr = createArray(100000);
		StopWatch a = new StopWatch();
		Arrays.sort(arr); // quicksort
		a.stop();
		System.out.println(a.getElapsedTime());

		arr = createArray(100000); // Create a new array
		a.start();
		Arrays.parallelSort(arr); // Sort the array using parallel sort
		a.stop();
		System.out.println(a.getElapsedTime()); // Print the elapsed time
	}

	// Returns an integer array with randomly generated elements in the range 0
	// to 999, inclusive
	public static int[] createArray(int length)
	{
		int[] arr = new int[length];

		for (int i = 0; i < arr.length; i++)
			arr[i] = (int) (Math.random() * 1000);

		return arr;
	}

}