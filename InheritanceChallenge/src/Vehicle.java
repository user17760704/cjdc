
public class Vehicle
{
	private String _name;
	private int _wheels;
	private int _topSpeed;
	private double _price;
	private String _steeringMode;
	private String _color;
	private int _year;
	private double _fuelEfficiency;
	
	
	
	public Vehicle(String name, int _wheels, int _topSpeed, double _price, String _steeringMode, String _color, int _year, double _fuelEfficiency)
	{
		super();
		this._name = name;
		this._wheels = _wheels;
		this._topSpeed = _topSpeed;
		this._price = _price;
		this._steeringMode = _steeringMode;
		this._color = _color;
		this._year = _year;
		this._fuelEfficiency = _fuelEfficiency;
	}

//	All the getters
	public String getName()
	{
		return _name;
	}
	public int getWheels()
	{
		return _wheels;
	}
	public int getTopSpeed()
	{
		return _topSpeed;
	}
	public double getPrice()
	{
		return _price;
	}
	public String getSteeringMode()
	{
		return _steeringMode;
	}
	public String getColor()
	{
		return _color;
	}
	public int getYear()
	{
		return _year;
	}
	public double getFuelEfficiency()
	{
		return _fuelEfficiency;
	}
	
//	All the setters
	public void setName(String name)
	{
		this._name = name;
	}
	public void setWheels(int wheels)
	{
		this._wheels = wheels;
	}
	public void setTopSpeed(int topSpeed)
	{
		this._topSpeed = topSpeed;
	}
	public void setPrice(double price)
	{
		this._price = price;
	}
	public void setSteeringMode(String steeringMode)
	{
		this._steeringMode = steeringMode;
	}
	public void setColor(String color)
	{
		this._color = color;
	}
	public void setYear(int year)
	{
		this._year = year;
	}
	public void setFuelEfficiency(double fuelEfficiency)
	{
		this._fuelEfficiency = fuelEfficiency;
	}
}