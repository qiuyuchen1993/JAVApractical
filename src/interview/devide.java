package interview;

public class devide
{

	public static int divide1(int n1, int n2)
	{
		if (n2 == 0)
		{
			throw new ArithmeticException("Divisor cannot be zero");
		}

		int a = n1 / n2;
		return a;
	}

	public static void main(String[] args)
	{
		int x = 1;
		int y = 1;
		try
		{
			int result = divide1(x, y);
			System.out.println("result: " + result);
		} catch (ArithmeticException ex)
		{
			System.out.println("Exception: integer division by zero");
		}
	}
}