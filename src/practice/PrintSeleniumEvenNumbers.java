package practice;

public class PrintSeleniumEvenNumbers 
{


	public static void main(String[]args)

	{
	String traget_out_put=	"This si selenium ssalc";
			String s1 = "This is selenium class";
			String [] word=s1.split(" ");
			int a=word.length;
			for(int i=0;i<a;i++)
			{
				if(i%2==0)
					 System.out.println(word[i]);
				if(i%2==1)
				{
//		        System.out.println(word[i]);
		       String m= word[i];
//		      System.out.println( "mad"+m.length());
		       
		       for(int j=m.length()-1;j>0;j--)
		       {
		    	   char v=m.charAt(j);
		    	   System.out.print(v);
		       }
		        
				}
			}
			 
			
			
			/* char c1;
			for(int i=0;i<s1.length();i++)
			{
			c1 = s1.charAt(i);	
		   s2 = c1+s2;
		   
			}
			System.out.println(s2);
			*/
			
			
			
			
			
			
			
			
			

//		String s1 = "arif";
//		String s2 =" ";
//		char c1;
//		for(int i = 0;i<s1.length();i++)
//		{
//			c1 = s1.charAt(i);
//			s2 = c1+s2;
//
//		}
//		System.out.println(s2);
//		

	}
}
