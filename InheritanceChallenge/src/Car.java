
public class Car extends Vehicle
{
	private boolean _powerSteering;
//	Manual or automatic
	private String _transmissionType;
	private boolean _hasSunRoof;
	private int _doors;
	private boolean _isConvertible;
	
	public Car(int wheels, int topSpeed, int price, String steeringMode, String color, int year, double fuelEfficiency, boolean powerSteering, String transmissionType, boolean hasSunRoof, int doors, boolean isConvertible)
	{
		super(4, topSpeed, price, "Wheel", color, year, fuelEfficiency);
		this._powerSteering = powerSteering;
		this._transmissionType = transmissionType;
		this._hasSunRoof = hasSunRoof;
		this._doors = doors;
		this._isConvertible = isConvertible;
	}
	
	public boolean isPowerSteering()
	{
		return _powerSteering;
	}

	public void setPowerSteering(boolean powerSteering)
	{
		this._powerSteering = powerSteering;
	}

	public String getTransmissionType()
	{
		return _transmissionType;
	}

	public void setTransmissionType(String transmissionType)
	{
		this._transmissionType = transmissionType;
	}

	public boolean getHasSunRoof()
	{
		return _hasSunRoof;
	}

	public void setHasSunRoof(boolean hasSunRoof)
	{
		this._hasSunRoof = hasSunRoof;
	}

	public int getDoors()
	{
		return _doors;
	}

	public void setDoors(int doors)
	{
		this._doors = doors;
	}

	public boolean getIsConvertible()
	{
		return _isConvertible;
	}

	public void setIsConvertible(boolean isConvertible)
	{
		this._isConvertible = isConvertible;
	}
}