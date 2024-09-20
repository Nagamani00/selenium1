package JavaPractice;



public class Testt1 
{
	int x,y;
	static int z;
	void set()
	{
		x= 20;
		y= 30;
		z = 100;
	}
	 static void display()
	{
		System.out.println(z);
		
	}
	  
	public static void main(String[] args)
	{
		Testt1  v1 = new Testt1 ();	
		v1.set();
		Testt1.display();
		Testt1.display();
		//System.out.println(X);
       // System.out.println(y);
	}

}
