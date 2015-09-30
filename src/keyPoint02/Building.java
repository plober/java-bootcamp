package keyPoint02;

public class Building { //OK, now that I get the hang of what the Building Patterns is, I set hands to work
	private static String Material="bricks"; //just to add some fluff
	private static int places=3; // Would use rooms, but I'm running put of synonims
	private int Access=1; //The great entrance (1st paragraph of "Invisible Monsters", by Chuck Palahniuk)
	
	public Building() {} //When I only need to initialize it
	
	public Building(int rooms, String raw, int BigDoors){
		places = rooms;
		Material = raw;
		Access = BigDoors;		
	}

	public void setMaterial(String raw){ //What do you build houses with?
		Material = raw;
	}
	
	public void setPlaces(int rooms){
		places = rooms;
	}
	
	public void setAccess(int BigDoors){
		Access = BigDoors;
	}

	public String toString(){
		return "A house with " 
				+ Access + " entrances that has " 
				+ places + " rooms and is made of "
				+ Material + ".";
	}
}
