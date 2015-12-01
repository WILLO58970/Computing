package Computing;

public class Linked_List {
	private Link first;
	
	public Linked_List(){
		first = null;
	}
	public boolean isEmpty(){
		return (first==null);
	}
	public void insertFirst(String name,int age, String favBand, boolean inARelationship){
		
		Link Link = new Link(name,age,favBand,inARelationship);
		if(first!= null){
			Link.setNextLink(first);
			first = Link;
		}else{
			first = Link;
		}
	}
	public Link LinkDeleteFirst(){
		Link deletedLink = first;
		first = first.getNextLink();
		return deletedLink;
	}
	public void LinkFind() {
		
		
	}
	public Link LinkDeleteSelected(){
		Link deletedLink = first;
		//here
		first = first.getNextLink();
		return deletedLink;
	}
	public void displayList(){
		System.out.println("list (first-->last): ");
		Link current = first;
		while(current!=null){
			current.displayLink();
			current = current.getNextLink();
		}
		System.out.println();
	}
	
	
	
	
}
