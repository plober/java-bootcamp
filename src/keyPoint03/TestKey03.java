package keyPoint03;
public class TestKey03{ // This will be an incremental tesing, moving up each time the test works properly
	public static void main(String[] args){
		Professional doctor1 = new Professional("John Doe", "Doctor", 34, 15000);
		Professional nurse1 = new Professional("Jane Doe", "Nurse", 54, 9000);
		System.out.println(doctor1.toString());
		System.out.println(nurse1.toString());
	}
}