package InherDemo;

public class DBSBank 
{
	
 //void cBillScore()  method over-riding
	{
		System.out.println("cBillScore of DBSBank");
	}
  int cBillScore()  //compile time error
   {
	   System.out.println("cBillScore of DBSBank");
	   return 10;
   }
}
