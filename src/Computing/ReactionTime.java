package Computing;

import java.util.Scanner;

public class ReactionTime {
	static long quickest;
	public static void main(String[] args) throws InterruptedException {	
		while(true){
			System.out.println("Enter to start");
			Scanner sc = new Scanner(System.in);
			sc.nextLine();
			Thread.sleep((long)(Math.random() * 3000 + 3000));
			long start = System.currentTimeMillis();
			System.out.println("BEEP");
			sc.nextLine();
			long finale = System.currentTimeMillis() - start;
			System.out.println("Done: " + finale +"ms");
			if(quickest>finale){
				System.out.println("New Best you were " + (quickest-finale) + "ms faster.");
				quickest = finale;
			}else if(quickest==finale){
				System.out.println("You matched your time of " + quickest + "ms");
			}else{
				System.out.println("You didnt beat your time, you were " + (finale-quickest) + "ms slower.");
			}
			System.out.println("Do you want to start again [y/n]");
			String again = sc.nextLine();
			
			if(again.equals("n")){
				sc.close();
				return;
			}
		}
	}
}