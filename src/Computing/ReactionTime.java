package Computing;

import java.util.Scanner;

public class ReactionTime {
	static long quickest;
	
	public static void main(String[] args) throws InterruptedException {	
		Scanner sc = new Scanner(System.in);
		long []a =  {976567,34,7,5,5677,5567,7,56,7677,67867};
		while(true){
			System.out.println("Enter to start");
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
			//top 10
			
			long low = 0;
			long high = a.length - 1;
	 
			quickSort(a, low, high);
			
			
			System.out.println("Do you want to start again [y/n]");
			String again = sc.nextLine();
			
			if(again.equals("n")){
				sc.close();
				return;
			}
		}
	}
	public static void quickSort(long[] a, long low, long high) {
		if (a == null || a.length == 0)
			return;
		if (low >= high)
			return;

		int middle = (int)(low + (high - low) / 2);
		long pivot = a[middle];

		int i = (int)low, j = (int)high;
		while (i <= j) {
			while (a[i] < pivot) {
				i++;
			}
 
			while (a[j] > pivot) {
				j--;
			}
 
			if (i <= j) {
				long temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
			}
		}
		if (low < j)
			quickSort(a, low, j);
 
		if (high > i)
			quickSort(a, i, high);
	}
}