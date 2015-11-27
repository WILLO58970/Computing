package Computing;

import java.util.Scanner;

public class Queue {
	private int max;
	private long[] a;
	private int head;
	private int tail;
	private int nItems;
	
	public Queue(int s){
		max=s;
		a= new long[max];
		head=0;
		tail=-1;
		nItems=0;
	}
	public void insert(long j){
		String r= tail == max-1? "Queue full" : addItem(j);
		System.out.println(r);
	}
	public String addItem(long j){
		a[++tail]=j;
		nItems++;
		return "Item added";
	}
	public void remove(){
		String r= tail ==-1?"Empty Queue": removeItem();
		System.out.println(r);
	}
	
	public String removeItem(){
		 long removedItem = a[head++];
		 nItems--;
		 return "The item " + removedItem + " was removed from the queue";
		 }
	
	public boolean isEmpty(){
		 return nItems==0;
		 }


		 public boolean isFull(){
		 return nItems==max;
		 }
		 
		 public int numItemsInQueue(){
		 return nItems;
		 }
		 
		 public long peek(){
		 return a[head];
		 }
		 
		 public long[] getArray(){
		 return a;
		 }
		 public static void main(String[] args) {
			 int queueSize =0;

			 System.out.print("enter a queue size ");
			 Scanner sc = new Scanner(System.in);
			 queueSize=sc.nextInt();
			 sc.close();

			 Queue linearQueue = new Queue(queueSize);


			 for(int i=0; i<queueSize;i++){
				 
			 linearQueue.addItem((long)(Math.random()*queueSize));
			 }

			 long[] x = linearQueue.getArray();
			 
			 for(int i=0; i<queueSize; i++){
			 System.out.print(x[i] + " ");
			 }

			 System.out.println();
			 linearQueue.remove();
			 
			 for(int i=1; i<queueSize; i++){
			 System.out.print(x[i] + " ");

			 }
		}
		 
}
