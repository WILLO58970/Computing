package Computing;
import java.util.Scanner;
public class QuizGrade {

		public static void main(String[] args) {
			int quizscore;
			int midscore;
			int finalscore;
			int overall;
			
			Scanner q= new Scanner(System.in);
			System.out.println("What percentage did you get in your quiz?");
			quizscore=q.nextInt(); 
			
			Scanner m= new Scanner(System.in);
			System.out.println("What percentage did you get in your midterm test?");
			midscore=m.nextInt();
			
			Scanner f= new Scanner(System.in);
			System.out.println("What percentage did you get in your final test?");
			finalscore=f.nextInt();
			
			overall = (quizscore + midscore + finalscore)/3;
			
			q.close();
			m.close();
			f.close();
			if (overall <=90 && overall>=80){
			System.out.println("Grade = A " + overall);
			
			if (overall <80 && overall>=80){
				System.out.println("Grade = A " + overall);
			}else if (overall <90 && overall>=80){
					System.out.println("Grade = A " + overall);
					}
			}else if (overall <90 && overall>=80){
				System.out.println("Grade = A " + overall);
				}
				}
			}
