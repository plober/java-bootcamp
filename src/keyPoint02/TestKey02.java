package keyPoint02;

public class TestKey02{ // Checking current naming :)
	public static void main(String[] args) { // I think it's a mess worth of conditional recipients
		Building House = new Building();
		System.out.println(House.toString()); // this one is the general, vanilla one
		
		Building Igloo = new Building(); // let's start calling names
		Igloo.setMaterial("ice"); //It only made sense
		Igloo.setPlaces(1); //coz, you know, round.
		System.out.println(Igloo.toString());
		
		Building Shack = new Building(2, "wood", 4); //Defining the object though its initial calling 
		System.out.println(Shack.toString());
		}
	}