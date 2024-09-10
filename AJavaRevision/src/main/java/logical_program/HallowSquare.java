package logical_program;

//import javax.management.openmbean.OpenMBeanAttributeInfo;

public class HallowSquare {
	public static void hallowsquare(int rownumber,int colnumber)
	{
		for(int i=1;i<=rownumber;i++)
		{
			for(int j=1;j<=colnumber;j++)
			{
				if(i==1||j==1||i==rownumber||j==colnumber)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		hallowsquare(5, 5);
		
		
	}
}
