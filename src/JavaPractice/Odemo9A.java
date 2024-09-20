package JavaPractice;

public class Odemo9A 
{

	public static void main(String[] args)
	{
		Odemo9A a1= new Odemo9A();
		a1.funA();
		a1.funB();
		a1.funC();
	}
		
	A funA()
	{
	System.out.println("funA of Odemo9A ");	
	return new A();
	}
	
	Odemo9A funB()
	
	{
	System.out.println("funB of Odemo9A ");	
	return null;
	
	}
	B funC()
	{
		System.out.println("funC of Odemo9A ");
		B v1 = new B();
		return v1;
	}
		
		

}
