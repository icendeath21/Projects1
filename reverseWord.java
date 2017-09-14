package regen;


public class reverseWord {

	public static void main(String[] args) {
		
		String newWord = "";
		String convert = "supercalifragilisticespialidocous";
		
		char[] word = new char[convert.length()];
		
		for (int y = 0; y<=convert.length()-1; y++) {
			
			word[y]=convert.charAt((convert.length()-1)-y);
			
		}
		
		newWord = new String(word);
		
		
		System.out.println(newWord);
		//System.out.println("Hello World");

	}// main
	
}
