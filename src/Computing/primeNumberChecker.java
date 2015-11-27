package Computing;
import java.util.Scanner;
import java.lang.Math;

public class primeNumberChecker {
	
	public static void main(String[]args){
		int n;
		int remainder = 1;
		Scanner in = new Scanner(System.in);
	      System.out.println("Enter the number ");
	      n = in.nextInt();
	      for ( int j = 2 ; j <= Math.sqrt(n) ; j++ )
	         {
	            if ( n%j == 0 )
	            {
	            	remainder = 0;
	               break;
	            }
	         }
	         if ( remainder != 0 )
	         {
	        	 System.out.println("The number is a Prime");
	     }         
	         else{
	        	 System.out.println("The Number not a Prime");
	         }
	      in.close();
	      
	}
}
	      

