package JavaPractice;

public class BudzDemo1 
{

	public static void main(String[] args)
	{
	int grossSalary = 100000;
//	int salary = grossSalary - totalCharges; //compile time error, this is not local variable function
//	System.out.println(netSalary);	
	}
	void houseCharges()
	{
		int rent = 10000;
		int childFee = 20000;
		int totalCharges = rent+childFee;
		System.out.println(totalCharges);
		
		
	}

}
