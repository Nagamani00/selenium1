package JavaPractice;

public class PolyDemo4A
{
	public static void main(String[] args)
	{

		funA(10,true);
		funA(true,40);
	}
	static void funA(int a,boolean b)
	{
		System.out.println("int  boolean args of polyDemo4A");
		 
	}
	 static void funA(boolean b, int a)
	{
		System.out.println("boolean int args of polyDemo4A");
		
	
	}

}
