package JavaPractice;

public class MethodDemo3A 
{
  static int a = 30;
  
	public static void main(String[] args) 
	{
	System.out.println(a);
    System.out.println("Main method of MethodDemo3A");
	funB();
	System.out.println("Done");
	System.out.println(a);
	}
    static void funA()
	{
	a = 60;
	System.out.println("funA of MethodDemo3A");
	}
			
	static void funB()
	{
	a = 70;
	//System.out.println(a);
	System.out.println("funB of MethodDemo3A");
	funA();	


	}

}
