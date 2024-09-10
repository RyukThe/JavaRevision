package loops;

public class whileloop 
{
	public void table(int no)
	{
		int i=no;
		while(i<=no*10)
		{
			System.out.println(i);
			i=i+no;
		}
	}

	public static void main(String[] args) {
		whileloop w=new whileloop();
		w.table(1);
	}
}
