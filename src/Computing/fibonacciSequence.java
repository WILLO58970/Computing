package Computing;

import java.util.Scanner;

public class fibonacciSequence {

	public static void main(String[] args) {
		int maxcount = 1;
		int last = 0;
		int first = 1;
		int result = 1;
		Scanner s= new Scanner(System.in);
		System.out.println("How many numbers in the Fibinacce Sequence do you want");
		maxcount=s.nextInt(); 
		s.close();
		for(int currentcount = 0; maxcount > currentcount; currentcount++){
			result = first + last;
			first = last;
			last = result;
			System.out.println(result);
		}
		

	}

}
