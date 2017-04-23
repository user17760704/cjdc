
public class Monitor extends Resolution
{
	private String _model;
	private String _manufacturer;
	private double _size;
//	Monitor isn't the resolution, but it has a resolution. This is an example of composition
	private Resolution _resolution;
	
	public Monitor(String model, String manufacturer, int size, Resolution resolution)
	{
		super();
		this._model = model;
		this._manufacturer = manufacturer;
		this._size = size;
		this._resolution = resolution;
	}
	
	public Monitor()
	{
		// TODO Auto-generated constructor stub
	}

	//	Public methods
	public void drawPixel(int x, int y, String color)
	{
		System.out.println("Drawing pixel at: " + x + "," + y + " in color: " + color);
	}

//	Al the getters
	public String getModel()
	{
		return _model;
	}

	public String getManufacturer()
	{
		return _manufacturer;
	}

	public double getSize()
	{
		return _size;
	}

	public Resolution getResolution()
	{
		return _resolution;
	}

//	All the setters
	
	public void setModel(String model)
	{
		this._model = model;
	}

	public void setManufacturer(String manufacturer)
	{
		this._manufacturer = manufacturer;
	}

	public void setSize(double size)
	{
		this._size = size;
	}

	public void setResolution(Resolution resolution)
	{
		this._resolution = resolution;
	}
}
