import java.util.Scanner;

public class GetDetails
{
	public static void getVehicleDetails(Vehicle v) throws Exception
	{
		Scanner input = new Scanner(System.in);
		double price, fuelEfficiency;
		String transmissionType = null, gtVersion;
		boolean hasSunRoof = false,
				isConvertible = false;
		
		System.out.println("Enter the price of the vehicle: ");
		price = input.nextDouble();
		System.out.println("Enter the fuel efficiency of the vehicle: ");
		fuelEfficiency = input.nextDouble();
		System.out.println("Enter transmission type: ");
		transmissionType = input.next();
		while (InputValidation.validTransmission(transmissionType) == false)
		{
			System.out.println("Invalid transmission type. Please try again.");
			System.out.println("Enter transmission type: ");
			transmissionType = input.next();
		}
		
		try
		{
			System.out.println("Does the car have a sun roof (true/false): ");
			hasSunRoof = input.nextBoolean();
			System.out.println("Is this a convertible (true/false): ");
			isConvertible = input.nextBoolean();
		}
		catch (Exception e)
		{
			System.out.println("Value should be \"true\" or \"false\". Please re-run the program.");
			e.printStackTrace();
			throw new Exception("Program failed!");
		}
		
		System.out.println("Enter the GT version: ");
		gtVersion = input.next();

	}
}
