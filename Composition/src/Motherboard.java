
public class Motherboard
{
	private String _model;
	private String _manufacturer;
	private int _ramSlots;
	private int _gpuSlots;
	private boolean _supportsSLI;
	private String _biosVersion;
	
	public Motherboard(String _model, String _manufacturer, int _ramSlots, int _gpuSlots, boolean _supportsSLI, String _biosVersion)
	{
		super();
		this._model = _model;
		this._manufacturer = _manufacturer;
		this._ramSlots = _ramSlots;
		this._gpuSlots = _gpuSlots;
		this._supportsSLI = _supportsSLI;
		this._biosVersion = _biosVersion;
	}
	
//	Public methods
	public void loadProgram(String programName)
	{
		System.out.println("Program name is: " + programName);
	}
	
//	All the getters
	
	public String getModel()
	{
		return _model;
	}
	
	public String getManufacturer()
	{
		return _manufacturer;
	}

	public int getRamSlots()
	{
		return _ramSlots;
	}
	
	public int getGpuSlots()
	{
		return _gpuSlots;
	}
	
	public boolean getSupportsSLI()
	{
		return _supportsSLI;
	}
	
	public String getBiosVersion()
	{
		return _biosVersion;
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
	
	public void set_ramSlots(int ramSlots)
	{
		this._ramSlots = ramSlots;
	}

	public void setGpuSlots(int gpuSlots)
	{
		this._gpuSlots = gpuSlots;
	}
	
	public void setSupportsSLI(boolean supportsSLI)
	{
		this._supportsSLI = supportsSLI;
	}

	public void setBiosVersion(String biosVersion)
	{
		this._biosVersion = biosVersion;
	}
}