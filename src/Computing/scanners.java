package Computing;
import java.util.*;
public class scanners {

	public static void main(String[] args) {
		checkEligibility();//the method is called in the main
		
	}
	static void checkEligibility(){
		String age1;
		int life;
		Scanner sc= new Scanner(System.in);
		System.out.println("What is your age?");
		age1=sc.nextLine(); // input captured and stored in age
		life = 82 - age;
		if (age1==(int)age1){
			age = Integer.parseInt(age)}
		if (age>=18)
			if (age> 82)
				if (age >= 123)
					System.out.println("Why You lying for?");
				else
				System.out.println("You're too old you should be dead");
			else
			System.out.println("You Are old enough to get married\nYou will die in approximately " + life);
		else if(age < 18)
				if(age < 0)  
					System.out.println("Why You lying for?");
				else
					System.out.println("You're to young to get married\nYou will die in approximately " + life + "Years");
		else
			System.out.println("The input Is not an interger");
	
	}
	
}