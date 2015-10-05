package keyPoint03;

public class privateHospital extends Hospital{
	
		@Override
		public void buildHospital(String name, String money){
			this.hospitalName= name;
			if (money=="Expensive"){
				this.doctors *= 1.1;
				this.nurses *= 1.1;
				this.beds *= 1.1;
				this.maxPatients *= 1.1;
			}
		}

	}

