package JavaPractice;

public class ThisDemo1 
{
	ThisDemo1()
	{
		System.out.println("Cons of ThisDemo1");
		System.out.println(this);
		System.out.println("Cons Done");
	}
	public static void main(String[] args)
	{
		System.out.println("main method of ThisDemo1");
		ThisDemo1 t1 = new ThisDemo1();
		System.out.println(t1);
		
		
	}

}
