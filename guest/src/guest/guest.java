package guest;

public class guest {

	public String FName;
	public String LName;
	
	public String getFName() {
		return FName;
	}
	public void setFName(String fName) {
		FName = fName;
	}
	public String getLName() {
		return LName;
	}
	public void setLName(String lName) {
		LName = lName;
	}
	 
	public guest(String FName, String LName){
		this.FName = FName;
		this.LName = LName;		
	}
	
	
	

}
