package JavaPractice;

public class BeMotive 
{ 
	public static void main(String[]args)
	{
	System.out.println("Do or die");	
	BeMotive goBack = new BeMotive(); 	
	goBack.SRK();	
	goBack.hey().SRK();	
	}
	void SRK()
	{
	System.out.println("Big fan of SRK");
	}
	BeMotive hey()
	{
	System.out.println("be positive");

  return new BeMotive(); 
	
	}
}
