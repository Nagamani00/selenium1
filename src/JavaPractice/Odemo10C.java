package JavaPractice;

public class Odemo10C
{

	public static void main(String[] args)
	{
		
A a1 = new A();
System.out.println(a1); //same object address
System.out.println(a1); // same object address
System.out.println(a1); // same object address
System.out.println(a1); //same object address

System.out.println(new A()); //different object address
System.out.println(new A());//different object address
System.out.println(new A());//different object address
System.out.println(new A());//different object address



	}

}
