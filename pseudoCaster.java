package regen;

public class pseudoCaster extends player{
	/**
	 * type of pseudoCaster
	 */
	String pseudoCaster;
	
	/**
	 * default constructor
	 */
	public pseudoCaster(){
		super();//calls parent constructor
		pseudoCaster = "unknown";
	}
	
	/**
	 * alternate constructor
	 * 
	 * @param newName
	 * @param newRace
	 * @param newGender
	 * @param newAlignment
	 * @param newpseudoCaster
	 * @param newAbility
	 */
	public pseudoCaster(String newName, String newRace, String newGender, String newAlignment, String newpseudoCaster, stats newAbility){
		super(newName, newRace, newGender, newAlignment, newAbility);// calls parent constructor
	
		pseudoCaster = newpseudoCaster;
	}
	/** 
	 * returns the pseudoCaster
	 * @return pseudoCaster
	 */
	public String getpseudoCaster(){
		return pseudoCaster;
	}
	/** 
	 * changes the pseudoCaster
	 * @param newpseudoCaster
	 */
	public void setpseudoCaster(String newpseudoCaster){
		pseudoCaster = newpseudoCaster;
	}
	/** 
	 *Returns the name, race gender alignment and pseudoCaster
	 *
	 *@return String
	 */
	public String toString(){
		return super.toString() + String.format("Class: %S", pseudoCaster);
	}
}//class
