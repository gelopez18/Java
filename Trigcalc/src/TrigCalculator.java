import java.util.Scanner;

public class TrigCalculator {
	
	public static void main(String[] arg) {
		char CalcType;
		do {
			@SuppressWarnings("resource")
			Scanner userInput = new Scanner(System.in);
			System.out.println("What are you looking to do? \n\tCalculate Finance - F\n\tCalculate Constructions Operations - C");
			CalcType = userInput.next().charAt(0) ;
		 
				if(CalcType == 'F' || CalcType == 'f') {
					System.out.print("Please choose the type of Calculation you will like to perform:\n\tCompound Interest = C\n\tReturn Investment = R\n\tAmortization = A\n\t");
					 char calculation = userInput.next().charAt(0);
					@SuppressWarnings("unused")
					financialCalc finance = new financialCalc(calculation);		
				} else if (CalcType == 'C' || CalcType == 'c') {
					System.out.print("Please choose the type of Calculation you will like to perform:\n\tBricks wall Calculator = B\n\tReturn Investment = R\n\tAmortization = A\n\t");
					 char calculation = userInput.next().charAt(0);
					@SuppressWarnings("unused")
					ConstructionsCalc Constr = new ConstructionsCalc(calculation);
				}
			
		}while(CalcType != 'X' || CalcType != 'x');
		
	
	}
		
		
	
	

}
