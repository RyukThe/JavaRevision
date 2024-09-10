package ControlStatements;

public class ifElse {

	
	public static void verifyResult( int marks)
	{
		if(marks>=35)
		{
			System.out.println("Congratulations !!! Your are Pass");
		}
		else
		{
			System.out.println("Better Luck Next time!!!");
		}
	
		
	}
	
	public static void main(String[] args) {
		verifyResult(35);
		System.out.println("-------------------");
		verifyResult(1);
	}
}
