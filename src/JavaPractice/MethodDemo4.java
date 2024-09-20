package JavaPractice;

public class MethodDemo4
{
	public static void main(String[] args)
	{
	
	System.out.println(" main methoid of MethodDemo4");
	funC();
	System.out.println("Done");
	}
	static void funA()
	{
	System.out.println("funA of methodDemo4");
    funC();
	}
	static void funB()
	{
	System.out.println("funB of methodDemo4");
	funA();
	}
	static void funC()
	{System.out.println("funCof methodDemo4");
	funB();
	
	
	}

}
