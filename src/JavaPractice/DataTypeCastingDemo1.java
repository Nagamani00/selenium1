package JavaPractice;

public class DataTypeCastingDemo1 
{

	public static void main(String[] args)
	{
	 int a = 10;
	 // float f1 = 10;
	  float f1 = a; // implicit data type casting(lower data converts to higher data)
	  
    System.out.println(f1);
    
      long k = 300000;
      
    float f2 = k; // implicit data type casting
    
    System.out.println(f2);
    
    double d1 = 20; // implicit data type casting
    
    
    System.out.println(d1);
    
    double d2 = f1; // implicit data type casting
    
    System.out.println(d2);
    
    
	}

}
