package keyPoint03;

public class publicHospital extends Hospital {
	@Override
	public void buildHospital(String hospitalName, String money){
		this.hospitalName=hospitalName + " the people's hero";
		if (money=="Cheap"){
			this.doctors -= 20;
			this.nurses -= 30;
			this.beds -= 50;
			this.maxPatients -= 75;
		}
	}
	
}
