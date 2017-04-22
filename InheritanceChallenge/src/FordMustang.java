
public class FordMustang extends Car
{
	private String _gtVersion;

	public FordMustang(int topSpeed, double price, String color, int year, double fuelEfficiency, boolean powerSteering, String transmissionType, boolean hasSunRoof, int doors, boolean isConvertible, String gtVersion)
	{
		super("Ford Mustang", topSpeed, price, "Wheel", color, year, fuelEfficiency, powerSteering, transmissionType, hasSunRoof, doors, isConvertible);
		this._gtVersion = gtVersion;
	}
	
	public String getGTVersion()
	{
		return _gtVersion;
	}
	public void setGTVersion(String gtVersion)
	{
		this._gtVersion = gtVersion;
	}
	
	
}
