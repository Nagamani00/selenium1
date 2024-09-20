package practice;

public class Test {

	public Test()
	{
		
			}
	public Test(int a)
	{
		
			}

	public static void main(String[] args) 
	{
		 Test t1 = new Test();	
		 Test t2 = new Test();
		 Test t3 = new Test();
		 System.out.println(t1.hashCode());
		 System.out.println(t2.hashCode());
		 System.out.println(t3.hashCode());

	}

}
