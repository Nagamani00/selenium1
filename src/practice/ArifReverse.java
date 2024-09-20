package practice;

public class ArifReverse {

	public static void main(String[] args)
	{
		String s1 = "arif";
		String s2 =" ";
		char c1;
		for(int i = 0;i<s1.length();i++)
		{
			c1 = s1.charAt(i);
			s2 = c1+s2;

		}
		System.out.println(s2);
		
		
	}

}
