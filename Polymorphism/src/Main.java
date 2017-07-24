class Movie
{
	private String _name;
	public Movie(String name)
	{
		this._name = name;
	}
	
	public String plot()
	{
		return "No plot here.";
	}
}

class Jaws extends Movie
{
	public Jaws()
	{
		super("Jaws");
	}
	
	@Override
	public String plot()
	{
		return "Shark eats people.";
	}
}

class IndependenceDay extends Movie
{
	public IndependenceDay()
	{
		super("Independence Day.");
	}
	
	@Override
	public String plot()
	{
		// TODO Auto-generated method stub
		return "Aliens try to take over.";
	}
}

class MazeRunner extends Movie
{
	public MazeRunner()
	{
		super("Maze Runner");
	}
		
	@Override
	public String plot()
	{
		// TODO Auto-generated method stub
		return "Lots of mazes";
	}
}

class StarWars extends Movie
{
	public StarWars()
	{
		super("StarWars");
	}
		
	@Override
	public String plot()
	{
		// TODO Auto-generated method stub
		return "The only good one.";
	}
}

public class Main
{

	public static void main(String[] args)
	{
		
		
	}

}
