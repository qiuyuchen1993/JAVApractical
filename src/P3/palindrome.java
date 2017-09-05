package P3;

import java.util.Scanner;

public class palindrome
{
	public static void main(String[] args)
	{
		// Read a letter
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a text: ");
		String text = input.nextLine();
		int a = text.length();
		if (a == 1)
		{
			System.out.println("The " + text + " is a palindrome!");
		} else
		{
			int c = a / 2;
			for (int b = 0; b < c; b++)
			{
				if (text.charAt(b) == text.charAt(a - b - 1))
				{
					System.out.println("This time is correct: " + text.charAt(b) + " and " + text.charAt(a - b - 1));
					if (b == c - 1)
					{
						System.out.println("This is a palindrome!");
					}
				} else
				{
					System.out.println("This is not palindrome!");
					break;
				}
			}

		}
	}
}