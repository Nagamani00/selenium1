package JavaPractice;

public class BudzDemo4 
{

	public static void main(String[] args)
	{
		int grossSalary = 100000;
		BudzDemo4 bd1 = new BudzDemo4();
		int charges  =  bd1.houseCharges();
		int netSalary = grossSalary - charges;
		System.out.println(netSalary);
		
		int taxCal = 30*charges;
		System.out.println(taxCal); 
	}
	int houseCharges()//int houseCharges()= totalCharges;
	{
		System.out.println("houseCharges is invoking");
		int rent = 10000;
		int childFee = 20000;
		int totalCharges = rent +childFee;
		System.out.println(totalCharges);
			
		return totalCharges;	
				

	}

}
