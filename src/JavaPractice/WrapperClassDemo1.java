package JavaPractice;

public class WrapperClassDemo1 
{

	public static void main(String[] args)
	{
	  int a = 10;
	  Integer i1 = new Integer(a);//Boxing--converts int to Integer
		int b = i1;  //un-Boxing--converts  Integer to int
		System.out.println(b);
		
		Integer i2 = 20; // Autoboxing--compile will write new Integer(20)internally 
		int c = i2;  /// Auto-unboxing--compile will write i2.intValue()internally 
		
		System.out.println(c);
		
	

	}

}
