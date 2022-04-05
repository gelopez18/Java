import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Map.Entry;
public class remove {
	int	keyToRemove;
	public static void removeMenu (char answer, HashMap<Integer, String> countriesMap, int keyToRemove) { 
		@SuppressWarnings("resource")
		Scanner userInput = new Scanner(System.in);
		System.out.println("would you like to remove all your data? [y/n] press M to go back");
	do {
		answer = userInput.next().charAt(0);
		if (answer =='y'||answer=='Y') {// remove all mapping entries from the countriesMap and display the resulting content of the HashMap
			countriesMap.clear();
			System.out.println("UPDATED DATA:");
			display(countriesMap);// Display the content using Iterator.
			System.out.println();
			System.out.println("press M to go back");
			
		}else if((answer =='n'||answer=='N')) {// remove Australia and Mexico from the countriesMap
			System.out.println("If you would like to remove only one entry,");
			System.out.println("please enter the key to be removed");
			keyToRemove = Integer.parseInt(userInput.next());
			countriesMap.remove(keyToRemove);
			System.out.println("UPDATED DATA:");
			display(countriesMap);// Display the content using Iterator.
			System.out.println();
		}
		}while(answer =='y'||answer=='Y'||answer =='n'||answer=='N');
}
	/* Display the content using Iterator. See the Iterators video in
	 *  Week 5 media resources and a sample in the Doc Sharing area.*/
	public static void display(HashMap<Integer, String> countriesMap){
		Iterator<Entry<Integer, String>>itr = countriesMap.entrySet().iterator();
	      while(itr.hasNext()) {
	         Object element = itr.next();
	         System.out.println(element + " ");
	      }
	}
}