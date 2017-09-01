package P1;

import java.util.Scanner;

public class P1Q1
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in); // input open
		System.out.println("Please input radius");
		double radius = input.nextDouble(); // specify the type of input
		System.out.println("Please input length");
		double length = input.nextDouble(); // specify the type
		double area = Math.PI * Math.pow(radius, 2);
		double volume = area * length;
		System.out.println("The Area of cylinder is" + area);
		System.out.println("The Volume of cylinder is" + volume);
	}
}