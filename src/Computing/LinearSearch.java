package Computing;
import java.util.Scanner;
public class LinearSearch {
static int[] a={1,3,5,2,4,6};
public static boolean LinearSearch(int[]a,int searchValue){
	for(int i = 0;i<a.length;i++){
	if(a[i]==searchValue){
		return true;
	}
}
	return false;
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number that may be in array: ");
		int y = sc.nextInt();
		sc.close();
		System.out.println(LinearSearch(a,y)?"Value found": "Not there");

	}

}
