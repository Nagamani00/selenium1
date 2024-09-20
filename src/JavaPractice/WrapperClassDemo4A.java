package JavaPractice;

public class WrapperClassDemo4A {

	public static void main(String[] args) 
	{
	String ticketCharge = "$5,000";
	String s1= ticketCharge.replace("$", "");
	String s2= s1.replace(",", "");
	
	int miles = Integer.parseInt(s2);
	int availableBalance = 4000;
	if(availableBalance<=miles)
	{
		System.out.println("Book the ticket");
	}
	else
	{
		System.out.println("availableBalance is in-sufficient");
	}
		
		
		
		
	}

}
