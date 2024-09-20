package JavaPractice;

public class ThisDemo6A 
{
  int i =5;
  ThisDemo6A ()
  {
	  this(20);
	  System.out.println("zero args Cons of  ThisDemo6A ");
	  i = 10;
  }
  ThisDemo6A(int a)
  {
	  System.out.println("int args Cons of  ThisDemo6A");
	  i = a;
  }
	
	public static void main(String[] args) 
	{
		System.out.println("mainmethod start");
		ThisDemo6A  t1 = new ThisDemo6A();
		System.out.println(t1.i);
        System.out.println("Done");
	}

}
