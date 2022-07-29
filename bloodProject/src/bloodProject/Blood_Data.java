package bloodProject;

public class Blood_Data {
	String BloodType;
	String Factor;
	
	public void setBloodType(String BloodType) {
		this.BloodType = BloodType;
	}
	public void setFactor(String Factor) {
		this.Factor = Factor;		
	}
	public String getBloodType(){
		return BloodType;
	}
	public String getFactor() {
		return Factor;
	}
	public Blood_Data(String BloodType, String RhFactor){
		BloodType = "O";
		RhFactor = "+";
	
	}
	

}
