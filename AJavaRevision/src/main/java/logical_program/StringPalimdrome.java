package logical_program;

public class StringPalimdrome {

	
	public static void checkStringPalimdrome(String s)
	{
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		
		if(rev.equals(s))
		{
			System.out.println("Given String is Palimdrome");
		}else
		{
			System.out.println("Given String is not Palimdrome");
		}
	}
	
	public static void main(String[] args) {
		checkStringPalimdrome("Saurav");
	}
}
