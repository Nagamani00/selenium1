package JavaPractice;


public class PolyDemo5 
{
	public static void main(String[] args)
	{
		PolyDemo5 p1 = new PolyDemo5();
		p1.funA(10,20l);
		p1.funA(40l,50l);
	}
	
	void funA(int a,long b)
	{
		System.out.println("int long args of PolyDemo5");
		
	}

	void funA(long c,long d)
	{
		System.out.println("long long args of PolyDemo5");
	}

}
