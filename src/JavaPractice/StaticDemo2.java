package JavaPractice;

public class StaticDemo2 <S>
{
    int i = 10;
    static int j = 20;
   
	public static void main(String[]args) 
	{
	int i = 30;
	StaticDemo2 s1 = new StaticDemo2();
	System.out.println(i);
	System.out.println(s1.i);
	System.out.println(j);
    int j = 40;
    System.out.println(j);
	System.out.println(s1.j);	
		
		
		
		
    StaticDemo2 <Integer>t = new StaticDemo2<Integer>();
     t.funA(j);
	}
void funA(S t)
{
	System.out.println(t);
}
}