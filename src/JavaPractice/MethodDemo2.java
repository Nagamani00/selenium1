package JavaPractice;

public class MethodDemo2
{

	public static void main(String[] args)
	{
	System.out.println("main method of MethodDemo2 ");
	
    funC();
  //  funA();  compile time error due to non-static functions 
  //  funB();  compile time error due to non-static functions
   
	}
	void funA()
	{	
    System.out.println("funA of MethodDemo2 ");
    
	}
	void funB()
	{	
	System.out.println("funB of MethodDemo2");
	
	}
	static void funC()
	{
		System.out.println("funC of  MethodDemo2");
	}
}
