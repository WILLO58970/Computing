package Computing;

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
		String r= rear == max-1? "Queue full" : addItem(j);
	}
	public void addItem(long j){
		a[++tail]=j;
		nItems++;
		return "Item added";
	}
	public void remove(){
		String r= tail ==-1?"Empty Queue": removeItem();
		System.out.println(r);
	}
}
