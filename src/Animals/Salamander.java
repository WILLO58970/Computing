package Animals;

public class Salamander extends Amphibian{
	public Salamander(String name) {
		super(name);
	}
	public Salamander(String name,int dangerousness) {
		super(name);
		this.setDangerousness(dangerousness);
	}

	@Override
	public String walk(){
		return "*No*";
	}
	public String loseTail(){
		return "*Tail Broken*";
	}
}
