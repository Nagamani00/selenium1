package exceptionDemo1;

public class FinallyDemo2 
{ 
	public static int a = 10;
    public static int b = 2;


	public static void main(String[] args)
	{
	try 
	{
		System.out.println(a/b);
	}
	catch(Exception e)
	{
	System.out.println("Exception block-1 is invoking");	
	}
	
	
	try
	{
		System.out.println(a/b);
	}
	catch(Exception e)
	{
		System.out.println("Exception block-2 is invoking");
	}
	finally
	{
		System.out.println("finally block-1 is invoking");
	}
	
	try
	{
		System.out.println(a/b);
	}
	finally
	{
		System.out.println("finally block-2 is invoking");
	}

	}

}
