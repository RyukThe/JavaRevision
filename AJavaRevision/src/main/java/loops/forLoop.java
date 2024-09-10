package loops;

public class forLoop {

	
	public static void table(int no)
	{
		System.out.println( "Table of " + no + "  is as belwo");
		for(int i=no;i<=no*10;i=i+no)
		{
			System.out.println(i);
		}
		  
	}
	public static void main(String[] args) {
		table(3);
		table(30);
		
	}
}
