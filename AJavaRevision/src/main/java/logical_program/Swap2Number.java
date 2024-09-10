package logical_program;

public class Swap2Number {

	public static void main(String[] args) {
		
		
		int a=10;
	
		int b=20;
		int c=0;
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		c=a;
		a=b;
		b=c;

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}
	
	
	void swap()
	{
		int first=10;
		int second=20;int temp=0;
		
		System.out.println(first);
		System.out.println(second);
		temp=first;
		first=second;
		second=temp;
		
		System.out.println(first);
		System.out.println(second);
	}
}
