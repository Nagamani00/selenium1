package JavaPractice;

public class StaticDemo5B 
{
	 int a = funA();	
	public static void main(String[] args) 
	{
	System.out.println("main method of StaticDemo5");
	new	StaticDemo5B(); 
	new	StaticDemo5B();	
	new	StaticDemo5B();
	StaticDemo5B s1 = new StaticDemo5B(); 
	//System.out.println(s1.a);
	//System.out.println("Done");	
	}
	int funA()
	{
		System.out.println("funA of StaticDemo5B");
    return 10;
	}

}
