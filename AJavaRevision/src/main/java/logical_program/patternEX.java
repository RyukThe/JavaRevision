package logical_program;

public class patternEX {
	 public static void main(String[] args) {
	        int star = 3;
	        int space = 1;

	        for (int i = 1; i <= 5; i++) {
	            for (int j = 1; j <= space; j++) {
	                if (i == 1 || i == 5 || j == 1 || j == space) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }

	            System.out.println();
	            space++;
	            star -= 2;
	        }
	    }
	}
