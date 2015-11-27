package Computing;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class SortSearch {
	 private static int[] a;
	 static Random rand = new Random();
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length of array you want");
		int c = sc.nextInt();
		
	    a = new int[c];
	    for(int i=0;i<a.length;i++)
	    {
	    	int randomNum = (int)rand.nextInt(100-0);
	        a[i] = randomNum ;
	        
	    }
	    System.out.println(Arrays.toString(a));
	
	    
	    
	    int temp = 0;
		for(int pos=1;pos<a.length;pos++){
			while(pos>0 && a[pos]<a[pos-1]){
				temp = a[pos];
				a[pos]=a[pos-1];
				a[pos-1]=temp;
				--pos;
			}
	    
	    }
		System.out.println(Arrays.toString(a));
		
		
		System.out.print("Enter number that may be in array: ");
		int y = sc.nextInt();
		sc.close();
		System.out.println(linearSearch(a,y)?"Value found": "Not there");
		
		
		
	}		
	public static boolean linearSearch(int[]a,int searchValue){

		for(int i = 0;i<a.length;i++){
		if(a[i]==searchValue){
			return true;
		}
	}
		return false;
	}

}
