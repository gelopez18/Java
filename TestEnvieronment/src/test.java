import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class test {

	public static void main(String[] arg) {
		//setting variables to get the result of the rates
				final double locationPrice = 90.00;
				double onePersonSub = 40.00, morePersonSub =75.00;
				double petPrice = 95.00;
				//add the frame of the window where everything is going to be display
				JFrame window = new JFrame("window");
				//set setting for the window
				window.setVisible(true);
				window.setSize(800, 600);
				window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				window.setLocation(50, 50);
				window.setLayout(null);
				//create the labels that will be on the window
				JLabel userName = new JLabel ("Please enter your name:");
				JLabel usersEmail = new JLabel("Enter email Address:");
				JLabel usersPhoneNum = new JLabel ("Enter valid Phone number:");
				//create the input area 
				JTextArea userNameInput = new JTextArea("Name");
				JTextArea usersEmailInput = new JTextArea("someone@email.com");
				JTextArea usersPhoneNumbInput = new JTextArea("(123)456-7894");
				//Create the checkbooks and buttons. 
				JCheckBox locationBox = new JCheckBox ("On Location", false);
				JCheckBox studioBox = new JCheckBox ("In Studio", false);
				JCheckBox onePersonBox = new JCheckBox("One human subject ",false);
				JCheckBox moreBox = new JCheckBox("Two or more human subjects ",false);
				JCheckBox petBox = new JCheckBox("Pet subject ", false);
				JButton estimate = new JButton ("Create estimate");
				
				//we add all the components to the window created. 
				window.add(userName);
				window.add(usersEmail);
				window.add(usersPhoneNum);
				window.add(userNameInput);
				window.add(usersEmailInput);
				window.add(usersPhoneNumbInput);
				window.add(locationBox);
				window.add(studioBox);
				window.add(petBox);
				window.add(onePersonBox);
				window.add(moreBox);
				window.add(estimate);
				
				//place them in a certain order and place in the window.
				userName.setBounds(15, 10, 200, 100);
				usersEmail.setBounds(15, 35, 300, 100);
				usersPhoneNum.setBounds(15, 60, 300, 100);
				locationBox.setBounds(75, 120, 100, 100);
				
				userNameInput.setBounds(175, 50, 400, 20);
				usersEmailInput.setBounds(175, 75, 400,20);
				usersPhoneNumbInput.setBounds(175, 100, 400, 20);
				
				studioBox.setBounds(200, 158, 100, 20);
				petBox.setBounds(300, 158, 100, 20);
				onePersonBox.setBounds(410, 158, 150, 20);
				moreBox.setBounds(560, 158, 200, 20);
				//we add the button and the event listener so we can perform the algorithm
				estimate.setBounds(600, 40, 125, 30);
				estimate.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						//we set variables and get the information the user inputs. 
						String name = userNameInput.getText();
						String email = usersEmailInput.getText();
						String phone = usersPhoneNumbInput.getText();
						
						JLabel results = new JLabel();
						results.setText(name + "    " + email + "    " + phone);
						window.add(results);
						results.setBounds(15, 175, 500, 100);
						//we evaluate the input on the checkboxes from the user. and display the results of the estimate
						
					 if(locationBox.isSelected() == true) {
						 JLabel locOutput = new JLabel ();
						locOutput.setText("On Location" + " " + "$"+locationPrice);
						 window.add(locOutput);
						 locOutput.setBounds(15, 200, 300, 100);
					 }
					 
					 if(onePersonBox.isSelected() == true && studioBox.isSelected() == true) {
						 JLabel studioOutput = new JLabel ("On studio");
						 window.add(studioOutput);
						 studioOutput.setBounds(15, 230, 300, 100);
						 JLabel personOutput = new JLabel ("1 subject" + " " + "$"+ onePersonSub);
						 window.add(personOutput);
						 personOutput.setBounds(15, 260, 300, 100);
					 }
					 if(moreBox.isSelected() == true && studioBox.isSelected() == true) {
					 	JLabel studioOutput = new JLabel ("On studio");
					 	window.add(studioOutput);
					 	studioOutput.setBounds(15, 230, 300, 100);
						JLabel moreOutput = new JLabel ("More than 1 subject" + " "+ "$"+morePersonSub);
						 window.add(moreOutput);
						 moreOutput.setBounds(15, 290, 300, 100);
					 }
					 if(petBox.isSelected() == true ) {
						 JLabel petOutput = new JLabel ("Pet subject" + " "+ "$" + petPrice);
						 window.add(petOutput);
						 petOutput.setBounds(15, 320, 300, 100);
					 }
					}
				});	
			}
	}
	

