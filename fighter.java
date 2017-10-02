package regen;

public class fighter extends player{
	
	String fighter;
	
	//default constructor
	public fighter(){
		super();//calls parent constructor
		fighter = "unkown";
	}
	
	//alternate constructor
	public fighter(String newName, String newRace, String newGender, String newAlignment, String newFighter, stats newAbility){
		super(newName, newRace, newGender, newAlignment, newAbility);
	
		fighter = newFighter;
	}
	
	public String getFighter(){
		return fighter;
	}
	
	public void setFighter(String newFighter){
		fighter = newFighter;
	}
	public String toString(){
		return super.toString() + String.format("Class:  %S", fighter);
	}
}//class
