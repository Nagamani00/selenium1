package JavaPractice;

public class ArrayLogicDemo1 
{

	public static void main(String[] args) 
	{
	int arr[]={10,20,30,40,50};	
	int firstIndex=0;	
	int arraySize = arr.length;	
	System.out.println(arraySize); //arr.length-1	
	int lastIndex = arraySize-1;  
	System.out.println(lastIndex);	
	int arr2[][]=new int[3][4];	
	int rowCount = arr2.length;	
	System.out.println(rowCount);	
	int coloumnCount = arr2[0].length;	
	System.out.println(coloumnCount);	

	}

}
