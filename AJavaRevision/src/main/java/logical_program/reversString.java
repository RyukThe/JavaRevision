package logical_program;

public class reversString {

	public static void main(String[] args) {
		
		String s="Saurav";
	
		for(int i=s.length()-1;i>=0;i--)
		{
			char ch=s.charAt(i);
			System.out.print(ch);
	
			
		}
		System.out.println();
		reverseString("Saurav");
	}
	
	
	public static void reverseString(String s)
	{
		String revs="";
		
		for(int i=s.length()-1;i>=0;i--)

		{
			revs=revs+s.charAt(i);
	
		}
		
		System.out.println(revs);
	}
}
