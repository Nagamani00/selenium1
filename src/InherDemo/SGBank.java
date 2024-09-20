package InherDemo;

public class SGBank extends RBIBank
{
	
	public static void main(String[] args)
	{
		SGBank  sg = new SGBank();
		sg.goldLoan();
		sg.cBillScore();
	}
  void goldLoan()
  {
	System.out.println("goldLoan of SGBank");  
  }
}
