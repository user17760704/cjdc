
public class ForLoop
{

	public static void main(String[] args)
	{
	
		System.out.println("10000 at 2% interest: " + calculateInterest(10000, 2));
		System.out.println("10000 at 3% interest: " + calculateInterest(10000, 3));
		System.out.println("10000 at 4% interest: " + calculateInterest(10000, 4));
		System.out.println("10000 at 5% interest: " + calculateInterest(10000, 5));
		
		System.out.println("**************************\n");
		for (int i = 2; i <= 8; i++)
		{
			System.out.println("10000 at " + i + "% interest: " + calculateInterest(10000, i));
		}
	}
	
	public static double calculateInterest(double amount, double interestRate)
	{
		return (amount* (interestRate/100));
	}

}
