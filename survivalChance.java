package regen;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



	public class survivalChance extends JFrame {
		
		// needed for eclipse environment
		private static final long serialVersionUID = 1L;

		// ************************************************************
		// global class variables & components #1
		// ************************************************************
		JLabel labelSheet;
		JLabel labelClass;
		JLabel labelRace;
		JLabel labelStat;
		
		JCheckBox wizRadio;
		JCheckBox warRadio;
		JCheckBox rogueRadio;
		JCheckBox monkRadio;
		JCheckBox barbRadio;
		JCheckBox palRadio;
		JCheckBox bardRadio;
		JCheckBox clericRadio;
		JCheckBox druidRadio;
		JCheckBox rangerRadio;
		JCheckBox sorRadio;
		
		ButtonGroup radioGroup1;
		JRadioButton elfBox;
		JRadioButton humanBox;
		JRadioButton drouBox;
		JRadioButton halflingBox;
		JRadioButton gnomeBox;
		JRadioButton halfElfBox;
		
		ButtonGroup radioGroup2;
		JRadioButton strRad;
		JRadioButton dexRad;
		JRadioButton conRad;
		JRadioButton intRad;
		JRadioButton wisRad;
		JRadioButton chaRad;
		JRadioButton noneRad;
		
		
		JButton genButton;
		JButton canButton;
		
		JMenuBar menuBar;

		JMenu fileMenu;
		JMenuItem itemNew, itemExit;

	
	
	public survivalChance(){
		super();
		
		this.setTitle("Character Sheet");
		
		labelSheet = new JLabel("Character Sheet");
		labelClass = new JLabel("Class");
		labelRace = new JLabel("Race");
		labelStat = new JLabel("Preferred Stat");
		
		wizRadio = new JCheckBox("Wizard", false);
		warRadio = new JCheckBox("Warrior", false);
		bardRadio = new JCheckBox("Bard", false);
		barbRadio = new JCheckBox("Barbarian", false);
		rogueRadio = new JCheckBox("Rouge", false);
		monkRadio = new JCheckBox("Monk", false);
		palRadio = new JCheckBox("Paladin", false);
		druidRadio = new JCheckBox("Druid", false);
		rangerRadio = new JCheckBox("Ranger", false);
		sorRadio = new JCheckBox("Sorceror", false);
		clericRadio = new JCheckBox("Cleric", false);

		humanBox = new JRadioButton("Human", true);
		elfBox = new JRadioButton("Elf", false);
		drouBox = new JRadioButton("Drou", false);
		halflingBox = new JRadioButton("Halfling", false);
		gnomeBox = new JRadioButton("Gnome", false);
		halfElfBox = new JRadioButton("Half-Elf", false);
		
		radioGroup1 = new ButtonGroup();
		radioGroup1.add(humanBox);
		radioGroup1.add(elfBox);
		radioGroup1.add(drouBox);
		radioGroup1.add(halflingBox);
		radioGroup1.add(gnomeBox);
		radioGroup1.add(halfElfBox);

		strRad = new JRadioButton("STR", false);
		dexRad = new JRadioButton("DEX", false);
		conRad = new JRadioButton("CON", false);
		intRad = new JRadioButton("INT", false);
		wisRad = new JRadioButton("WIS", false);
		chaRad = new JRadioButton("CHA", false);
		noneRad = new JRadioButton("N/A", true);
		
		radioGroup1 = new ButtonGroup();
		radioGroup1.add(humanBox);
		radioGroup1.add(elfBox);
		radioGroup1.add(drouBox);
		radioGroup1.add(halflingBox);
		radioGroup1.add(gnomeBox);
		radioGroup1.add(halfElfBox);
		
		radioGroup2 = new ButtonGroup();
		radioGroup2.add(strRad);
		radioGroup2.add(dexRad);
		radioGroup2.add(conRad);
		radioGroup2.add(intRad);
		radioGroup2.add(wisRad);
		radioGroup2.add(chaRad);
		radioGroup2.add(noneRad);
		
		//layouts
		Box classBox = Box.createVerticalBox();
		classBox.add(labelClass);
		classBox.add(Box.createVerticalStrut(10));
		classBox.add(Box.createVerticalStrut(10));
		classBox.add(wizRadio);
		classBox.add(warRadio);
		classBox.add(bardRadio);
		classBox.add(barbRadio);
		classBox.add(rogueRadio);
		classBox.add(monkRadio);
		classBox.add(palRadio);
		classBox.add(druidRadio);
		classBox.add(rangerRadio);
		classBox.add(sorRadio);
		classBox.add(clericRadio);
		classBox.add(Box.createVerticalGlue());
		
		Box titleBox = Box.createVerticalBox();
		titleBox.add(labelSheet);
		titleBox.add(Box.createVerticalStrut(20));
		
		Box raceBox = Box.createVerticalBox();
		raceBox.add(labelRace);
		raceBox.add(Box.createVerticalStrut(10));
		raceBox.add(elfBox);
		raceBox.add(humanBox);
		raceBox.add(drouBox);
		raceBox.add(halflingBox);
		raceBox.add(gnomeBox);
		raceBox.add(halfElfBox);
		
		Box statBox = Box.createVerticalBox();
		statBox.add(labelStat);
		statBox.add(Box.createVerticalStrut(10));
		statBox.add(strRad);
		statBox.add(dexRad);
		statBox.add(conRad);
		statBox.add(intRad);
		statBox.add(wisRad);
		statBox.add(chaRad);
		statBox.add(noneRad);
		
		JPanel formatStat =  new JPanel(new FlowLayout(FlowLayout.LEFT));
		formatStat.add(statBox);
		
		genButton = new JButton("Generate");
		canButton = new JButton("Cancel");
		
		ButtonHandler bh = new ButtonHandler(); // create one instance of
												// ButtonHandler class
		genButton.addActionListener(bh); 		// link button click event to
												// ButtonHandler class bh
		canButton.addActionListener(bh);	// link button click event to
												// ButtonHandler class bh
		
		Box buttonBox = Box.createVerticalBox(); 
		buttonBox.add(genButton);
		buttonBox.add(canButton);
		
		
		this.add(titleBox, BorderLayout.PAGE_START);
		this.add(classBox, BorderLayout.LINE_START);
		this.add(raceBox, BorderLayout.CENTER);
		this.add(formatStat, BorderLayout.LINE_END);
		this.add(buttonBox, BorderLayout.PAGE_END);
	}

	// inner class for event handling
	private class ButtonHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			
			//new caster("Diane",  "Human", "Female", "Nuetral Good", "Wizard", new stats(19, 12, 20, 22, 15, 15));//create new caster
			String name = "Diane";
			String race = "";
			String gender = "female";
			String alignment = "Nuetral Good";
			String classType = "";
			
			int typeVal = 0;
			
			if (e.getSource() == genButton) {
					
				// add race
				if (humanBox.isSelected()) {
					race = "Human";
				}				
				else if (elfBox.isSelected()) {
					race = "Elf";
				}
				else if (drouBox.isSelected()) {
					race = "Drou";
				}
				else if (halflingBox.isSelected()) {
					race = "Halfling";
				}
				else if (gnomeBox.isSelected()) {
					race = "Gnome";
				}
				else if (halfElfBox.isSelected()) {
					race = "Half-Elf";
				}
				
				// add classes
				if (wizRadio.isSelected()) {
					classType = "Wizard"; 
					typeVal = 1;
				}
				if (warRadio.isSelected()) {
					typeVal = 2;
					classType = "Warrior"; 
				}
				if (bardRadio.isSelected()) {
					typeVal = 3;
					classType = "Bard"; 
				}
				if (barbRadio.isSelected()) {
					typeVal = 2;
					classType = "Barbarian"; 
				}
				if (rogueRadio.isSelected()) {
					typeVal = 2;
					classType = "Rouge"; 
				}
				if (monkRadio.isSelected()) {
					typeVal = 2;
					classType = "Monk"; 
				}
				if (palRadio.isSelected()) {
					typeVal = 3;
					classType = "Paladin"; 
				}
				if (druidRadio.isSelected()) {
					typeVal = 3;
					classType = "Druid"; 
				}
				if (rangerRadio.isSelected()) {
					typeVal = 3;
					classType = "Ranger"; 
				}
				if (sorRadio.isSelected()) {
					typeVal = 1;
					classType = "Sorceror"; 
				}
				if (clericRadio.isSelected()) {
					typeVal = 1;
					classType = "Cleric"; 
				}
				
				if (typeVal==1) {
					caster character = new caster();
					character.setName(name);
					character.setRace(race);
					character.setGender(gender);
					character.setcaster(classType);
					character.setAlignment(alignment);
					System.out.println(character.toString() + "\n" );
				}
				else if (typeVal==2) {
					fighter character = new fighter();
					character.setName(name);
					character.setRace(race);
					character.setGender(gender);
					character.setFighter(classType);
					character.setAlignment(alignment);
					System.out.println(character.toString() + "\n" );
				}
				else if (typeVal==3) {
					pseudoCaster character = new pseudoCaster();
					character.setName(name);
					character.setRace(race);
					character.setGender(gender);
					character.setpseudoCaster(classType);
					character.setAlignment(alignment);
					System.out.println(character.toString() + "\n" );
				}
				
				// display JOptionPane with status of all GUI components
				/*JOptionPane.showMessageDialog(null, status, "Order Summary",
						JOptionPane.INFORMATION_MESSAGE);
*/
				
			} else if (e.getSource() == canButton) {

			}

		}// actionPerformed
	} // ButtonHandler

	
	public static void main(String[] args) {
		
		survivalChance y = new survivalChance(); //create instance of calc
		
		y.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		y.setSize(500, 500);//width, height 
		y.setVisible(true);	
				
		
	}//main

}//class
