import java.util.*;

public class Gabdrakhmanova_CuttingTheCord 
{
	/*
	 * AP Prog 2 Renata Gabdrakhmanova
	 * 
	 * Cutting the Cord- Finding the right streaming service based on the input
	 * preferences.
	 */

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);

		// Asks for user input and records the answers
		System.out.print("Do you want to pay less than $9 a month?");
		String payment = keyboard.nextLine();

		System.out.println("What genre do you prefer?");
		String genre = keyboard.nextLine();

		System.out.println("Do you prefer family friendly content?");
		String familyFriendly = keyboard.nextLine();
		keyboard.close();

		// Sorts out the inputed information by if statements and when sorted saves which streaming service should be used
		String StreamService = "";

		if (payment.equals("Yes")) 
		{

			if (genre.equals("Animated")) 
			{

				if (familyFriendly.equals("No")) 
				{
					StreamService = "Churchy Roll";
				} 
				else if (familyFriendly.equals("Yes")) 
				{
					StreamService = "Disney Plus";
				}
			} 
			
			else if (genre.equals("Sports"))
			{

				if (familyFriendly.equals("No")) 
				{
					StreamService = "WEE Network";
				} 
				else if (familyFriendly.equals("Yes")) 
				{
					StreamService = "ESPN Plus";
				}
			}
		}

		else if (payment.equals("No")) 
		{

			if (genre.equals("Drama")) 
			{

				if (familyFriendly.equals("No")) 
				{
					StreamService = "Netflix";
				} 
				else if (familyFriendly.equals("Yes")) 
				{
					StreamService = "Hulu";
				}
			}
		}
		
		System.out.println("You should subscribe to the " + StreamService + " service.");

	}
}
