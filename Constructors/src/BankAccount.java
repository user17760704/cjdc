public class BankAccount
{
	private int _accountNumber;
	private double _balance;
	private String _name;
	private String _email;
	private String _phoneNo;
	
	public void setAccountNnumber(int accountNumber)
	{
		this._accountNumber = accountNumber;
	}
	
	public void setBalance(double balance)
	{
		this._balance = balance;
	}
	
	public void setName(String name)
	{
		this._name = name;
	}
	
	public void setEmail(String email)
	{
		this._email = email;
	}
	
	public void setPhoneNo(String phoneNo)
	{
		if (!InputValidation.validPhoneNumber(phoneNo))
		{
			System.out.println("The input - " + phoneNo + " is not a valid phone number. Please enter a 10 digit number.");
		}
		else
		{
			this._phoneNo = phoneNo;
		}
		
	}
	
	public int getAccountNumber()
	{
		return this._accountNumber;
	}
	
	public double getBalance()
	{
		return this._balance;
	}
	
	public String getName()
	{
		return this._name;
	}
	
	public String getEmail()
	{
		return this._email;
	}
	
	public String getPhoneNo()
	{
		return this._phoneNo;
	}
	
	public void deposit(double depositAmount)
	{
		this._balance = _balance + depositAmount;
		System.out.println("Deposit successful. Balance is: " + this._balance);
	}
	
	public void withdraw(double withdrawAmount)
	{
		if (withdrawAmount > this._balance)
		{
			System.out.println("The withdraw amount exceeds the balance.");
		}
		else
		{
			this._balance = _balance - withdrawAmount;
			System.out.println("Withdraw successful. Balance is: " + this._balance);
		}
	}
}
