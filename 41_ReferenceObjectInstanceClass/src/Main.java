
public class Main
{

	public static void main(String[] args)
	{
		
		House blueHouse = new House("blue");
		House anotherHouse = blueHouse;
		
		anotherHouse.setColor("red");
		System.out.println("blueHouse color: " + blueHouse.getColor());
		System.out.println("anotherHouse color: " + anotherHouse.getColor());
		
		House greenHouse = new House("green");

	}

}
