package Computing;
import java.util.*;


class binarychecker{
    public static void main(String[]args){
    	double input;
	
	Scanner s= new Scanner(System.in);
	System.out.println("What number do you want to check is binary?");
	input=s.nextDouble();
	String b = String.valueOf(input);
	
	if(b.contains("2")||b.contains("3")||b.contains("4")||b.contains("5")||b.contains("6")||b.contains("7")||b.contains("8")||b.contains("9")){
	System.out.println("The number is not a binary");
	}else{ 
	System.out.println("Number is a binary");
	}
	s.close();
	}
}