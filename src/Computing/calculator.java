package Computing;

public class calculator {
	private float numone=0;
	private float numtwo=0;
	
	
	public calculator(){
		
	}
	public float getNumone(){
		return numone;
	}
	public float getNumtwo(){
		return numtwo;
	}
	public float getNumthree(){
		return numtwo;
	}
	public void setNumone(float numone){
		this.numone = numone;
	}
	public void setNumtwo(float numtwo){
		this.numtwo = numtwo;
	}
	public float add(){
	return numone + numtwo;
	}
	public float subtract(float numthree){
		return numone - numtwo;
	}
	public float divide(){
		return numone * numtwo;
	}
	public float multiply(){
		return numone / numtwo;
	}

}
