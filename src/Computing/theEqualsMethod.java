package Computing;

public class theEqualsMethod {
	public static void main(String args[]){
	
	String firstName = "Will";
	String lastName = "Otty";
	
	String fullName = (firstName + " " + lastName);
	//Output the String fullName
	System.out.println(fullName);
	// Does firstName have the same heap address as lastName? Output boolean false
	System.out.println(firstName.equals(lastName));
	
	String newNameOne = "Jediseadia";
	String newNameTwo = "Jediseadia";
	
	// Does Does newNameOne have the same heap address as newNameTwo? Output boolean true
	System.out.println(newNameOne.equals(newNameTwo));
	// Does Does newNameOne have the same heap address as newNameTwo? Output boolean true
	System.out.println(newNameOne==newNameTwo);
	// Does fullName have the same heap address as newNameOne? Output boolean false
	System.out.println(fullName==newNameOne);
	
	String greeting = "hello";
	// Outputs  starts at 0 so 1st-3rd letters so  = "hel"
	System.out.println(greeting.substring(0,3));
	
	String longPhraseOne = "floxinoxinihilipilification";
	System.out.println();
	String myFirstName = "Will";
	String myLastName = "Otty";
	String myFullName = (firstName + " " + lastName);



	String anotherFirstName = "Will";
	String anotherLastName = new String ("Otty");

	System.out.println(myFullName);
	//Outputs "Will Otty"

	System.out.println(myFirstName.equals(anotherFirstName));
	//Outputs true

	System.out.println(myLastName == anotherLastName);
	//Outputs false
}  
}