package Computing;
import java.util.Scanner;
public class EvenOrOdd {

		public static void main(String[] args) {
			int inputNum;
			int remainder;
			Scanner s= new Scanner(System.in);
			System.out.println();
			inputNum=s.nextInt(); 
			remainder = inputNum %2;
			if(remainder == 0){
				System.out.println("The number is even");
			}else{ 
				System.out.println("Number is Odd");
		}
			s.close();
	}
}