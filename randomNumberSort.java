package regen;

import java.util.Random;

public class randomNumberSort {

	public static void main(String[] args) {
		
		Random rand = new Random();

 	
		int[] array = new int[5];
		
		for (int y = 0; y<array.length; y++) {
			array[y] = rand.nextInt(10) + 1;
			//random number 1-10
		}
		
		sortArray(array);		
		
		
		
		
	}
	
	private static void sortArray(int p[]) {
	
		int reserved = 0;
		
		for (int z = 0; z<p.length; z++) {
			
			System.out.println(z + " : " + p[z]);
			
		}
		
		
		for(int w = 0; w<p.length; w++) {
				
				for (int r = 0; r<p.length;r++) {
					
					if (p[w]>p[r]) {
						System.out.print("Current value is greater than next value...");
						System.out.println(p[w] + " : " + p[r]);
						System.out.println("Move value at postion " + w + " to position " + r);
						reserved= p[r];//stores current value
						p[r]= p[w];//moves greater value to next position
						p[w]= reserved;//moves lesser value to current position
						
						for (int z = 0; z<p.length; z++) {
							
							System.out.println(z + " : " + p[z]);
							
						}
						
					}
					else if (p[r]<p[w]) {
						System.out.print("Values are less than or equal... ");
						System.out.println(p[w] + " : " + p[r]);
						System.out.println("current postion " + w + " to position " + r);
					}
					else {
						//do nothing
					}
				}
			

				
			}
			
			System.out.println();
			
			for (int z = 0; z<p.length; z++) {
				
				System.out.println(z + " : " + p[z]);
				
			}
			
	}

	
	
}//end class
