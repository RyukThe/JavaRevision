package loops;

import java.util.Scanner;

public class doWhile1 
{
	public static void m1()
	{
		System.out.println("Enter number");
		Scanner sc= new Scanner(System.in);
		int num;
		do 
		{
			num=sc.nextInt();
			System.out.println("Please enter number between 10 to 50");
		}while(num<10||num>50);
		
		for(int i=num;i<=50;i++)
		{
			int count=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					count++;
					break;
				}
				
				
			}
			if(count==0)
			{
				System.out.println(i +" is prime number");
			}
				
		}
	}

	public static void main(String[] args) {
		m1();
	}
}
