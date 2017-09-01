package P1;

import java.util.Scanner;

public class tips
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in); // input open
		System.out.println("Please input the subtotal:");
		double subtotal = input.nextDouble();
		System.out.println("Please input the gratuity rate:");
		double rate = input.nextDouble();
		double gratuity = subtotal * rate;
		double total = subtotal + gratuity;
		System.out.println("The gratuity is" + gratuity);
		System.out.println("The total is" + total);
		input.close();
	}
}
