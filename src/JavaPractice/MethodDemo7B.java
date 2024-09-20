package JavaPractice;

public class MethodDemo7B 
{

	public static void main(String[] args)
	{
	MethodDemo7B m1 = new MethodDemo7B();
	
	m1.funB(); // calling as m1.funA();
	
	MethodDemo7B m2 = new MethodDemo7B();
	
	m2.funB(); // calling as m2.funA();
	
	MethodDemo7B m3 = new MethodDemo7B();
	
	m3.funB(); // calling as m3.funA();
	
	System.out.println("Done");
	}
	void funA()
	{
		System.out.println("funA of MethodDemo7B ");
	}
	void funB()
	{
		System.out.println("funB of MethodDemo7B ");
		
		funA(); // calling from funB current object
				
	}

}
