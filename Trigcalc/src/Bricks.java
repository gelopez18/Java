import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;

public class Bricks {
	NumberFormat formatter = new DecimalFormat("#0.000");
	double width;
	double length;
	double height;

	String type;
	String BricksVol;
	String BricksMeasu;
	
	HashMap<String, String> OneSqrM = new HashMap<String, String>();
	HashMap<String, String> BricksDetails = new HashMap<String, String>();
	
	public Bricks(double width, double length, double height, String type, String BricksVol,
	String BricksMeasu, HashMap<String, String> bricksVol,HashMap<String, String> BricksDetails) {
		this.width = width;
		this.length = length;
		this.height = height;
		this.type = type;
		this.BricksVol = BricksVol;
		this.BricksMeasu = BricksMeasu;
		this.OneSqrM= bricksVol;
		this.BricksDetails = BricksDetails;
		
	}
	public String getBricksMeasu() {
		return BricksMeasu;
	}

	public HashMap<String, String> getBricksDetails() {
		return BricksDetails;
	}

	public void setBricksDetails(HashMap<String, String> bricksDetails) {
		BricksDetails = bricksDetails;
	}

	public void setOneSqrM(HashMap<String, String> bricksVol) {
		this.OneSqrM = bricksVol;
	}

	public HashMap<String, String> getOneSqrM() {
		return OneSqrM;
	}

	public void setBricksVol(String bricksVol) {
		BricksVol = bricksVol;
	}

	public void setBricksMeasu(String bricksMeasu) {
		BricksMeasu = bricksMeasu;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void display() {

		//Display 
	System.out.println("Bricks Mesurement:");
	System.out.println("------------------------------------------------\n\tType\t\tMeasurement\n------------------------------------------------");
		getBricksDetails().forEach((K, V) -> System.out.println("\t"+K+"\t\t"+V));
	System.out.println("------------------------------------------------\n");
	
	System.out.println("1 Square Meter:");
	System.out.println("------------------------------------------------\n\tType\t\tMeasurement\n------------------------------------------------");
		getOneSqrM().forEach((K, V) -> System.out.println("\t"+K+"\t\t"+V));
	System.out.println("------------------------------------------------\n");
	}
	
}
