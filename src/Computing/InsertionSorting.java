package Computing;
import java.util.*;
public class InsertionSorting {

	public static void main(String[] args) {
		double start = System.nanoTime();
		int[] a = {22,5,56,49,2};
		int temp = 0;
		for(int pos=1;pos<a.length;pos++){
			while(pos>0 && a[pos]<a[pos-1]){
				temp = a[pos];
				a[pos]=a[pos-1];
				a[pos-1]=temp;
				--pos;//pre-decrement
			}
		}
System.out.println(Arrays.toString(a));
double end = System.nanoTime();

System.out.println("it took " + (end-start) + " nano-seconds");
	}

}
