package Computing;

import java.util.Scanner;

public class pets {

	public static void main(String[] args) {
		int numPets;
		Scanner s= new Scanner(System.in);
		System.out.println("How many Pets Have you got?");
		numPets=s.nextInt(); 
		String petStatus = (numPets < 4) ? "Within Limit": "Wxceeded Limit";
		System.out.println("the pet status is : " + petStatus);
	}

}
