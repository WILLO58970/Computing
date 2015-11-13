package Computing;
import java.math.*;
import java.util.Scanner;

public class armstrongNumbers {

	public static void main(String[] args) {
		int result = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers do you want to add?");
		int num = sc.nextInt();
		
		System.out.println("What power do you want to use?");
		int power = sc.nextInt();
		
		int[] vars = new int[num];
		
		for(int i = 0; i < num; i++) {
		System.out.println("Enter next Digit:");
		vars[i] = sc.nextInt();
		  
		result = (int) (result + Math.pow(vars[i], power));
		String word = Integer.toString(result);
		String b = String.valueOf(vars[i]);
		String c = b + String.valueOf(vars[i]);
		if(i==word.length() && word==b){
			System.out.println("is an armstrong" + vars[i]);
		}
		else{
			System.out.println("nah bruv" + b);
		}
		}
		sc.close();
		
		}
		  

		
}
		

