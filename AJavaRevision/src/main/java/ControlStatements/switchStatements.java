package ControlStatements;

public class switchStatements 
{
	public static void calculator(String input,int a,int b)
	{
		switch(input)
		{
		case "Add":
			System.out.println("Addtions of "+ (a) +" + " +(b)+" = "+ (a+b));
			break;
		case "Mul":
			System.out.println("Multiplications of "+ (a) +" * " +(b)+" = "+ (a*b));
			break;
		case "Div":
			System.out.println("Division of "+ (a) +" / " +(b)+" = "+ (a/b));
		break;
		case "sub":
			System.out.println("Subtarction of "+ (a) +" - " +(b)+" = "+ (a-b));
		break;
		default:System.out.println("Please pass valid input");
		}
	}

	public static void main(String[] args) {
		calculator("sub", 1, 50);
	}
}
