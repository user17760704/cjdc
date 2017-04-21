
public class Vehicle
{
	private int _wheels;
	private int _topSpeed;
	private int _price;
	private String _steeringMode;
	private String _color;
	private int _year;
	private double _fuelEfficiency;
	
	
	
	public Vehicle(int _wheels, int _topSpeed, int _price, String _steeringMode, String _color, int _year, double _fuelEfficiency)
	{
		super();
		this._wheels = _wheels;
		this._topSpeed = _topSpeed;
		this._price = _price;
		this._steeringMode = _steeringMode;
		this._color = _color;
		this._year = _year;
		this._fuelEfficiency = _fuelEfficiency;
	}

	public int getWheels()
	{
		return _wheels;
	}
	public void setWheels(int wheels)
	{
		this._wheels = wheels;
	}
	public int getTopSpeed()
	{
		return _topSpeed;
	}
	public void setTopSpeed(int topSpeed)
	{
		this._topSpeed = topSpeed;
	}
	public int getPrice()
	{
		return _price;
	}
	public void setPrice(int price)
	{
		this._price = price;
	}
	public String getSteeringMode()
	{
		return _steeringMode;
	}
	public void setSteeringMode(String steeringMode)
	{
		this._steeringMode = steeringMode;
	}
	public String getColor()
	{
		return _color;
	}
	public void setColor(String color)
	{
		this._color = color;
	}
	public int getYear()
	{
		return _year;
	}
	public void setYear(int year)
	{
		this._year = year;
	}
	public double getFuelEfficiency()
	{
		return _fuelEfficiency;
	}
	public void setFuelEfficiency(double fuelEfficiency)
	{
		this._fuelEfficiency = fuelEfficiency;
	}
}
