package Computing;
import java.util.*;
interface Animal{
	
	void eat(String food);
	void sleep(int hrsSleep);
	void age(int age);
	void mate(boolean mate);
}

public class Interfaces implements Animal{
	
	String[]a = {"KFC","Apples", "Bananas","Bone"};
	
	@Override
	public void eat(String food) {
		int i = new Random().nextInt(a.length);
		food = (a[i]);
		System.out.print(food);
		System.out.println();
		
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
	public static void main(String[] args) {
		Interfaces Dog = new Interfaces();
		System.out.println("*******Dog*******");
		Dog.eat("");
		Dog.age(0);
		
	    
		
		
		
		
	}
}

	
