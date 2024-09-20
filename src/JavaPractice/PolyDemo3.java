package JavaPractice;


public class PolyDemo3
{
	public static void main(String[] args) 
	{
		PolyDemo3 p1 = new PolyDemo3();	
		p1.funA(10);
		p1.funA(10,40);
	}
	void funA(int a)
	{
		System.out.println("int args of polyDemo3");
		 
	}
	void funA(int a, int b)
	{
		System.out.println("int int args of polyDemo3");
	}


}
