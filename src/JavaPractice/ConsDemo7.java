package JavaPractice;

public class ConsDemo7
{
	static int collegeId = 15;
	 int stdId ;
	 int stdPhone;

		public static void main(String[] args) 
		{
			 ConsDemo7 ramesh = new ConsDemo7();
			 ramesh.stdId = 1;
			ramesh.stdPhone = 96666;
			System.out.println(collegeId);
			System.out.println(ramesh.stdId);
			System.out.println(ramesh.stdPhone);
			
			ConsDemo7 suresh = new ConsDemo7();
			suresh.stdId = 2;
			suresh.stdPhone = 96667;
			
			System.out.println(collegeId);
			System.out.println(suresh.stdId);
			System.out.println(suresh.stdPhone);
			
			
			
		}


}
