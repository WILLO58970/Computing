package Computing;

public class Calcultor_Controller {

	public static void main(String[] args) {
		float numOne, numTwo;
		
		calculator calculatorOne = new calculator();
		numOne =Float.parseFloat(args[0]);
		numTwo =Float.parseFloat(args[1]);
		
		calculatorOne.setNumone(numOne);
		calculatorOne.setNumtwo(numTwo);
		System.out.println("Add " + calculatorOne.add());
		System.out.println("Subtract " + calculatorOne.add());
		System.out.println("Multiply " + calculatorOne.multiply());
		System.out.println("Multiply " + calculatorOne.divide());
	}

}
