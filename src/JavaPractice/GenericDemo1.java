package JavaPractice;

public class GenericDemo1<G> 
{
 G g1;
	public static void main(String[] args) 
	{
		GenericDemo1 g1 = new GenericDemo1();	
		g1.funA(10);  //g1.funA(new Integer(10));
		g1.funA(true);  //g1.funA(new Boolean(true));
		g1.funA(new A()); // Annonymous object
		g1.funA("RBG technologies"); // literal object
		
	}
	
void funA(G k1)		
{
	System.out.println(k1);
		
	}

}
