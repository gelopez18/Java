package mathtest;
import java.util.*;
import java.lang.Math;
public class MathTest {
	public static void main(String[] arg) {
		@SuppressWarnings("resource")
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please enter the number you would like to Square");
		double squartNum = userInput.nextDouble();
		System.out.println("\tAnswer:"+Math.sqrt(squartNum));
		System.out.println("Please enter the number you would like to use to get Sine");
		double sinNumb = userInput.nextDouble();
		System.out.println("\tAnswer:"+Math.sin(sinNumb));
		System.out.println("Please enter the number you would like to use to get cosine");
		double cosNumb = userInput.nextDouble();
		System.out.println("\tAnswer:"+Math.cos(cosNumb));
		
		
	}

}
