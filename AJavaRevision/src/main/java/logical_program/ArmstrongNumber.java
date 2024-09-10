package logical_program;

public class ArmstrongNumber {

	
	//a number which is equal to sum of cube of its each digit
	
	
	public static void main(String[] args) {
		
for(int i=1;i<=10000;i++)
{
	int sum=0;
	for(int j=i;j>0;j=j/10)
	{
		int rem=j%10;
		sum=sum+(rem*rem*rem);
	}
	
	if(sum==i)
	{
		System.out.println(i);
	}
}
	
	}}
