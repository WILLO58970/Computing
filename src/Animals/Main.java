package Animals;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Frog frogm8 = new Frog("Frogm8");
		Salamander dave = new Salamander("Dave");
		Amphibian fred = new Amphibian("Fred");

		ArrayList<Amphibian> amp = new ArrayList<>();
		amp.add(fred);
		amp.add(dave);
		amp.add(frogm8);

		for(Amphibian x: amp){
			System.out.println(x.getName());
			System.out.println("Is the animal dead?: " + x.getIsded());
			System.out.println("Message: " + x.getMessage());
			System.out.println("Dangerousness: " + x.getDangerousness());
			System.out.println(x.breathe(true) + " " +x.walk());

			if(x.getClass().equals(Frog.class)){
				System.out.println(((Frog)x).croak(false));
			}
			if(x.getClass().equals(Salamander.class)){
				System.out.println(((Salamander)x).loseTail());
			}
			System.out.println();
		}
	}
}
