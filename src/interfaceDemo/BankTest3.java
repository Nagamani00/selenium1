package interfaceDemo;

public class BankTest3 
{

	public static void main(String[] args) 
	{
		Bank b1 = null;
		Bank b2 = new USBank();
        b2.totalBalance();
        b2.totalCustomers();
        
        b2 = new USBank();
        b2.totalBalance();
        b2.totalCustomers();
        
        b2 = new USBank();
        b2.totalBalance();
       b2.totalCustomers();
	}

}
