package ControlStatements;

public class nestedIf 
{
	public static void verifyMarks(int marks,int mains)
	{
		if(marks>=300)
		{
			System.out.println("Congratualtions eligible for mains ");
			
		
			if(mains>=450)
			{
				System.out.println("Congratualtions Selected for interview round");
			}
			else
			{
				System.out.println("Hard luck!!! not eligible for interview round");
			}
		}
		else
		{
			System.out.println("Better Luck not eligible for mains this time");
		}
	}

	public static void main(String[] args) {
		verifyMarks(340, 470);
		verifyMarks(299, 00);
		verifyMarks(356, 124);
	}
}
