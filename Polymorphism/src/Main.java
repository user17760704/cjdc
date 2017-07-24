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
	
	public String getName()
	{
		return this._name;
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
		return "The only good one.";
	}
}

class Forgetable extends Movie
{
	public Forgetable()
	{
		super("Forgetable");
	}
}

public class Main
{
	public static void main(String[] args)
	{
		for (int i = 0; i < 11; i++)
		{
			Movie movie = randomMovie();
			
//			System.out.println("Movie number: " + i);
			System.out.println("\nMovie name: " + movie.getName());
			System.out.println("Plot: " + movie.plot() + "\n");
			System.out.println("**********");
		}
		
	}
	
	public static Movie randomMovie()
	{
		int randomNumber = (int) ((Math.random() * 5) + 1);
		System.out.println("Random number is: " + randomNumber);
		
		switch (randomNumber)
		{
			case 1:
				return new Jaws();
			case 2:
				return new IndependenceDay();
			case 3:
				return new MazeRunner();
			case 4:
				return new StarWars();
			case 5:
				return new Forgetable();
//			default:
//				return null;
		}
		return null;
	}
}
