package interfaceDemo;

public class CanadaBank implements Bank  
{

	@Override
	public void totalCustomers()  // public keyword mandatory
	{
		System.out.println("tototalCustomers of CanadaBank");
	}

	@Override
	public void totalBalance() 
	{
		System.out.println("tototalBalance of CanadaBank");
		
	}

}
