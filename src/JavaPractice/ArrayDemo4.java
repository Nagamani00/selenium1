package JavaPractice;

import JavaPractice.Ramesh2;

public class ArrayDemo4 
{

	public static void main(String[] args) 
	{
		
		Ramesh2 r = new Ramesh2();
		
		Ramesh2 k[]= new Ramesh2[5];
		k[0]= new Ramesh2();
		k[1]= new Ramesh2();
		k[2]= r;
		k[3]= new Ramesh2();
		
		System.out.println(k[2]);
		System.out.println(r);
		

	}
}
