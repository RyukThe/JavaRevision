package TypeOfVariable;

public class LocalVariable {

static int  b=45;
int c=45;
	public static void m1(int a)
	{
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		LocalVariable v= new LocalVariable();
		
		m1(15+v.c);
		System.out.println(b);
	}
}
