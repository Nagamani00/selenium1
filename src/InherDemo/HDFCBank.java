package InherDemo;

public class HDFCBank extends RBIBank
{
	HDFCBank()
	{
		System.out.println("Cons of HDFCBank");
	}
	public static void main(String[] args)
	{
		 HDFCBank h1 = new  HDFCBank();
		 h1.cBillScore();
	}
  void cBillScore()
  {
	  System.out.println("cBillScore of HDFCBank is 700");
  }
}
