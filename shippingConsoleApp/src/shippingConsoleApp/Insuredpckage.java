package shippingConsoleApp;

public class Insuredpckage extends pckage{
	//that contains an attribute insurance
		public char insuranceType;
		public double insuranceCost;
		
		public String getinsuranceT() {
			if(insuranceType == 'P' || insuranceType == 'p')
				return "Premium";
			else if (insuranceType == 'S' || insuranceType == 's')
				return "Standard";
			else 
				return "Invalid";
			}
		
		public Insuredpckage(double weight, char insuranceType, char shippingMethod) {
			super (weight, shippingMethod);
			this.insuranceType = insuranceType;
			
			if (weight >= 0 && weight < 3.00) {
				 if (insuranceType == 'P' || insuranceType == 'p') {
					 insuranceCost = 0;
				 } else if (insuranceType == 'S' || insuranceType == 's') {
					 insuranceCost = 0;
				 }
					 
			}else if (weight >= 3.00 && weight <= 10.00) {
				if (insuranceType == 'P' || insuranceType == 'p') {
					insuranceCost = 10;
				 } else if (insuranceType == 'S' || insuranceType == 's') {
					insuranceCost = 5;
				 }
			} else if(weight > 10.00){
				if (insuranceType == 'P' || insuranceType == 'p') {
					insuranceCost = 15;
				 } else if (insuranceType == 'S' || insuranceType == 's') {
					insuranceCost = 10;
				 }
			}
	//type and adds insurance cost to the shipping cost,
		}
		public void display() {
			
			System.out.println("Insurance Type:" + getinsuranceT());
			System.out.println("Insurance Cost:" + insuranceCost);
			System.out.println("TOTAL:" + (insuranceCost + shippingCost));
			
		}

}
