
public class Monitor
{
	private String _model;
	private String _manufacturer;
	private int _size;
//	Monitor isn't the resolution, but it has a resolution. This is an example of composition
	private Resolution _resolution;
	
	public Monitor(String _model, String _manufacturer, int _size, Resolution _resolution)
	{
		super();
		this._model = _model;
		this._manufacturer = _manufacturer;
		this._size = _size;
		this._resolution = _resolution;
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

	public int getSize()
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

	public void setSize(int size)
	{
		this._size = size;
	}

	public void setResolution(Resolution resolution)
	{
		this._resolution = resolution;
	}
}
