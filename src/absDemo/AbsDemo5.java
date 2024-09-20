package absDemo;

public abstract class AbsDemo5
{
	AbsDemo5()
	{
		System.out.println("Cons of AbsDemo5");
	}

	public static void main(String[] args) 
	{
		// AbsDemo5 ab = new AbsDemo5();  we cannot create an object abstract class directly 
		// ab.funC();
	}
   abstract void funA();
   abstract void funB();
   void funC()
   {
	  System.out.println("funC of AbsDemo5"); 
   }
}
