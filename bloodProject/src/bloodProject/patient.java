package bloodProject;
import java.util.*;

public class patient {
	Random rand = new Random();

	int PatientID = rand.nextInt();
	int PatientAge;
	String BloodType;
	String rhFactor;
	Blood_Data BloodData = new Blood_Data(BloodType, rhFactor);
	public patient(int patientAge){

		 this.PatientAge = patientAge;
	
		 this.BloodType = BloodData.getBloodType();
		 this.rhFactor = BloodData.getFactor();
		 
	}
	
	public void display() {
		
			System.out.println("Patient with ID: " + PatientID + "\nAge: " + PatientAge +"\nBlood Type: " + BloodData.getBloodType() + BloodData.getFactor() );	
			
	}
	 
}
