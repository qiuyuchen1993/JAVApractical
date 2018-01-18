package Variance;

public class variance
{
	public static void main(String arg[])
	{
		double[] mylist =
		{ 3, 4, 4, 5, 6, 8 };
		double square_variance = (sum(newlist(mylist)) / mylist.length) - Math.pow((sum(mylist) / mylist.length), 2);
		double variance = Math.sqrt(square_variance);
		System.out.println(variance);
	}

	public static double sum(double[] mylist)
	{
		double number = 0;
		for (int i = 0; i < mylist.length; i++)
		{
			number += mylist[i];
		}
		return number;
	}

	public static double[] newlist(double[] mylist)
	{
		double[] newlist = new double[mylist.length];
		for (int i = 0; i < mylist.length; i++)
		{
			newlist[i] = Math.pow(mylist[i], 2);
		}
		return newlist;
	}
}
