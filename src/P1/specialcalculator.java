package P1;

import java.util.Scanner;

class specialcalculator
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number to try:");
		double number = input.nextDouble();
		int number1 = (int) (number % 10);
		int number2 = (int) (number / 10) % 10;
		int number3 = (int) (number / 100) % 10;
		int total = number1 + number2 + number3;
		System.out.println("The total amount is :" + (number1 + number2 + number3));
		input.close();
	}
}