package JavaPractice;

public class Odemo9 
{
  void fun1(B v1)
  {
	  System.out.println(v1);
	  
	  if(v1== null)
	  {
	v1.i = v1.i + 8;
	v1.j = v1.j + 2;
	
	  }
	  System.out.println("end of fun1");
  }
	public static void main(String[] args) 
	{
		Odemo9 d1 = new Odemo9(); 	
		B v1 = new B();
		d1.fun1(v1);
		System.out.println(v1.i);
		System.out.println(v1.j);
		d1.fun1(v1);
		System.out.println(v1.i);
		System.out.println(v1.j);
		d1.fun1(new B());
		System.out.println(v1.i);
		System.out.println(v1.j);
		d1.fun1(null);
		System.out.println(v1.i);
		System.out.println(v1.j);	
		
	}

}
