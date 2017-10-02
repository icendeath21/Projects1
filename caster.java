package regen;

public class caster extends player{

	String caster;
	
	public caster(){
		super();//calls parent constructor
		caster = "unknown";
	}
	

	public caster(String newName, String newRace, String newGender, String newAlignment, String newCaster, stats newAbility){
		super(newName, newRace, newGender, newAlignment, newAbility);// calls parent constructor
	
		caster = newCaster;
	}

	public String getCaster(){
		return caster;
	}
	public void setcaster(String newCaster){
		caster = newCaster;
	}
	public String toString(){
		return super.toString() + String.format("Class: %S", caster);
	}
}//class
