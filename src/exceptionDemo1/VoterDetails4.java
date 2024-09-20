package exceptionDemo1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class VoterDetails4
{

	public static void main(String[] args)
	{
		voterAgeValidation(19);	
		voterAgeValidation(18);
		voterAgeValidation(17);
	}

	
	public static void voterAgeValidation(int age )
	{
		if(age>=18)
		{
			System.out.println("valid voter");
		}
		else
		{
			System.out.println("age is not valid vote");
//			throw new ArithmeticException();
//			throw new NumberFormatException();
//			throw new ArrayIndexOutOfBoundsException();
//			throw new NullPointerException();
			
//			throw new IOException();
//			throw new FileNotFoundException();
//			throw new SQLException();
//			throw new Exception();
			
		}
		System.out.println("continue.....");
	}
}
