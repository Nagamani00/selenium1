package practice;



public class Bank
{

	
	     static int currentBalance = 1000;
		 public static void greetCustomer()
		{
		  System.out.println( "hello,welcome to the banking application");	
		}
		 public void deposit(int amount)
		 {
		currentBalance = currentBalance + amount;
		System.out.println("Amount is deposited succesfully");
			   
		}
	    public static void withdrawl(int amount)
		{
		currentBalance =currentBalance - amount;
		System.out.println("amount is withdrawl succesfully");
		}
		public int getCurrentBalance()
		{
		return currentBalance;
		}
		public static void main(String[] args) 
		 {
		Bank bank = new Bank();
		greetCustomer();
		System.out.println("current balance is : " + bank.currentBalance);
		bank.deposit(500);
		System.out.println("current balance is :  "+ bank.currentBalance);
		withdrawl(300);
		System.out.println("current balance is :  "+ bank.currentBalance);
			

		

	}

}
