package practice;

public class MethodDemo6B 
{

	public static void main(String[] args)
	{
		MethodDemo6B v1 = new MethodDemo6B();	
		v1.msd();
	}
	void arif()
	{
		System.out.println("MethodDemo6B of arif");
		
	}
	void rohith()
	{
		MethodDemo6B v1 = new MethodDemo6B();
		v1.msd();
		System.out.println("MethodDemo6B of rohith");
		
	}
	void msd()
	{
		MethodDemo6B v1 = new MethodDemo6B();
		v1.arif();
		System.out.println("MethodDemo6B of msd");
		
	}

}
