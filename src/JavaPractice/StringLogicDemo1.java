package JavaPractice;

public class StringLogicDemo1 
{

	public static void main(String[] args) 
	{
		String s1 = "RBG technologies";
		int charCount = s1.length();
		System.out.println(charCount);
		char crr[]= s1.toCharArray(); // return char
		System.out.println(crr[0]);
		char c1 = s1.charAt(4);
		
		String str1[] = s1.split(" "); //{"RBG ","technologies"}
		System.out.println(str1[0]);
		System.out.println(str1[1]);
		
		String str2[] = s1.split("o");  //{"RBG techn","l","gies"}
        System.out.println(str2[0]);
        System.out.println(str2[1]);
        System.out.println(str2[2]);
		
        String subString1 = s1.substring(3);
		System.out.println(subString1);
		
		String subString2 = s1.substring(3,7);//(begining,belowending)
		System.out.println(subString2);

		String replace1 = s1.replace("e", "$");
		System.out.println(replace1);
	}

}
