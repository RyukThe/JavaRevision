package logical_program;

public class reverseNumber {

	public static void main(String[] args) {
		
		int n=28545754;
		int count=0;
		for(int i=n;i>0;i=i/10)
		{
			int rem=i%10;
			count=(count*10)+(rem);
		}
		
		System.out.println(count);
		
		int num2=78477454;
		String s=Integer.toString(num2);
		
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		
		int revint = Integer.parseInt(rev);
		
		System.out.println(revint);
	}
	
	

	
}
