package JavaPractice;

public class Odemo8CC 
{

	void fun1(A a1)
	{
	System.out.println(a1);
	if (a1!=null)
	{
		a1.i = a1.i+1;
		a1.j = a1.j+1;
		
	}
	System.out.println("end of fun1");
	}
	
	public static void main(String[] args)
	{
		Odemo8CC  d1 = new Odemo8CC ();	
	   int a = 10;
	    A a1 = new A();
	d1.fun1(a1);
	System.out.println(a1.i);
	System.out.println(a1.j);
		

	}
}
