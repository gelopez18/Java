package guest;
import java.util.ArrayList;
import java.util.Scanner;

public class guestList {public static void main(String[] args) {
	char answ;
	//create the arrayList instructed 
	ArrayList<guest> nameList = new ArrayList<guest>();
	 //instantiate 5 objects from the Guest class as  instructed
	guest guest1 = new guest("John", "Doe");
	guest guest2 = new guest("Mary", "Smith");
	guest guest3 = new guest("Jose", "Mariona");
	guest guest4 = new guest("Emilio", "Escobar");
	guest guest5 = new guest("Arminio", "Contreras");
	//add this 5 objects to the arrayList
	nameList.add(guest1);
	nameList.add(guest2);
	nameList.add(guest3);
	nameList.add(guest4);
	nameList.add(guest5);
	displayGuests(nameList);
	/*I created a do while loop that will run 
	 * meanwhile the user wants to make change
	 * to the database
	 */
	@SuppressWarnings("resource")
	Scanner input = new Scanner(System.in);
	do {
		//prompt the user to get an input of the following menu
			System.out.println();
			System.out.println("Please choose One of the option:" );
			System.out.println("A - Add more New guest, D - Delete Guest, C - Change name of user, X - Exit");
			System.out.println();
				answ = input.next().charAt(0);
				System.out.println();
		/*Once we get the user's input I created if and else
		  to analyze the user's input*/
	if(answ == 'a' || answ == 'A'){
			/*If the customer would like to add another user
			 * we prompt the user to give the new name and 
			 */
			@SuppressWarnings("resource")
			Scanner inputNewName = new Scanner(System.in);
			// allocated in new variables 
			System.out.println("Please add New guest First Name and Last Name" );
			String newFName = inputNewName.next(); 
			String newLName = inputNewName.next();
			// and pass this on to the constructor to allocate them in the variables
			guest guest6 = new guest(newFName, newLName); 
			nameList.add(guest6); // then add them in the arrayList
			displayGuests(nameList); //we then print array from the display method
			System.out.println(); 
		}else if(answ == 'd' || answ == 'D'){
			
			@SuppressWarnings("resource")
			Scanner inputIndex = new Scanner(System.in);
			/* if the customer wants to delete and input Prompt the user
			 * to enter the No of the Guest that wants to be deleted */
			System.out.println("Please enter the order number you want to remove" );
			int ans = inputIndex.nextInt(); // allocate the information on an variable
			nameList.remove(ans - 1); // we subtract the 1 to get the accurate information of the element and remove it 
			displayGuests(nameList);//display the results after this has been modified
			System.out.println();
			
		}else if(answ == 'c' || answ == 'C'){
			/*If the user need to change and existing input
			 * they choose this option*/
			@SuppressWarnings("resource")
			Scanner inputIndex = new Scanner(System.in);
			//prompt the user to choose first the No of the Guest that wants to get change
			System.out.println("Please choose guest No." );
			int answer = inputIndex.nextInt();
			guest guestN = nameList.get(answer - 1); //access the list and get the spot
			//then prompt the user's to change the name of existing users 
			System.out.println("Enter New First Name and Last Name" );
			String newFName = inputIndex.next();
			String newLName = inputIndex.next();
			//set the new information store on new variables to the old variables
			guestN.setFName(newFName);
			guestN.setLName(newLName);
			//display the results
			displayGuests(nameList);
			System.out.println();
		}
	} while(answ =='a'|| answ == 'A'|| answ =='d'|| answ == 'D'|| answ =='c'|| answ == 'C');
		
}

static void displayGuests(ArrayList<guest> nameList)  {
	for(int index  = 0; index < nameList.size(); index++) {
		guest currentGuest = nameList.get(index);
		System.out.println ("Registered Guest "+ (index+1) +": " +  currentGuest.getFName()   + " " + currentGuest.getLName());
		}/* we display the list No for to make it easier to the user to find the No of the guest*/
	}




}
