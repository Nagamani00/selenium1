package interfaceDemo;

public class BankTest2 
{

	public static void main(String[] args) 
	{
		Bank b1 = null;
		Bank b2 = new USBank();
        b2.totalBalance();
        b2.totalCustomers();
        
        Bank b3 = new USBank();
        b3.totalBalance();
        b3.totalCustomers();
        
        Bank b4 = new USBank();
        b4.totalBalance();
        b4.totalCustomers();
	}

}
