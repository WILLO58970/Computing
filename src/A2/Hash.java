package A2;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

import javax.xml.bind.DatatypeConverter;

public class Hash {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			
			System.out.println("| Hash Map | Hash | Encryted Hash | Exit |");
			String program  = sc.next().toUpperCase();
			switch (program) {

			case "HASH":
				System.out.println("What word would you like the hash of?");
				String a = sc.next();
				int count = 0;
				char[] StringArray = a.toCharArray();
				for(char currchar : StringArray){
					count += currchar;
				}
				System.out.println( "Hash: " +(count % 256));
				break;
			case "HASH MAP":
				HashMap<String,ArrayList<String>> particles = new HashMap<>();

				//Creates Arrays
				String[]Quarks = {"Up","Down","Charm","Strange","Top","Bottom"};
				String[]Leptons = {"Up","Down","Charm","Strange","Top","Bottom"};
				String[]Bosons = {"Up","Down","Charm","Strange","Top","Bottom"};
				//Converts Array to Arraylist and puts into HashMap
				particles.put("Quarks", new ArrayList<String>(Arrays.asList(Quarks)));
				particles.put("Leptons", new ArrayList<String>(Arrays.asList(Leptons)));
				particles.put("Bosons", new ArrayList<String>(Arrays.asList(Bosons)));
				break;
			case "ENCRYPTED HASH":
				System.out.println("Enrypted Hash Program");
				String text = sc.next();
				String output;
				try {
					MessageDigest hasher = MessageDigest.getInstance("MD5");
					hasher.update(text.getBytes());
					output =  DatatypeConverter.printHexBinary(hasher.digest()).toUpperCase();
				} catch (NoSuchAlgorithmException nsae) {
					output =  nsae.getMessage();
				}
				System.out.println(output);
				break;
			case "EXIT":
				System.out.println("Would you like to exit?");
				sc.close();
				break;
			}		
		}
	}
}









