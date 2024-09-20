package JavaPractice;

public class ThisDemo5A 
{
	int i = 5;
	ThisDemo5A()
	{
		System.out.println("zero args Cons of ThisDemo6");
		i = 10;
	}
	ThisDemo5A(int a)
	{
		this();
		System.out.println("int args Cons of ThisDemo6");
		i = a;
	}

	public static void main(String[] args)
	{
		System.out.println("mainmethod start");
		ThisDemo5A  t1 = new ThisDemo5A(20);
		System.out.println(t1.i);
		System.out.println("Done");
	}

}
