package JavaPractice;

public class BudzDemo2
{

	public static void main(String[] args) 
	{
	 int grossSalary = 100000;
	 BudzDemo2 bd1 = new BudzDemo2();
	 int netSalary = grossSalary - bd1.houseCharges();
	 System.out.println(netSalary);
	}
	int houseCharges() //int houseCharges() = totalCharges;
	{
	int rent = 10000;
	int childFee = 20000;
	int totalCharges = rent +childFee;
	System.out.println(totalCharges);	
	return totalCharges;	
		
	}

}
