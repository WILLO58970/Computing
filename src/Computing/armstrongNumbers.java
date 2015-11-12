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
		  if(i==0){
			  System.out.println("Enter First Number");
		  }
		  else{
			  System.out.println("Enter next Number:");
		  }
		  vars[i] = sc.nextInt();
		  
		  result = (int) (result + Math.pow(vars[i], power));
		String word = Integer.toString(vars[i]);
		System.out.println(word);
		}
		sc.close();
		
		}
		  

		
}
		

