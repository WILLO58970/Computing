package Computing;

import java.util.Scanner;

public class charCounter {
	public static void main(String[]args ){
	int count = 0;
	String str = "helloslkhellodjladfjhello";
    String findStr = "hello";
	Scanner scan = new Scanner(System.in);
    System.out.println("Enter the word you would like to count");
    str = scan.nextLine();
    System.out.println("What character would you like to count");
    findStr = scan.nextLine();
    scan.close();
    int lastIndex = 0;
    while(lastIndex != -1){
        lastIndex = str.indexOf(findStr,lastIndex);
        if(lastIndex != -1){
            count ++;
            lastIndex += findStr.length();
            }
    }
    System.out.println("The word "+ str + " contains " +count + " " + findStr +"'s");
	}
}
