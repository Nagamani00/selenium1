package JavaPractice;


public class PolyDemo1C
{

	public static void main(String[] args)
	{
		PolyDemo1A p1 = new PolyDemo1A();	
		p1.funA(10l);
	}
	void funA(long a)
	{
		System.out.println("long args of funA");
	}	
	void funA(int b)
	{
		System.out.println("long args of funA");
	}	

}
