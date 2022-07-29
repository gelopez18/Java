import java.util.*;
import java.lang.Math;
import java.text.NumberFormat;
public class financialCalc  {
	
	public financialCalc(char TypeofCalc) {
		
		if(TypeofCalc =='C' || TypeofCalc =='c') {
			compInterest();
		}else if(TypeofCalc =='R' || TypeofCalc =='r'){
			ReturnInvestment();
		}else if(TypeofCalc =='A' || TypeofCalc =='a') {
			amorti();
		}
	}
	
	public void compInterest() {
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		@SuppressWarnings("resource")
		//Data collection
		Scanner uInput = new Scanner(System.in);
	System.out.println("Please enter the principal Amount:");
		double PrincipalAmount = uInput.nextDouble(); 
	System.out.println("What is the Annual Rate percentage?");
		double AnualInteres = uInput.nextInt();
		double RatePercent = AnualInteres/100;
	System.out.println("How many times The interest rate is compound in a year?");
		double NumboftimesIntcompound = uInput.nextDouble();
	System.out.println("Enter the total years for the loan");	
		double numbYears = uInput.nextInt();
		//formula used to A = P * (1 + r/t)^(nt)
		double nt = numbYears * NumboftimesIntcompound;
		double rDividedByt = 1+(RatePercent/numbYears) ;
		double answer = (Math.pow(rDividedByt, nt) * PrincipalAmount);	
	System.out.println("Total amount you will receive after 10 years: " + formatter.format(answer)+"\n");			
	}
	
	public void ReturnInvestment() {
//data collection
		@SuppressWarnings("resource")
		Scanner uInput = new Scanner(System.in);
		System.out.println("Please Enter Cost of Investment");
			double costInvs = uInput.nextDouble();
		System.out.println("Please Enter Current Value of Investment");
			double ValueInvs = uInput.nextDouble();		
		//ROI= Current Value of Investment−Cost of Investment/Cost of Investment
			double answer = (ValueInvs - costInvs) / costInvs;
		System.out.println("Total of Return of Investment percentage: " + Math.round(answer*100)+"%\n");
	}
	public void amorti() {
		@SuppressWarnings("resource")
		Scanner uInput = new Scanner(System.in);
		System.out.println("Down Payment amount:");
			double downPymt = uInput.nextDouble();
		System.out.println("Total amount of loan:");
			double LoanAmnt = uInput.nextDouble();
			double P = LoanAmnt - downPymt;
		System.out.println("APR:");
			double AInterestRate = uInput.nextDouble();
			double i = (AInterestRate/100)/12;
		System.out.println("Total years of the loan:");
			double years =uInput.nextDouble();
			int n = (int) (years*12);
			
			/* ----- P[i(1+r)^n/((1+r)^n)-1)]
			 * TMP = Total Monthly payment
			 * */
			double numerator = i*(Math.pow((1+i), n));
			double denominator = (Math.pow((1+i), n))-1;
			double TMP =  Math.round((P*(numerator/denominator)));		
			NumberFormat formatter = NumberFormat.getCurrencyInstance();
		System.out.println("---------------------------------------------------------------------------------------------------------------");
        System.out.printf("%10s %25s %20s %25s %23s", "Period", "Total Payment Due", "Interest Due", "Principal Due", "Balance");
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------------------------");
        
     double[][] AmortTab = new double[n][5];
       AmortTab[0][4] = P;
       System.out.printf("%109s", formatter.format(AmortTab[0][4])+"\n");
       		
        	for(int j = 1; j<n;j++) {    			
        		for(int x = 1; x<5; x++) {
        			AmortTab[j][0]= j;
        			AmortTab[j][1]= TMP;
        	    	AmortTab[j][2]=((AmortTab[j-1][4])*i);
        	    	AmortTab[j][3]=(AmortTab[j][1])-(AmortTab[j][2]);
        	    	AmortTab[j][4]=(AmortTab[j-1][4]-AmortTab[j][3]);
        		}
        	    	
        	}
           	for(int j = 1; j<n;j++) {    			
        		for(int x = 1; x<5; x++) {
        			System.out.printf("%27s", formatter.format(AmortTab[j][x]));
        		}
        	    System.out.println();
        	}
        	
       System.out.println();
       System.out.println("---------------------------------------------------------------------------------------------------------------");
    
       		
	}
	
}
