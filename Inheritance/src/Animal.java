
public class Animal
{
	private String _name;
	private int _brain;
	private int _body;
	private int _size;
	private int _weight;
	
	public Animal(String name, int brain, int body, int size, int weight)
	{
		super();
		this._name = name;
		this._brain = brain;
		this._body = body;
		this._size = size;
		this._weight = weight;
	}

	public String getName()
	{
		return _name;
	}

	public void setName(String name)
	{
		this._name = name;
	}

	public int getBrain()
	{
		return _brain;
	}

	public void setBrain(int brain)
	{
		this._brain = brain;
	}

	public int getBody()
	{
		return _body;
	}

	public void setBody(int body)
	{
		this._body = body;
	}

	public int getSize()
	{
		return _size;
	}

	public void setSize(int size)
	{
		this._size = size;
	}

	public int getWeight()
	{
		return _weight;
	}

	public void setWeight(int weight)
	{
		this._weight = weight;
	}
}
