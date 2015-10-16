package Computing;
import java.util.*;
public class scanners {

	public static void main(String[] args) {
		checkEligibility();//the method is called in the main
		
	}
	static void checkEligibility(){
		int age;
		int life;
		Scanner sc= new Scanner(System.in);
		System.out.println("What is your age?");
		age=sc.nextInt(); // input captured and stored in age
		life = 82 - age;
		if (age>=18)
			if (age> 82)
				if (age >= 123)
					System.out.println("Why You lying for?");
				else
				System.out.println("You're too old you should be dead");
			else
			System.out.println("YOU CAN BUY ALCOHOL!!\nYou will die in approximately " + life);
		else if(age < 18)
				if(age < 0)  
					System.out.println("Why You lying for?");
				else
					System.out.println("You're to young to buy alcohol\nYou will die in approximately " + life + "Years");
	
	}
	
}