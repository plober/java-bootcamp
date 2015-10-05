package keyPoint03;

public class BenignGovernment { //Politicians promise Hospitals, thus it should be a good thing to get them constructed

	public Hospital raiseHospital(String hospitalName, String moneyOrigin, String money) {
		if (moneyOrigin=="Private"){
			Hospital a1 = new privateHospital();
			a1.buildHospital(hospitalName, money);
			return a1;
		} else { //Assumed to be based in public funds
			Hospital a1 = new publicHospital();
			a1.buildHospital(hospitalName, money);
			return a1;
		}
	}
}
