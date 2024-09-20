package JavaPractice;


public class PolyDemo6
{
	{
		PolyDemo6 p1 = new PolyDemo6();
	    A m = new A();
	    p1.funA(m);
	    p1.funA(new A());
	    
	    B n = new B();
	    p1.funA(n);
		p1.funA(new B());
		
		C p= new C();
		p1.funA(p);
		p1.funA(new C());
		
	}

void funA(A a)	
{
	System.out.println("classA of PolyDemo6");
	System.out.println(a);
}
	
void funA(B b)	
{
	System.out.println("clas sB of PolyDemo6");
	System.out.println(b);
}	
	
void funA(C c)	
{
	System.out.println("class Cof PolyDemo6");
	System.out.println(c);
}		


}
