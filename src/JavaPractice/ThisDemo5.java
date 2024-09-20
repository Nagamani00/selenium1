package JavaPractice;

public class ThisDemo5 
{
	ThisDemo5 ()
	{
		System.out.println("zero args of Cons ThisDemo5 ");
	}
	ThisDemo5 (int a)
	{
		this(); //calling the zero args cons of the same class
		System.out.println("int args Cons ThisDemo5 ");
	}
	public static void main(String[] args)
	{
	System.out.println("main method start");	
	ThisDemo5 t1 = new ThisDemo5 (20);	
	System.out.println("Done");	
		
	}
}
