package JavaPractice;

public class PolyDemo1A 
{
	public static void main(String[] args)
	{
		funA();
	    funA(10);
		funA(1000l);
		funA(10.0f);
		funA(20.0);
		funA('c');
		funA(true);
		
	}
 static void funA()
{
	System.out.println("zero args of funA");
}
 static void funA(int a)
{
	System.out.println("int args of funA");
}	
 static void funA(long b)
{
	System.out.println("long args of funA");
	System.out.println(b);
}		
	
 static void funA(float c)

{
	System.out.println("float args of funA");
}		
 static void funA(double d)
{
	System.out.println("double args of funA");
}		
	
 static void funA(char e)
{
	System.out.println("char args of funA");
}		
 static void funA(boolean f)
{
	System.out.println("boolean args of funA");
		

}
}
