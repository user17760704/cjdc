
public class BuildYourPC
{
	public static void buildYourPC()
	{
		
		System.out.println("Build your own PC");
		PC pc = UserInput.setPCDetails();
		PrintPCDetails.printPCDetails(pc);
		
//		
//		Motherboard mb = new Motherboard();
//		Monitor monitor = new Monitor();
//		Tower tower = new Tower();
//		
//		System.out.println("Select parts for your PC");
//		System.out.println("****Motherboard details****");
//		mb = UserInput.setMotherboardDetails();
//		System.out.println("****Monitor details****");
//		monitor = UserInput.setMonitorDetails();
//		System.out.println("****Tower details****");
//		tower = UserInput.setTowerDetails();
//		
//		PrintPCDetails.printMotherboardDetails(mb);
//		PrintPCDetails.printMonitorDetails(monitor);
//		PrintPCDetails.printTowerDetails(tower);
	}
}
