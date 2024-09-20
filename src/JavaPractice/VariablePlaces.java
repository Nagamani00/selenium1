package JavaPractice;

public class VariablePlaces
{
   int a = 10;// 2nd place
   static int b = 30;// 5th place
	
	
	public static void main(String[] args)
	{
	   int a = 10;// 1st place
	}
	void funA(int a)//3rd place
	{
			
	}
	  int funB()
	{
		int a = 10;
		return a;//4th place 

	}

}
