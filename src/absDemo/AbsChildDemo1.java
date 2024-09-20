package absDemo;

public class AbsChildDemo1 extends AbsDemo5
{
	AbsChildDemo1()
	{
		System.out.println("Cons of AbsChildDemo1");
	}

	public static void main(String[] args)
	{
		AbsChildDemo1 ab1 = new AbsChildDemo1();
		ab1.funC();		// we can able to create an object for abstract class with childClass object

	}

	@Override
	void funA() {
		
		
	}

	@Override
	void funB()
	{
		
	}

}
