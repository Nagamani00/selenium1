package practice;

public class Assignment26 {

	public static void main(String[] args)
	{
	   String s1 = "{[('abc':'123')]},{[('def':'345')]},{[('ghi':'678')]}";
	   
	   String m1 = s1.replace("':'", "=");
	   System.out.println(m1);
	   
	   String m2 = m1.replace("{[('", "");
	   System.out.println(m2);
	   
	   String m3 = m2.replace("')]}","");
	   System.out.println(m3);
		
	   String str[]= m3.split(",");
	   
	  System.out.println(str[0]);
	  System.out.println(str[1]); 
	  System.out.println(str[2]); 
	   }
	  	
	

}
