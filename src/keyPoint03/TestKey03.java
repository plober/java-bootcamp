package keyPoint03;

public class TestKey03{ // This will be an incremental tesing, moving up each time the test works properly

	public static void main(String[] args){ //Straightforward creation
		
		BenignGovernment Prozor = new BenignGovernment();
		
		Hospital Chester= Prozor.raiseHospital("Chester", "Public", "Cheap");
		Hospital Cale= Prozor.raiseHospital("Cale", "Public", "Expensive");
		Hospital Makaan= Prozor.raiseHospital("Makaan", "Private", "Cheap");
		Hospital Eliazir= Prozor.raiseHospital("Eliazir", "Private", "Expensive");
		System.out.println(Chester.toString());
		System.out.println(Cale.toString());
		System.out.println(Makaan.toString());
		System.out.println(Eliazir.toString());

		//		Person inFlower = new Person();
//
//		Person doctor1 	= inFlower.bringIn("Employee"); //, "John Doe", "Doctor", 34, 15000
//		Person nurse1 	= inFlower.bringIn("Customer"); //, "Jane Doe", "Nurse", 54, 9000
//		System.out.println(doctor1.toString());
//		System.out.println(nurse1.toString());
		
//		Person Customer1 = new Person("Rich Appleseed", "Carpenter", "Customer", 32, 6000);
		
	}
}