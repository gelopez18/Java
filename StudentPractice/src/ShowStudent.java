import java.util.Scanner;

public class ShowStudent {
	public static void main(String[] arg) {
		@SuppressWarnings("resource")
		Scanner userInput = new Scanner(System.in);
		Students Student = new Students();
		
		System.out.println("Please enter your student ID:");
		int TempIDNumber = userInput.nextInt();
		Student.setIDNumber(TempIDNumber); 
		System.out.println("Please enter the subject Credits:");
		Student.credit = userInput.nextInt();
		System.out.println("Please enter the student's Credits Earned:");
		double TempCreditsEarned =  userInput.nextDouble();
		Student.setCreditsEarned(TempCreditsEarned);
		System.out.println("Points earn according to the Grade \n A+ = 4.0 A = 4.0 A- = 3.7 \n B+ = 3.3 B = 3.0 B- = 2.7 \n C+ = 2.3 C = 2.0 C- = 1.7 \n D+ = 1.3 D = 1.0 D- = 0.7 \n F  = 0.0 \nPlease enter the student's points earned:");
		double TempNumberPointsEarned = userInput.nextDouble();
		Student.setNumberPointsEarned(TempNumberPointsEarned);
		
		Student.display(TempNumberPointsEarned, TempCreditsEarned);
	}
	
	
	

}
