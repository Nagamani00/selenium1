package JavaPractice;

public class MethodDemo3
{

	public static void main(String[] args)
	{
	System.out.println("Main method of MethodDemo3"); // 1st step
	funB();
	System.out.println("Done");// 4th step
	}
	static void funA()
	{
	System.out.println("funA of MethodDemo3");//3rd step
	}
	static void funB()
	{
		System.out.println("funB of MethodDemo3");//2nd step
		funA();
	
	}

}
