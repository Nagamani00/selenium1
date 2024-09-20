package InherDemo;

public class ToStringDemo1 
{  int a = 10;
String s1 = "RBG technologies";

	public static void main(String[] args) 
	{
		System.out.println("main method starts");
		
	}
	public String toString()
	{
		System.out.println("ToStringDemo1 of ToStringDemo1 "); 
		String a = new String("selenium");
		
		return a;
		//return "selenium";
		//return s1;
		//return s1 +a; //concate("Rbg technologies" + a)
		
	}
}		
		
		


