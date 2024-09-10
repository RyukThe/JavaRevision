package loops;

public class doWhile
{
	public static void  loop(int num)
	{
		int  i=num;
		do
		{
			System.out.println(i);
			i++;
		}while(i<=10 );
	}

	public static void main(String[] args) {
	loop(1);
	}
}
