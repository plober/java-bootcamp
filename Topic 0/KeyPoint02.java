public class KeyPoint02{ // I get the point of "vague specifications" but you could've waited a couple of exercises! ;)
	private int places;
	private int rooms;
	
	public KeyPoint02(){
		places = 4;
		rooms = 3;
	}
	
	public KeyPoint02(int lugares){
		places = lugares;
		rooms = 3;
	}
	
	public KeyPoint02(int lugares, int people){
		places = lugares;
		rooms = people;
	}
	
	public int getHabitaciones(){
		return places;
	}
	
	public int getHabitantes(){
		return rooms;
	}
	
	public String toString(){
		return "A house with " + rooms + " inhabitants who live in " + places + " rooms.";
	}
}