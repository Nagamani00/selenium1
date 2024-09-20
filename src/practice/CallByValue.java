package practice;

public class CallByValue 
{ 
	int data = 50;
 void change (CallByValue op)
 {
	op.data = op.data+100; 
 }

	public static void main(String[] args)
	{
		CallByValue op	= new CallByValue ();
		System.out.println("before change"+op.data);
		op.change(op);
		System.out.println("after change"+op.data);
		
	}

}
