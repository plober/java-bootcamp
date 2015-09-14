public class Professionals{ //Doctors, nurses, handymen, etc
	private String name; //apparently, variables can be initialized with a value already :)
	private String profession;
	private byte age;
	private float monthlyPay; // Yes, I'm experimenting with data types. So what?!
	
	public void Staff (String name, String profession, byte age, float monthlyPay){
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