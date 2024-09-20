package JavaPractice;


public class PolyDemo2
{

	public static void main(String[]args)
{
		PolyDemo2 p1 = new PolyDemo2(); 	
        p1.funA();
        p1.funA(10);
        p1.funA(10.0f);
        p1.funA(20.0);


}
void funA()
{
System.out.println("zero args of funA");
}
void funA(int a)
{
System.out.println("int args of funA");
}	
void funA(long b)
{
System.out.println("long args of funA");
System.out.println(b);
}		

//void funA(float c)
//{
//System.out.println("float args of funA");
//}		
void funA(double d)
{
System.out.println("double args of funA");
}		

void funA(char a)
{
System.out.println("char args of funA");
}		
void funA(boolean a)
{
System.out.println("boolaen args of funA");


}
 

}
