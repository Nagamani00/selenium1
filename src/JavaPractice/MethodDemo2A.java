package JavaPractice;

public class MethodDemo2A 
{

	public static void main(String[] args) 
	{
	System.out.println("main method of MethodDemo2A ");
	funC();
	MethodDemo2A m1 = new MethodDemo2A(); 	
	m1.funA();	
	m1.funB();	
	System.out.println("Done");	
	}
	void funA()
	{
	System.out.println("funA of MethodDemo2A ");
	}
	void funB()
	{
	System.out.println("funB of MethodDemo2A ");
	
	}	
	 static void funC()    
	{
	System.out.println("funC of MethodDemo2A ");
	}
	
	
}
