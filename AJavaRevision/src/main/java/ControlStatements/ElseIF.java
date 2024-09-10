package ControlStatements;

public class ElseIF 
{
	public static void verifyResult(int marks)
	{
		if(marks>=65 & marks <=100)
		{
			System.out.println("Congratualtions !!! Pass with distenctions ");
		}
		else if (marks<=64 & marks>=60 )
		{
			System.out.println("Congratulations !!! pass with 1st class");
		}
		else if(marks<=59 & marks>=45)
		{
			System.out.println("Congratulations !!! pass with 2nd class");
		}
		else if(marks <=44 & marks>=35)
		{
			System.out.println("Congratulations !!! pass");
		}
		else if (marks<35 & marks==0)
		{
			System.out.println("Better luck next time");
		}
		else if(marks>100 || marks <0)
		{
			System.out.println("Please enter marks between 0  to 100");
		}
	}

	public static void main(String[] args) {
		verifyResult(25);
		verifyResult(35);
		verifyResult(44);
		verifyResult(55);
		verifyResult(64);
		verifyResult(-1);
	}
}
