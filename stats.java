package regen;

import java.util.Random;

public class stats {
	
	private int Dex;
	private int Str;
	private int Con;
	private int Int;
	private int Wis;
	private int Cha;
	private Random rn = new Random();
	
	//default constructor
	public stats(){
	
		Str = rn.nextInt(15)+4;
		Dex = rn.nextInt(15)+4;
		Con = rn.nextInt(15)+4;
		Int = rn.nextInt(15)+4;
		Wis = rn.nextInt(15)+4;
		Cha = rn.nextInt(15)+4;
	}
	//alternate constructor
	public stats(int newDex,int newStr, int newCon, int newInt, int newWis, int newCha){
			Str = newStr;
			Dex = newDex;
			Con = newCon;
			Int = newInt;
			Wis = newWis;
			Cha = newCha;
		}
	
	public int getStr(){
		return Str;
	}
	
	public int getDex(){
		return Dex;
	}
	
	public int getCon(){
		return Con;
	}
	
	public int getInt(){
		return Int;
	}
	
	public int getWis(){
		return Wis;
	}
	
	public int getCha(){
		return Cha;
	}
	
	public void setStr(int newStr){
		
		Str = newStr;
	}
	
	public void setDex(int newDex){
		Dex = newDex;
	}
	
	public void setCon(int newCon){
		Con = newCon;
	}
	
	public void setInt(int newInt){
		Int = newInt;
	}
	
	public void setWis(int newWis){
		Wis = newWis;
	}
	
	public void setCha(int newCha){
		Cha = newCha;
	}
	
	public String toString(){
		return String.format("Str: %2d  Int: %2d \nDex: %2d  Wis: %2d \nCon: %2d  Cha: %2d \n", Str, Int, Dex, Wis, Con, Cha);
	}
}//class