
public class Dimensions
{
	private double _length;
	private double _width;
	private double _height;
	
	public Dimensions(double length, double width, double height)
	{
		super();
		this._length = length;
		this._width = width;
		this._height = height;
	}

	
	public void changeDimensions()
	{
		_length +=5;
		_width +=6;
		_height +=7;
	}

//	All the getters
	public double getLength()
	{
		return _length;
	}
	
	public double getWidth()
	{
		return _width;
	}

	public double getHeight()
	{
		return _height;
	}

//	All the setters
	public void setLength(double length)
	{
		this._length = length;
	}

	public void setWidth(double width)
	{
		this._width = width;
	}
	
	public void setHeight(double height)
	{
		this._height = height;
	}

}
