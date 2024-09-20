package JavaPractice;

public class PolyDemo6AA 
{
	public static void main(String[] args) 
	{
		PolyDemo6AA p1 = new PolyDemo6AA();
	    
	    p1.funA(new A());
	   
		p1.funA(new B());
		
		p1.funA(new C());
		
	}
	void funA(A a)	
	{
		System.out.println("classA of PolyDemo6");
		System.out.println(a);
	}
		
	void funA(B b)	
	{
		System.out.println("classB of PolyDemo6");
		System.out.println(b);
	}	
		
	void funA(C c)	
	{
		System.out.println("classC of PolyDemo6");
		System.out.println(c);
	}
	
}
