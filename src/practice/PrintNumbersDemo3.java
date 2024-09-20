package practice;

public class PrintNumbersDemo3

{

	public static void main(String[] args) 
	{
		//	for(int a = 1; a<=100;a++)
		//	{
		//		System.out.println(a++);
		//	}
		//	
		//	for(int a =101; a<=150;a++)
		//	{
		//		System.out.println(a++);
		//	}
		//	
		//	for(int a = 99; a>=1;a--)
		//	{
		//	System.out.println(a--);
		//		
		//	}	
		//	for(int a = 149; a>=101;a--)
		//	{
		//		System.out.println(a--);
		//	}
		//		
		//		for(int a=2;a<=100;a++)
		//		{
		//		if(a%2==0)
		//		{
		//	   System.out.println(a);
		//		}
		//		}
		//		
		//		for(int a=100;a<=150;a++)
		//		{
		//		if(a%2==0)
		//		{
		//	   System.out.println(a);
		//		}
		//		}
		//		
		//		for(int a=100;a>=0;a--)
		//		{
		//		if(a%2==0)
		//		{
		//	   System.out.println(a);
		//		}
		//		}
		//		
		//		for(int a=150;a>=100;a--)
		//		{
		//		if(a%2==0)
		//		{
		//	   System.out.println(a);
		//		}
		//		}
		//		

		for(int a=1;a<=100;a++)
		{
			if(a%2==1)
			{
				System.out.println(a);
			}
		}

		for(int a=101;a<=150;a++)
		{
			if(a%2==1)
			{
				System.out.println(a);
			}
		}

		for(int a=100;a>=1;a--)
		{
			if(a%2==1)
			{
				System.out.println(a);
			}
		}

		for(int a=150;a>=100;a--)
		{
			if(a%2==1)
			{
				System.out.println(a);
			}
		}
	}
}
