package regen;

public abstract class player {
	
	private String name;
	private String race;
	private String gender;
	private String alignment;
	private stats ability;
	
	//default constructor
	public player(){
		name = "N/A";
		race = "N/A";
		gender = "N/A";
		alignment = "N/A";
		ability = new stats();
	}
	
	//alternate constructor
	public player(String newName, String newRace, String newGender, String newAlignment, stats newS){
		name = newName;
		race = newRace;
		gender = newGender;
		alignment = newAlignment;
		ability = newS;
	}
	//returns name
	public String getName(){
		return name;
	}
	//returns race
	public String getRace(){
		return race;
	}
	//returns gender
	public String getGender(){
		return gender;
	}
	//returns alignment
	public String getAlignment(){
		return alignment;
	}
	public stats getAbility(){
		return ability;
	}
	public void setAbility(stats newAbility){
		ability = newAbility;
	}
	
	//changes alignment
		public void setAlignment(String newAlignment){
			alignment = newAlignment;
		}
	//changes name
	public void setName(String newName){
		name = newName;
	}
	//changes race
	public void setRace(String newRace){
		race = newRace;
	}
	//changes gender
	public void setGender(String newGender){
		gender = newGender;
	}
	//returns string
	public String toString(){
		return String.format("%s is a %s %s %s", name, alignment, gender, race) + "\n" + ability.toString();
	}
	
}//class