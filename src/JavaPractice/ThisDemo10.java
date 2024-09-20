package JavaPractice;

public class ThisDemo10 
{
	ThisDemo10 ()
	{
	//this(20); compile time error
	System.out.println("zero args Cons of  ThisDemo6A ");
	}
	ThisDemo10 (int a)
	{
	//this(); // this keyword cannot called in the 2 functions at the same time
	System.out.println("int args Cons of  ThisDemo6A"); 
	}

}

