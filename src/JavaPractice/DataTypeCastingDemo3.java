package JavaPractice;

public class DataTypeCastingDemo3 
{
 
	public static void main(String[] args) 
	{
		
	int a = 10;
	
	float f1 = 10;
	
	int b = (int)f1; // explicit data type casting (higher data converts to lower data)
	
	long k = (long)f1; // explicit data type casting
	
	float f2 = (float)10.237897657; // explicit data type casting
	
	System.out.println(f2);	
	
	double d1 = 10.23;
	
	int c = (int)10.23; // explicit data type casting
	
	System.out.println(c);		
				
	}

}
