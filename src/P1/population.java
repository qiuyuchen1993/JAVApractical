package P1;

import java.util.Scanner;

class population
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number to calculate the population: ");
		int year = input.nextInt();
		int second = year * 365 * 24 * 60 * 60;
		int birth = second / 7;
		int death = second / 13;
		int immigrant = second / 45;
		int number = (int) (birth + immigrant - death);
		int newpopulaton = (int) (312032486 + number);
		System.out.println("New population is: " + newpopulaton);
		System.out.println("Birth: " + birth);
		System.out.println("Immigrant: " + immigrant);
		System.out.println("Death: " + death);
	}
}