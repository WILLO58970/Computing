package Animals;

public class Amphibian extends Animal{

	private int swimmingSpeed;
	public Amphibian(String name, int dangerousness, String message, boolean isdead, int SwimmingSpeed) {
		super(name, dangerousness, message, isdead);
		this.swimmingSpeed = SwimmingSpeed;
	}
	public Amphibian(String name) {
		super(name);
		this.swimmingSpeed = 8;
	}
	public int getSwimmingSpeed() {
		return swimmingSpeed;
	}
	public void setSwimmingSpeed(int swimmingSpeed) {
		this.swimmingSpeed = swimmingSpeed;
	}


	
}
