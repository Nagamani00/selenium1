package JavaPractice;

public class MethodDemo6
{

	public static void main(String[] args)
	{
	System.out.println("Main method of MethodDemo6");
	funB();
	System.out.println("Done");
	}
	void funA()
	{
		System.out.println("funA of MethodDemo6");
	}
	static void funB()
	{
		System.out.println("funB of MethodDemo8");
		MethodDemo6 m1 = new MethodDemo6();
		m1.funA();
	}

}
