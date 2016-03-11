package Computing;
import java.util.Scanner;

public class Boolean_Algebra {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		while(true){
			System.out.println("Enter gate you want to see truth table of");
			String gate = sc.nextLine().toUpperCase();
			String i = "";
			String result = "";
			System.out.println("| A | B | R |");
			switch(gate){
			case "OR" :	
				while(!(i.equals("10"))){
					i = count(i);
					String aS = i.substring(0,1);
					String bS = i.substring(1,2);
					result = OR(aS.equals("1"),bS.equals("1")) ? "1" : "0";
					System.out.println("| " + aS + " | " + bS + " | " + result + " |");
				}
			case "AND" :
				while(!(i.equals("10"))){
					i = count(i);
					String aS = i.substring(0,1);
					String bS = i.substring(1,2);
					result = AND(aS.equals("1"),bS.equals("1")) ? "1" : "0";
					System.out.println("| " + aS + " | " + bS + " | " + result + " |");
				}
				break;
			case "XOR" :
				while(!(i.equals("10"))){
					i = count(i);
					String aS = i.substring(0,1);
					String bS = i.substring(1,2);
					result = XOR(aS.equals("1"),bS.equals("1")) ? "1" : "0";
					System.out.println("| " + aS + " | " + bS + " | " + result + " |");
				}
				break;
			case "NOT" :
				while(!(i.equals("10"))){
					i = count(i);
					String aS = i.substring(0,1);
					result = NOT(aS.equals("1")) ? "1" : "0";
					System.out.println("| " + aS + " | " + result + " |");
				}
				break;
			case "NAND" :
				while(!(i.equals("10"))){
					i = count(i);
					String aS = i.substring(0,1);
					String bS = i.substring(1,2);
					result = NOT(AND(aS.equals("1"),bS.equals("1"))) ? "1" : "0";
					System.out.println("| " + aS + " | " + bS + " | " + result + " |");
				}
				break;
			case "NOR" :
				while(!(i.equals("10"))){
					i = count(i);
					String aS = i.substring(0,1);
					String bS = i.substring(1,2);
					result = NOT(OR(aS.equals("1"),bS.equals("1"))) ? "1" : "0";
					System.out.println("| " + aS + " | " + bS + " | " + result + " |");
				}
				break;
			case "XNOR" :
				while(!(i.equals("10"))){
					i = count(i);
					String aS = i.substring(0,1);
					String bS = i.substring(1,2);
					result = NOT(XOR(aS.equals("1"),bS.equals("1"))) ? "1" : "0";
					System.out.println("| " + aS + " | " + bS + " | " + result + " |");
				}
				break;
			case "HELP" :
				System.out.println("Logic Gates: [AND][OR][XOR][NAND][NOR][NXOR]");
				System.out.println("Or type [CLOSE].");
				System.out.println("All commands are not case sensitive.");
				break;
			case "CLOSE" :
				sc.close();
				return;
			default: 
				System.out.println("Unknown Logic Gate type [help] for list of all logic gates");
			}
		}
	}
	public static boolean AND(boolean a,boolean b){
		if(a&b==true){
			return true;
		}
		return false;
	}
	public static boolean OR(boolean a,boolean b){
		if(XOR(a,b)==true||a==true && b==true){
			return true;
		}
		return false;
	}
	public static boolean XOR(boolean a,boolean b){
		if(a==!b){
			return true;
		}
		return false;
	}
	public static boolean NOT(boolean a){
		if(a==false){
			return true;
		}
		return false;
	}
	public static String count(String i){
		if(i.equals("00")){
			return "01";
		}else if(i.equals("01")){
			return "11";
		}else if(i.equals("11")){
			return "10";
		}
		return "00";
	}
}
