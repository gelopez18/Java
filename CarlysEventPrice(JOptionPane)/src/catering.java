import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class catering {

	public static void main(String[] args) {
		
		String guestNameReserv = JOptionPane.showInputDialog(null,"Enter Customer's name:");
		String custSTAdds = JOptionPane.showInputDialog(null, "Enter Customer's Street Address");
		String custCity = JOptionPane.showInputDialog(null, "Enter customer's City");
		int zip = Integer.parseInt(JOptionPane.showInputDialog(null, "ZipCode"));
		/*String phoneNo = JOptionPane.showInputDialog(null, "Customer's Phone number");*/
		String email = JOptionPane.showInputDialog(null,"Please enter Email Addres");
		int guestAmnt = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the number of Guess attending to the event"));
		double pricePerG = 35;
		double total = guestAmnt * pricePerG;
	
	JFrame window = new JFrame();
	//DecimalFormat phoneFmt = new DecimalFormat("###-###-####");
	window.setVisible(true);
	window.setSize(350,250);
	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	window.setLocation(50, 50);
	window.setLayout(null);
	
	JLabel title = new JLabel("Customer Info");
	JLabel reserveName = new JLabel();
	reserveName.setText("Reservation is under: "+" "+ guestNameReserv);
	JLabel customerAdd = new JLabel();
	customerAdd.setText("Customer's Address: "+" "+custSTAdds+" "+custCity+" "+zip);
	/*JLabel phono = new JLabel();
	phono.setText("Customer's Phone number: " +" "+ phoneFmt.format(phoneNo));*/
	JLabel custemail = new JLabel();
	custemail.setText("Customer's email: "+" "+ email);
	JLabel guest = new JLabel();
	guest.setText("Amount of Guest: "+" "+ guestAmnt + " - "+" $"+pricePerG);
	JLabel totalAmnt = new JLabel();
	totalAmnt.setText("TOTAL: "+" $"+total);
	
	window.add(title);
	window.add(reserveName);
	window.add(customerAdd);
	//window.add(phono);
	window.add(custemail);
	window.add(guest);
	window.add(totalAmnt);
	
	title.setBounds(15, 2, 400, 100);
	reserveName.setBounds(15, 20, 400, 100);
	customerAdd.setBounds(15, 40, 400, 100);
	//phono.setBounds(15, 60, 300, 100);
	custemail.setBounds(15, 60, 400, 100);
	guest.setBounds(15, 80, 400, 100);
	totalAmnt.setBounds(15, 100, 400, 100);
	
	}
	
}
