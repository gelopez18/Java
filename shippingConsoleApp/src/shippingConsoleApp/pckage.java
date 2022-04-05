package shippingConsoleApp;

public class pckage {

	
	/*with attributes for weight in ounces, shipping method, and shipping cost.
	The shipping method is a character: ‘A’ for air, ‘T’ for truck, ‘M’ for mail. */
	
	public double weight;
	public char shippingMethod;
	public double shippingCost;
	
public String getshippingM() {
	
	
	if (shippingMethod == 'A' || shippingMethod == 'a') {
		return "Air";}
	else if (shippingMethod == 'T' || shippingMethod == 't') {
		return "truck";}
	else if(shippingMethod == 'M' || shippingMethod == 'm') {
		return "mail";}
	return "invalid";
}
/*The Package class has a constructor that requires arguments 
for weight and shipping method.*/
public pckage(double weight, char shippingMethod) {
	this.weight = weight;
	this.shippingMethod = shippingMethod;
	calculateCost();
	}

/*The constructor 
calls the calculateCost() method that determines the shipping cost 
based of the following table:*/

private void calculateCost() {
	
		if(weight >= 1 && weight < 8) {
				if(shippingMethod == 'A' || shippingMethod == 'a') {
					shippingCost = 2.00;	
				}
				else if (shippingMethod == 'T' || shippingMethod == 't') {
					shippingCost = 1.50;
				}
				else if (shippingMethod == 'M' || shippingMethod == 'm') {
					shippingCost = 0.50;
				}
	}
		else if(weight >= 8 && weight < 16) {
			if(shippingMethod == 'A' || shippingMethod == 'a') {
				shippingCost = 3.50;
			}
			else if (shippingMethod == 'T' || shippingMethod == 't') {
				shippingCost = 2.75;
			}
			else if (shippingMethod == 'M' || shippingMethod == 'm') {
				shippingCost = 1.50;
			}
	}
		else if(weight >= 17){
			if(shippingMethod == 'A' || shippingMethod == 'a') {
				shippingCost = 4.75;	
			}
			else if (shippingMethod == 'T' || shippingMethod == 't') {
				shippingCost = 3.50;
			}
			else if (shippingMethod == 'M' || shippingMethod == 'm') {
				shippingCost = 2.25;
			}
	}
}
/*The Package class also contains a display() method that displays the values
of all three attributes*/
public void display() {
	System.out.println("weight:" + weight);
	System.out.println("Shipping Method:" + getshippingM());
	System.out.println("Shipping cost:" + shippingCost);
}

}
