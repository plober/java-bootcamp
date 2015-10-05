package keyPoint03;

public abstract class Hospital {
	public int doctors= 30, nurses = 40, beds = 100, maxPatients=125;
	public String hospitalName;

	public abstract void buildHospital(String hospitalName, String money);
	public String toString() {
		return "A hospital called " + this.hospitalName +
				" with " + this.nurses + " nurses" +
				" and " + this.doctors + " doctors" +
				" that can attend to " + this.maxPatients + " patients" +
				" and has " + this.beds + " beds.";
	}
	


}
