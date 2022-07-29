import java.util.*;
public class Inch_convert {

	public static void main(String[] arg) {
		@SuppressWarnings("resource")
				Scanner userInput = new Scanner(System.in);
				String convert;
				double inches;
		do {
				System.out.println("Please enter the Inches to convert:");
					inches = userInput.nextDouble();
				System.out.println("Choose the System to convert \n\t cm = centimeters \n\t ft = Feet \n\t m  = Meter \n\t yd = yards \nX to exit");
					convert = userInput.next();
				calc(convert, inches);		 	
		}while(!convert.equals("x")|| !convert.equals("x"));		
	}	
	public static void calc(String Convert, double Inches ){
		double answer;
		
		if(Convert.equals("cm") || Convert.equals("Cm") ||Convert.equals("CM")){
			answer = Inches*2.54;
			System.out.println(answer);
		}else if(Convert.equals("ft") || Convert.equals("Ft") ||Convert.equals("FT")){
			answer = Inches/12;
			System.out.println(answer);
		}else if(Convert.equals("m") || Convert.equals("M")){
			answer = Inches/39.37;
			System.out.println(answer);
		}else if(Convert.equals("yd") || Convert.equals("Yd") ||Convert.equals("YD")) {
			answer = Inches/36;
			System.out.println(answer); 
		}	
	}
}
