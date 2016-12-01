package Animals;

public abstract class Animal {
	private String Name;
	private int Dangerousness;
	private String Message;
	private boolean isded;
	
	public Animal(String name, int dangerousness, String message,boolean isdead) {
		this.Name = name;
		this.Dangerousness = dangerousness;
		this.Message = message;
		this.isded = isdead;
	}
	public Animal(String name) {
		this.Name = name;
		this.Dangerousness = (int)(Math.random()*10);
		this.Message = name + " is alive";
		this.isded = false;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getDangerousness() {
		return Dangerousness;
	}
	public void setDangerousness(int dangerousness) {
		Dangerousness = dangerousness;
	}
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	public boolean getIsded() {
		return isded;
	}
	public void setIsded(boolean isded) {
		this.isded = isded;
	}
	public String breathe(boolean isbreathing){
		if(isbreathing = false){
			isded = true;
			return "*Ded*";
		}
		return "*Breathes*";
		
	}
	public String walk(){
		return "*Step*";
	}
}