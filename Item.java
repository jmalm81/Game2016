import java.util.*;

class Item{
	
	Random rnd = new Random();
	
	int quality;
	int type;
	String name, typeName;
	
	public Item(){
		quality = rnd.nextInt(2);
		type = rnd.nextInt(2);
		
	}
	
	/*
	
	DETTA ÄR DEN HELT JÄVLA NYA BAJSAPA RADEN!!!!
	
	*/
	
	public String toString(){
		return "Quality: " + quality + " Type: " + type;
	}
	
}