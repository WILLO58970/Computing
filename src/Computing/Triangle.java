package Computing;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		int count = 0;
		int numlines = 1;
		int maxcount = 1;
		Scanner s= new Scanner(System.in);
		numlines=s.nextInt(); 
		for(int i=0; i<numlines; i++){
			
			for(int j=0;j<maxcount; j++){
				count++;
				System.out.print(count);
			}
			maxcount++;
			System.out.println();
		}
		s.close();
	}
}
