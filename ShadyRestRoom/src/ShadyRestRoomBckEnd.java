import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;


public class ShadyRestRoomBckEnd {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Client info");
		
		String csName = input.next();
		String csEmail = input.next();
		int reservDate = Integer.parseInt(input.next());
		
		
		HashMap<Integer, ArrayList<String>> clientInfo = new HashMap<Integer, ArrayList<String>>();
		ArrayList<String> csInfo = new ArrayList<String>();
		
		csInfo.add(csName);
		csInfo.add(csEmail);
		csInfo.add(String.valueOf(reservDate));
		clientInfo.put(001, csInfo);
		System.out.println(clientInfo);
		
		
		
	}

}
