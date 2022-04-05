import java.util.*;
public class HashMapDemo extends remove{
		public static void main(String[] args) {
			char answer;
			String newCountry;
			int keyCountry;
			int	keyToRemove = 0;
			HashMap<Integer, String> countriesMap = new HashMap<Integer, String>();
			countriesMap.put(1, "USA");
			countriesMap.put(2, "Mexico");
			countriesMap.put(5, "France");
			countriesMap.put(21, "India");
			countriesMap.put(49, "Australia");
			@SuppressWarnings("resource")
			Scanner userInput = new Scanner(System.in);
			// Display the content using Iterator. 
			display(countriesMap);
			do {	System.out.println();
					System.out.println("Please choose one Option:");
					System.out.println("To add a Country - A");
					System.out.println("To remove a Country - R ");
					System.out.println("To display a country - D");
					System.out.println("To count the countries - C");
					System.out.println("Please enter X to Exit");
					answer = userInput.next().charAt(0);
						if(answer == 'a'||answer =='A') {// continue adding 5 more key-value pairs
							System.out.println("Please enter the key to add:");
							keyCountry = Integer.parseInt(userInput.next());
							System.out.println("Please enter the country to add:");
							newCountry = userInput.next();
							countriesMap.put(keyCountry, newCountry);
							countriesMap.forEach((k, v) -> System.out.println(v + " : " + (k)));// Display the content of modified countriesMap
						}else if (answer =='R'||answer=='r') {
							removeMenu(answer, countriesMap, keyToRemove);
						}else if (answer =='d'||answer=='D') {// get and display the country based on the key value : accept the key value = 49
							System.out.println("please enter the key to look up");
							keyCountry = Integer.parseInt(userInput.next());
							System.out.println("Country:");
							System.out.println(countriesMap.get(keyCountry));
						}else if (answer =='c'||answer=='C') {// determine and display how many countries are left in the HashMap
							System.out.println("DATA SIZE:");
							System.out.println(countriesMap.size());
						}
			}while(answer =='a'||answer =='A'||answer =='r'||answer=='R'||answer =='d'||answer=='D'||answer =='c'||answer=='C');		
		}
}
