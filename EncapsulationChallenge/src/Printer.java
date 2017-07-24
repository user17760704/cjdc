
public class Printer
{
//	Toner level in terms of percentage
	private double _tonerLevel = 100; 
	private int _numberOfPagesPrinted = 0;
	private boolean _duplexCapable;
	
	public Printer()
	{
		super();
	}
	
	public Printer(double tonerLevel, boolean duplexCapable)
	{
		super();
		
		if (tonerLevel > 0 && tonerLevel <= 100)
		{
			this._tonerLevel = tonerLevel;
		}
		
		this._numberOfPagesPrinted = 0;
		this._duplexCapable = duplexCapable;
	}

	public double getTonerLevel()
	{
		return _tonerLevel;
	}

	public int getNumberOfPagesPrinted()
	{
		return _numberOfPagesPrinted;
	}

	public boolean isDuplexCapable()
	{
		return _duplexCapable;
	}

	public void setTonerLevel(double tonerLevel)
	{
		if(tonerLevel > 0 && tonerLevel <= 100)
		{
			this._tonerLevel = tonerLevel;
		}
		
	}

//	public void setNumberOfPagesPrinted(int numberOfPagesPrinted)
//	{
//		this._numberOfPagesPrinted = numberOfPagesPrinted;
//	}

	public void setIsDuplexCapable(boolean duplexCapable)
	{
		this._duplexCapable = duplexCapable;
	}
	
	public void fillToner(double percentageFill)
	{
		double currentTonerLevel = this._tonerLevel + percentageFill; 
		if(currentTonerLevel > 100)
		{
			this._tonerLevel = 100;
		}
		else
		{
			this._tonerLevel = currentTonerLevel;
		}
	}
	
	public void printPage(int pagesToPrint)
	{
		this._numberOfPagesPrinted = this._numberOfPagesPrinted + pagesToPrint;
	}
}