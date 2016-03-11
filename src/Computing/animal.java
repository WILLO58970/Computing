package Computing;

import java.util.*;
interface Animal1{
	
	void eat(String food);
	void sleep(int hrsSleep);
	void age(int age);
	void mate(boolean mate);
}

public class animal implements Animal1{
	
	String[]a = {"KFC","Apples", "Bananas","Bone"};
	
	@Override
	public void eat(String food) {
		int i = new Random().nextInt(a.length);
		String food1 = (a[i]);
		if(food.equals(food1)){
			System.out.println("The animal eats his favourite food " + food1);
		}else{
			System.out.println("The animal doesn't eat it's favourite food " + food1 + " instead it eats " + food);
		}
		
	}

	@Override
	public void sleep(int hrsSleep) {
		Random rand = new Random();
	    hrsSleep = rand.nextInt((10 - 2) + 1) + 2;
		System.out.println(hrsSleep);
		
	}

	@Override
	public void age(int age) {
		System.out.println(age);
	}

	@Override
	public void mate(boolean mate) {
		System.out.println(mate);
		
	}
	public void name() {
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		animal Dog = new animal();
		System.out.println("*******Dog*******");
		System.out.println("Enter Fav food");
		String food = sc.nextLine();
		System.out.println("Enter Age");
		int age = sc.nextInt();
		Dog.eat(food);
		Dog.age(age);
		sc.close();
	    
		
		
		
		
	}
}

	
