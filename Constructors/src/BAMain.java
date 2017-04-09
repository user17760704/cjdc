import java.util.Scanner;

public class BAMain
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		BankAccount ba = new BankAccount();
		
		System.out.println("Enter the name of the account holder: ");
		ba.setName(input.nextLine());
		System.out.println("Name of the account holder: " + ba.getName());
		
		System.out.println("Enter the email address of the account holder: ");
		ba.setEmail(input.nextLine());
		System.out.println("Email address of the account holder: " + ba.getEmail());
		
		System.out.println("Enter the account number: ");
		ba.setAccountNnumber(input.nextInt());
		System.out.println("Account number: " + ba.getAccountNumber());
		
		System.out.println("Enter the balance: ");
		ba.setBalance(input.nextDouble());
		System.out.println("Balance is: " + ba.getBalance());
		
		System.out.println("Enter the phone number: ");
		ba.setPhoneNo(input.next());
		System.out.println("The phone number is: " + ba.getPhoneNo());
		
		System.out.println("Deposit the following amount: ");
		ba.deposit(input.nextDouble());
		
		System.out.println("Withdraw the following amount: ");
		ba.withdraw(input.nextDouble());
		
	}

}
