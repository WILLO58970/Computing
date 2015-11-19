package Computing;

public class BinarySearch {
	static int[]a = {56,2,22,8,2};
	static int x = 22;

	public static void main(String[] args) {
		System.out.println(binarySearch(a,x)?"Value found": "Not there");
		System.out.println();
	}
	public static boolean binarySearch(int[]a,int searchValue){
		int start = 0;
		int end = a.length - 1;
		for(int i = 0; i<a.length;i++){
			int middle = (end-start)/2;
			if(a[i] == searchValue){
				return true;
			}else if(a[middle]> searchValue){
			}else{
				start = middle +1;
				
			}
			}
		return false;
		}
}
