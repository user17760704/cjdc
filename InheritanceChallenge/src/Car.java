
public class Car extends Vehicle
{
	private boolean _powerSteering;
//	Manual or automatic
	private String _transmissionType;
	private boolean _hasSunRoof;
	private int _doors;
	private boolean _isConvertible;
	
	public Car(String name, int topSpeed, double price, String steeringMode, String color, int year, double fuelEfficiency, boolean powerSteering, String transmissionType, boolean hasSunRoof, int doors, boolean isConvertible)
	{
		super(name, 4, topSpeed, price, "Wheel", color, year, fuelEfficiency);
		this._powerSteering = powerSteering;
		this._transmissionType = transmissionType;
		this._hasSunRoof = hasSunRoof;
		this._doors = doors;
		this._isConvertible = isConvertible;
	}
	
//	All the getters
	public boolean getPowerSteering()
	{
		return _powerSteering;
	}
	public String getTransmissionType()
	{
		return _transmissionType;
	}
	public boolean getHasSunRoof()
	{
		return _hasSunRoof;
	}
	public int getDoors()
	{
		return _doors;
	}
	public boolean getIsConvertible()
	{
		return _isConvertible;
	}
	
//	All the setters
	public void setPowerSteering(boolean powerSteering)
	{
		this._powerSteering = powerSteering;
	}
	public void setTransmissionType(String transmissionType)
	{
		this._transmissionType = transmissionType;
	}
	public void setHasSunRoof(boolean hasSunRoof)
	{
		this._hasSunRoof = hasSunRoof;
	}
	public void setDoors(int doors)
	{
		this._doors = doors;
	}
	public void setIsConvertible(boolean isConvertible)
	{
		this._isConvertible = isConvertible;
	}
}