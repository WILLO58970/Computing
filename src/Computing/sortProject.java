package Computing;

class Main
{

	public static void printArray(int[] a)
	{
		int n = 0, l = a.length - 1;		
		do { 
			System.out.print(a[n++] + ",");						
		} while (n < l);
		System.out.println(a[l]);		
	}

	public static void main(String[] args)
	{

		int[] sortMe = {88, 6,	54,	6,	36,	83,	56,	18,	1,	77,	48,	39,	76,	69,	81,	94,	98,	34,	32,	56,
				53,	77,	30,	24,	24,	84,	93,	38,	91,	76,	15,	76,	58,	23,	97,	47,	59,	56,	26,	93,
				38,	44,	0,	3,	30,	47,	22,	55,	76,	13,	79,	15,	65,	61,	5,	38,	90,	79,	24,	98,
				4,	75,	3,	73,	72,	16,	11,	82,	78,	16,	89,	16,	22,	69,	71,	76,	19,	5,	58,	41,
				7,	45,	47,	78,	26,	97,	52,	30,	14,	22,	42,	36,	44,	69,	5,	27,	83,	7,	79,	94};

		int[] sortMeBackup = sortMe.clone();

		System.out.println();
		printArray(sortMe);

		int comparisons = 0, assignments = 0, temp = 0;

		//Bubble Sort
		for(int l=0;l<sortMe.length-1;++l){
			for(int j=0;j<sortMe.length-1;j++){
				comparisons++;
				if(sortMe[j]>sortMe[j+1]){
					assignments++;
					temp = sortMe[j];
					sortMe[j] = sortMe[j+1];
					sortMe[j+1]=temp;
				}
			}
		}	

		System.out.println();
		System.out.println("Bubble sort - No of comparisons: " + comparisons + ". No of assignments: " + assignments);
		System.out.println();		

		printArray(sortMe);	

		System.out.println();
		System.out.println("- - - - - - - - - - - - -");
		System.out.println();

		sortMe = sortMeBackup.clone();

		printArray(sortMe);					

		comparisons = 0; assignments = 0; temp = 0;

		//INSERTION SORT
		for(int pos=1;pos<sortMe.length;pos++){
			comparisons++;
			while(pos>0 && sortMe[pos]<sortMe[pos-1]){
				assignments++;
				temp = sortMe[pos];
				sortMe[pos]=sortMe[pos-1];
				sortMe[pos-1]=temp;
				--pos;
			}  
		}


		System.out.println();
		System.out.println("Insertion sort - No of comparisons: " + comparisons + ". No of assignments: " + assignments);
		System.out.println();		

		printArray(sortMe);


	}
}
