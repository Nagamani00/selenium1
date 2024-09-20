package JavaPractice;

public class ThisDemo6
{
	ThisDemo6() 
	{
	 this(20);
	 System.out.println("zero args Cons of ThisDemo6");
	}
	ThisDemo6(int a)
	{
	 System.out.println("int args Cons of ThisDemo6");
	}

	public static void main(String[] args) 
	{
	 System.out.println("mainmethod start");
	 
	 ThisDemo6 t1 = new  ThisDemo6();
	 
	 System.out.println("Done");
		
		
		
		
		
	}

}
