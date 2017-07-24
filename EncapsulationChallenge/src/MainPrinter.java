public class MainPrinter
{

	public static void main(String[] args)
	{
		Printer printer = new Printer(100, true);
		
		System.out.println("Number of pages printed: " + printer.getNumberOfPagesPrinted());
		printer.printPage(50);
		System.out.println("Number of pages printed: " + printer.getNumberOfPagesPrinted());

	}

}
