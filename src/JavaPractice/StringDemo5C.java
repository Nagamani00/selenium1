package JavaPractice;

public class StringDemo5C {

	public static void main(String[] args) 
	{
		String s1 = "  RBG technologies  ";
		System.out.println(s1);
		
		 s1 = s1.trim();
		System.out.println(s1);
		
		String s2 = " rbg technologies ";
		System.out.println(s2);
		
	    s2 = s2.toUpperCase();
		System.out.println(s2);
	}

}
