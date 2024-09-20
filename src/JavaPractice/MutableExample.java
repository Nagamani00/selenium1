package JavaPractice;

public class MutableExample 
{
	int a = 5;
	void funA()
	{
		a= 10;
	}

	public static void main(String[] args) 
	{
		MutableExample m1 = new MutableExample ();
		m1.funA();
		
		System.out.println(m1.a);
		
		
	}

}
