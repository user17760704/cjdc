import java.util.Scanner;

public class Main
{

	public static void main(String[] args) throws Exception
	{
		Scanner input = new Scanner(System.in);
		int choice;
		System.out.println("1. Vehicle (Generic object) ");
		System.out.println("2. Car (Generic c) ");
		System.out.println("3. Ford Mustang ");
		System.out.println("What kind of a vehicle would you like to create: ");
		choice = input.nextInt();
		
		switch (choice)
		{
			case 1:
				
		}
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Scanner input = new Scanner(System.in);
//		double price, fuelEfficiency;
//		String transmissionType = null, gtVersion;
//		boolean hasSunRoof = false,
//				isConvertible = false;
//		
//		System.out.println("Enter the price of the vehicle: ");
//		price = input.nextDouble();
//		System.out.println("Enter the fuel efficiency of the vehicle: ");
//		fuelEfficiency = input.nextDouble();
//		System.out.println("Enter transmission type: ");
//		transmissionType = input.next();
//		while (InputValidation.validTransmission(transmissionType) == false)
//		{
//			System.out.println("Invalid transmission type. Please try again.");
//			System.out.println("Enter transmission type: ");
//			transmissionType = input.next();
//		}
//		
//		try
//		{
//			System.out.println("Does the car have a sun roof (true/false): ");
//			hasSunRoof = input.nextBoolean();
//			System.out.println("Is this a convertible (true/false): ");
//			isConvertible = input.nextBoolean();
//		}
//		catch (Exception e)
//		{
//			System.out.println("Value should be \"true\" or \"false\". Please re-run the program.");
//			e.printStackTrace();
//			throw new Exception("Program failed!");
//		}
//		
//		System.out.println("Enter the GT version: ");
//		gtVersion = input.next();
//		
//		FordMustang fm = new FordMustang(100, price, "Black", 2016, fuelEfficiency, true, transmissionType, hasSunRoof, 2, isConvertible, gtVersion);
//		
//		PrintDetails.printVehicleDetails(fm);
	}

}
