package interfaceDemo;

public class UKBank implements Bank  
{

	@Override
	public void totalCustomers()  
	{
		System.out.println("tototalCustomers of UKBank");
		
	}

	@Override
	public void totalBalance() {
		System.out.println("totalBalance of UKBank");
		
	}

}
