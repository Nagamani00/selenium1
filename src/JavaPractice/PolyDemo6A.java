package JavaPractice;


public class PolyDemo6A 
{
	public static void main(String[] args) 
	{
	
		PolyDemo6A p1 = new PolyDemo6A();
		A a=null;
		p1.funA(a);
		
		B k=null;
		p1.funA(k);
		
		C b=null;
		p1.funA(b);

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
