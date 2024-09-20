package JavaPractice;

public class StaticDemo5 
{
    int a = funA();
    static int b = funB();
	public static void main(String[] args)
	{
	System.out.println("main method of StaticDemo5");	
		
	}
	int funA()
	{
	System.out.println("funA of StaticDemo5");	
	return 10;	
	}
	static int funB()
	{
	System.out.println("funB of StaticDemo5");
	return 20;	
		
		

	}

}
