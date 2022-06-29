import java.util.Scanner;
public class Project4 
{

	public static void main(String[] args) 
	{
		// Set variables
		int sum = 0;
		String response;
		
		Scanner keyboard = new Scanner(System.in);
		
		
		// Get input from user
		// If user response with yes to question, then add 1 to the variable sum. This for three questions. 
		System.out.println("I am loosing my sense of humor.");
		response = keyboard.nextLine();
		
		
		if (response.equalsIgnoreCase("yes"))
		{
			sum = sum + 1;
		}
		
		
		System.out.println("I find it more and more difficult to see people socially.");
		response = keyboard.nextLine();
		if (response.equalsIgnoreCase("yes"))
		{
			sum = sum + 1;
		}
		
		
		System.out.println("I feel tired most of the time.");
		response = keyboard.nextLine();
		if (response.equalsIgnoreCase("yes"))
		{
			sum = sum + 1;
		}
		
		
		// Analyze the user input
		// Print expected diagnosis 
		if (sum == 0)
		{
			System.out.println("You are more exhausted than stressed out");
		}
		else if (sum == 1)
		{
			System.out.println("You are beginning to stress out");
		}
		else if (sum == 2)
		{
			System.out.println("You are possibly stressed out");
		}
		else if (sum == 3)
		{
			System.out.println("You are probably stressed out");
		}
	}

}
