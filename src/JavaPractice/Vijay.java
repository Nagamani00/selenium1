package JavaPractice;

public class Vijay
{

	public static void main(String[] args)
	{
		
		Vijay v1 =  new Vijay();	
		v1.funA(new Suresh());
		BeMotive b = new BeMotive();
	    v1.funB(b);
	    A a1 = new A(); 
	    v1.funC(a1);
	}
		
	void funA(Suresh a)	
	{
	System.out.println("funA of Vijay");		
		
	}
		
	void funB(BeMotive b)		
	{
	System.out.println("funB of Vijay");
	
	}
	void funC(A r)		
	{
		System.out.println("funC of Vijay");
	
			
	}

}
