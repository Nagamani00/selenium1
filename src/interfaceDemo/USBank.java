package interfaceDemo;

public class USBank implements Bank  
{

	@Override
	public void totalCustomers()  
	{
		System.out.println("tototalCustomers of USBank");
		
	}

	@Override
	public void totalBalance() {
		System.out.println("totalBalance of USBank");
		
	}

}
