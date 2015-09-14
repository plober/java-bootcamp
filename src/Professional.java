public class Professional{ //Doctors, nurses, handymen, etc
	private String name; //apparently, variables can be initialized with a value already :)
	private String profession;
	/*	private byte age;
	private float monthlyPay; // Yes, I'm experimenting with data types. So what?!*/
	private int age;
	private int monthlyPay; // No data types for me. Move on.
	
	public Professional (String name, String profession, int age, int monthlyPay){
		this.name = name;
		this.profession = profession;
		this.age = age;
		this.monthlyPay = monthlyPay;
	}
	
	public String toString(){
		return 	"Employee " + name + 
				" who is a " + profession + 
				" is " + age + " years old" + 
				" and earns " + monthlyPay + "bucks por month.";
	}
	
}