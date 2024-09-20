package JavaPractice;

public class Odemo10A 
{
	public static void main(String[] args)
	{
		
		Odemo10A d1 = new Odemo10A();
		int a = d1.funA();
		System.out.println(a);
		System.out.println(d1.funA());
		boolean b = d1.funB();
		System.out.println(b);
		System.out.println(d1.funB());
		Ramesh1 k = new Ramesh1();
		System.out.println(k);
		System.out.println(d1.funC());
	}
	int funA()
	{
	return 10;
	}
	boolean funB()
	{
	return false;
	}
	Ramesh1 funC()
	{
	Ramesh1 r1 = new Ramesh1();
	return r1;
	}
}
