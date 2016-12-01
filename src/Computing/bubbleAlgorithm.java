package Computing;

import java.util.Arrays;
import java.util.Scanner;

public class bubbleAlgorithm {
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter how many numbers you want to sort:");
		int temp;
		int num = sc.nextInt();
		int[] vars = new int[num];

		for(int i = 0; i < num; i++) {
			System.out.println("Enter next number:");
			vars[i] = sc.nextInt();
		}

		for(int l=0;l<vars.length-1;++l){
			for(int j=0;j<vars.length-1;j++){
				if(vars[j]>vars[j+1]){
					temp = vars[j];
					vars[j] = vars[j+1];
					vars[j+1]=temp;
				}
			}
		}	
		System.out.println(Arrays.toString(vars));
		sc.close();
	}
}
