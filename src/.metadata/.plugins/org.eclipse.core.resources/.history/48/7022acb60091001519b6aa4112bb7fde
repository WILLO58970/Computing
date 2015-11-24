package Computing;

public class BinarySearch {
	static int[]a = {56,20,22,8,2,7,34,67};
	static int x = 2;

	public static void main(String[] args) {
		String r = binarySearch(a,x)?"Value found": "Not there";
		System.out.println(r);
	}
	public static boolean binarySearch(int[]a,int searchValue){
		int start = 0;
		int end = a.length - 1;
		
		
		for(int i = 0; i<a.length;i++){
			int middle = (end+start)/2;
			if(a[middle] == searchValue){
				return true;
			}else if(a[middle]>searchValue){
				end = middle-1;
			}else{
				start = middle +1;
			}
			}
		return false;
		}
}
