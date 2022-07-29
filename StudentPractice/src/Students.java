
public class Students {
	
int IDNumber;
double CreditsEarned;
double NumberPointsEarned;
double GPA;
int credit;

public void setIDNumber(int studID ) {
	IDNumber = studID;
}
public int getIDnumber() {
	return IDNumber;
}
public void setCreditsEarned(double studCredEar ) {
	CreditsEarned = studCredEar;
}
public double getCreditsEarned() {
	return CreditsEarned;
}
public void setNumberPointsEarned(double numbPointsEarn) {
	NumberPointsEarned = numbPointsEarn;
}
public double getNumberPointsEarned() {
	 return NumberPointsEarned;
}
 public void setcredit(int subjectCredits) {
	 credit = subjectCredits;
 }
public double calcGPA(double studentPoints, double StudentCredits, int credit) {
	GPA = (studentPoints* StudentCredits)/credit;
	return GPA;
}
public void display(double numb_points, double credit_earned) {
	
	 System.out.print("Student with ID:" + this.getIDnumber()+"\n"); 
	 System.out.print("\nhas the following school record: \n\tCredits earned:" + this.getCreditsEarned());
	 System.out.print("\n\tTotal of Point: " + this.getNumberPointsEarned()); 
	 System.out.print("\n\tGPA:" + this.calcGPA(numb_points, credit_earned, credit));
	
	 }

}
