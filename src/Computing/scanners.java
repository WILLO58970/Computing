package Computing;
import java.util.*;
public class scanners {

	public static void main(String[] args) {
		String animal;
		String age1;
		int age;
		int avelife = 82;
		int life;
		int maxlife;
		do{
		Scanner s= new Scanner(System.in);
		System.out.println("What animal are you?");
		animal=s.nextLine(); // input captured and stored in age
		s.close();
		
		if (animal.equals("Dog")){
			avelife = 13;
			maxlife = 30;
			System.out.println("The average Dog lives for 13 years");
			break;
		}
		else if (animal.equals("Cat")){
			avelife = 15;
			maxlife = 39;
			System.out.println("The average Cat lives for 13 years");
			break;
		}
		else if (animal.equals("Human")){
			avelife = 82;
			maxlife = 123;
			System.out.println("The average Person lives for 82 years");
			break;
		}
		else if (animal.equals("Goldfish")){
			avelife = 7;
			maxlife = 43;
			System.out.println("The average Goldfish lives for 7 years");
			break;
		}
		else{
			System.out.println("Why u lyin for?");
		}
		}while(true);
		
		age1=sc.nextLine(); // input captured and stored in age
		age = Integer.parseInt(age1);
	
		life = avelife - age;
		
		if (age>=18)
			if (age> avelife)
				if (age >= maxlife)
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
		sc.close();
	
	}
	
}