package Animals;

public class Frog extends Amphibian{
public Frog(String name) {
		super(name);
	}

@Override
public String walk(){
	return "*Leap*";
}
public String croak(boolean croak){
	if(croak = true){
		return "*Croak*";
	}
	return "*No*";
}
}
