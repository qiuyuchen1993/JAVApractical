package P3;

import java.util.Scanner;

public class display
{
	public static void main(String[] args)
	{
		// Read a letter
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a text: ");
		String text = input.nextLine();
		int a = text.length();

		int c = 0;
		for (int b = 0; b < a; b++)
		{
			char letter = text.charAt(b);

			// Check that the input is either a lowercase or uppercase letter
			if (Character.isLowerCase(letter) || Character.isUpperCase(letter))
			{
				// Check if the letter is a vowel
				String vowels = "aeiouABIOU";
				if (vowels.indexOf(Character.toLowerCase(letter)) != -1)
				{
					c++;
				}
			}
		}
		// Display result
		System.out.println("There are " + c + " vowel in " + text);
		input.close();
	}

}
