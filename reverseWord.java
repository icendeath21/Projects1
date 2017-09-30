package regen;


public class reverseWord {

	public static void main(String[] args) {
		
		String convert = "supercalifragilisticespialidocous";
		
		reverseWord(convert);

	}// main
	
	public static void reverseWord(String s) {
		
		String newWord = "";
		
		
		char[] word = new char[s.length()];
		
		for (int y = 0; y<=s.length()-1; y++) {
			
			word[y]=s.charAt((s.length()-1)-y);
			
		}
		
		newWord = new String(word);
		
		
		System.out.println(newWord);
		
	}
	
}
