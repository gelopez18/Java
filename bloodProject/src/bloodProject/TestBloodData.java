package bloodProject;
import java.util.*;

public class TestBloodData {

	public static void main(String[] arg) {
		
		
		@SuppressWarnings("resource")
		Scanner userInput = new Scanner(System.in);
				
		System.out.println("Blood Type:");
		String type = userInput.next();
				
		System.out.println("is the Rh Factor + or - :");
		String Rh = userInput.next();
		
		System.out.println("Enter patient's Age:");
		int age = userInput.nextInt();
		patient NewPatient = new patient(age);
		
		NewPatient.BloodData.setFactor(Rh);
		NewPatient.BloodData.setBloodType(type);
		NewPatient.display();
	}
}
