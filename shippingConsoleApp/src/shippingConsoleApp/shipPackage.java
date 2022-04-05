package shippingConsoleApp;
import java.util.Scanner;

public class shipPackage {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		/*Use Scanner or JOptionPane as a tool to accept user's input. Make your 
		  application user friendly,*/
		  Scanner userinput = new Scanner(System.in);
		
		/*providing the proper prompts informing a 
  user what data is expected and what results are being shown when the 
  application runs*/
		System.out.print("Enter the weight of the package:");
			double weight = userinput.nextDouble(); 
		System.out.print("Enter Shipping Method choose A for Air, T for truck and M for Mail:");
			char shippingMethod = userinput.next().charAt(0); 
		System.out.print("Enter the insurance S for Standard and P for Premium:");
			char insuranceType = userinput.next().charAt(0);
			/*using a
			  variety of weights, shipping methods and insurance types. 
			  These values should be assigned as a user's input*/
			
			pckage object = new pckage(weight, shippingMethod);
			Insuredpckage obj = new Insuredpckage(weight, insuranceType, shippingMethod);
			
			/*The application
  should display each package weight, shipping method, insurance cost,
  if any, and the shipping cost. 
  */
			
			object.display();
			obj.display();
	}

}
