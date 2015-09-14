public class TestKey02{ // Checking current naming :)
	public static void main(String[] args) { // I think it's a mess worth of conditional recipients :P
		KeyPoint02 House = new KeyPoint02();
		System.out.println(House.toString()); // this one is the general one
		
		KeyPoint02 SecondHouse = new KeyPoint02(5);
		System.out.println(SecondHouse.toString()); // Should have 5 inhabitants
		
		KeyPoint02 ThirdHouse = new KeyPoint02(2, 7);
		System.out.println(ThirdHouse.toString()); // Should have 7 inhabitants and 2 rooms
		
	}
}