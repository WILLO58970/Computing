package Computing;

public class switchStatements {

	public static void main(String[] args) {
		char grade = 'C';
		switch(grade) {
		case 'A' :
			System.out.println("Excellent");
			break;
		case 'B' :
			System.out.println("Well Done");
			break;
		case 'C' :
			System.out.println("You Passed");
			break;
		case 'D' :
			System.out.println("You Didn't Pass");
			break;
		case 'F' :
			System.out.println("Commit");
			break;
			default :
				System.out.println("Invalid Grade");
		}
		System.out.println("Your grade is " + grade);
	}

}
