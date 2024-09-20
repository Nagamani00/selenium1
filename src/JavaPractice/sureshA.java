package JavaPractice;

public class sureshA
{

	public static void main(String[] args) 
	{
	sureshA s = new sureshA();
	 s.funA();
	 s.addnumber(100);
	 s.funB(30.0f);
	 s.funC(60.0);
	 s.funC1('c');
	 s.funC2(false);
	}

		
	void funA()
	{
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(c);
	}
	
		
	 void addnumber(long a)	
	 {
		 long b = a;
		 System.out.println(b);
	 }
	 
	void funB(float f)
		{
		float a = f;
		System.out.println(a);
		}
	void funC(double d)
	{
		double a = d;
		System.out.println(a);
	}
	void funC1(char c)
	{
		char a = c;
		System.out.println(a);
	}
	void funC2(boolean b)
	{
		boolean a = b;
		System.out.println(a);
				
		
	 }

}
