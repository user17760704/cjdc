
public class Main
{

	public static void main(String[] args)
	{
		Car car1 = new Civic();
		Car car2 = new Neon();
		Car car3 = new Mustang();
		
		System.out.println("Name: " + car1.getName());
		car1.pushBreak();
		
		System.out.println("Name: " + car2.getName());
		car2.pushBreak();
		
		System.out.println("Name: " + car3.getName());
		car3.pushBreak();
	}

}
