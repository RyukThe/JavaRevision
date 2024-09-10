package Methods;

public class Class1 
{
	public void add(int a,int b)
	{
		System.out.println("Sum of "+(a)+ " and "+(b) + " is "+ (a+b) );
	}

	public static void  multiplication(int a,int b)
	{
		System.out.println(" Multiplication of "+(a)+ " and "+(b) + " is "+ (a*b) );
	}
	
	public static void main(String[] args)
	{
		multiplication(1, 8);
		Class1 c= new Class1();
		c.add(47, 74);
		
	}
}
