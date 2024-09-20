package JavaPractice;

public class Suresh
{

	public static void main(String[] args)
{
		
	 Suresh s = new  Suresh();
		s.funA();
		s.funB();
        s.addNumbers(30,50);
		s.addNumbers(30,80);
		s.addNumbers(70,90);
	}
	void funA()
	{
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(c);
	}
	void funB()
	{
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(c);
	}
	void addNumbers(int a, int b)	
	{
		int c = a+b;
		System.out.println(c);
		
		
	}

}
